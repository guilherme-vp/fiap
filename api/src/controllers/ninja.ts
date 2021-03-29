import { Request, Response } from 'express'
import { prisma } from 'database'
import { Ninja } from 'models'

export class NinjaController {
	async create(req: Request, res: Response): Promise<Response<Ninja>> {
		const { nome, idade, vila, nivel } = req.body

		const findVila = await prisma.vila.findFirst({
			where: {
				nome: vila
			}
		})

		if (!findVila) {
			return res.status(404).json({
				error: 'Essa vila não existe.'
			})
		}

		const createNinja = await prisma.ninja.create({
			data: {
				idade,
				nome,
				nivel,
				vilaId: findVila.id
			},
			include: {
				Vila: true
			}
		})

		const createdNinjas = await prisma.ninja.findUnique({
			where: { id: createNinja.id },
			include: {
				Vila: true
			}
		})

		return res.json(createdNinjas)
	}

	async getNinja(req: Request, res: Response): Promise<Response<Ninja | Ninja[]>> {
		const { nome: ninjaName } = req.query

		if (ninjaName) {
			const findNinja = await prisma.ninja.findFirst({
				where: { nome: ninjaName as string }
			})

			if (!findNinja) {
				return res.status(404).json({
					error: 'Nenhum ninja encontrado.'
				})
			}

			return res.json(findNinja)
		}

		const findNinjas = await prisma.ninja.findMany({
			orderBy: {
				id: 'asc'
			},
			include: {
				Vila: true
			}
		})

		return res.json(findNinjas)
	}
}

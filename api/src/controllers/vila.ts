import { prisma } from 'database'
import { Request, Response } from 'express'
import { Vila } from 'models'

export class VilaController {
	async get(req: Request, res: Response): Promise<Response<Vila | Vila[]>> {
		const { nome: vilaName } = req.query

		if (vilaName) {
			const findVila = await prisma.vila.findFirst({
				where: { nome: vilaName as string },
				include: {
					Ninja: true
				}
			})

			if (!findVila) {
				return res.status(404).json({
					error: 'Nenhuma vila encontrada.'
				})
			}

			return res.json(findVila)
		}

		const findVilas = await prisma.vila.findMany({
			orderBy: {
				id: 'asc'
			},
			include: {
				Ninja: true
			}
		})

		return res.json(findVilas)
	}
}

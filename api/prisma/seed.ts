import { PrismaClient } from '@prisma/client'
import { vilas } from './vilas'

const prisma = new PrismaClient()

async function main() {
	for (let vila of vilas) {
		await prisma.vila.create({
			data: vila
		})
	}
}

main()
	.catch(e => {
		console.error(e)
		process.exit(1)
	})
	.finally(async () => {
		await prisma.$disconnect()
	})

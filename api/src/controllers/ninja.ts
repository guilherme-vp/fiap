export class Ninja {
	async create(req, res) {
		const { nome, idade, vila, nivel } = req.body

		return res.json(req.body)
	}

	async get(req, res) {
		const { nome } = req.params

		const users = [
			{
				nome: 'Guilherme',
				idade: 19,
				vila: 'Folha',
				nivel: 'Shinobi'
			}
		]

		const receivedUser = users.filter(user => user.nome === nome)

		return res.json(receivedUser)
	}
}

import { Ninja } from 'controllers/ninja'
import { Router } from 'express'

const ninjaController = new Ninja()

export const routes = Router()

routes.post('/create', ninjaController.create)
routes.get('/receive/:nome', ninjaController.get)

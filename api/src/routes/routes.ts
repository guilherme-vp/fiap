import { NinjaController } from 'controllers/ninja'
import { VilaController } from 'controllers/vila'
import { Router } from 'express'

const ninjaController = new NinjaController()
const vilaController = new VilaController()

const routes = Router()

routes.post('/ninja', ninjaController.create)
routes.get('/ninja', ninjaController.getNinja)
routes.get('/vila', vilaController.get)

export default routes

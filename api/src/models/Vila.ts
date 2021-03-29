import { Ninja } from './Ninja'

type Shinobis = 'Hokage' | 'Raikage' | 'Mizukage' | 'Tsuchikage' | 'Kazekage'

export interface Vila {
	nome: string
	lider: string
	shinobi: Shinobis
	ninjas?: Ninja[]
}

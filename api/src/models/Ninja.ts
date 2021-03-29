import { Vila } from './Vila'

export interface Ninja {
	nome: string
	idade: number
	vila: Vila
	nivel: 'academia' | 'gennin' | 'chunnin' | 'jonnin' | 'anbu' | 'kunoichi'
}

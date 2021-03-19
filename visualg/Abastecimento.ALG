Algoritmo "Abastecimento"
// Disciplina   : [Linguagem e Lógica de Programação]
// Descriçãoo   : Realiza a conversão da temperatura em graus Celsius para Fahrenheit
// Autor(a)    : Guilherme Vieira de Paiva
// Data atual  : 12/03/2021
Var
valorCombustivel, valorTotal, resultado: real

Inicio
escreva("Insira o preço do litro do combustível: R$")
leia(valorCombustivel)

escreva("Insira o valor abastecido: R$")
leia(valorTotal)

resultado := valorTotal/valorCombustivel

escreva("Q quantidade em litros a ser comprada é de: ", resultado:2:2, "litros")

Fimalgoritmo
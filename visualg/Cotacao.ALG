Algoritmo "cotacao"
// Disciplina   : [Linguagem e Lógica de Programação]
// Descrição   : Realiza a cotação de reais para dólares
// Autor(a)    : Guilherme Vieira de Paiva
// Data atual  : 12/03/2021
Var
cotacaoDolar, valorReais, valorDolares: real

Inicio
escreva("Digite o valor de cotação do dólar: ")
leia(cotacaoDolar)

escreva("Digite a quantidade em reais: ")
leia(valorReais)

valorDolares := valorReais/cotacaoDolar

escreva("O valor de", valorReais,  " reais na cotação de", cotacaoDolar, " é de:", valorDolares, " dólares.")
Fimalgoritmo
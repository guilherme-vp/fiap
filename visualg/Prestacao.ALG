Algoritmo "prestacao"
// Disciplina   : [Linguagem e Lógica de Programação]
// Descrição   : Calcula o volume de uma lata de óleo
// Autor(a)    : Guilherme Vieira de Paiva
// Data atual  : 12/03/2021
Var
valorBoleto, dias: inteiro
jurosPorcentagem, totalValor: real

Inicio
escreva("Digite o valor do boleto: ")
leia(valorBoleto)

escreva("Digite o valor dos juros em porcentagem: ")
leia(jurosPorcentagem)

escreva("Digite o número de dias passados: ")
leia(dias)

totalValor := valorBoleto + (valorBoleto * (jurosPorcentagem/100)) * dias

escreva("O valor final a ser pago é de: R$", totalValor)
Fimalgoritmo
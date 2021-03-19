Algoritmo "volume"
// Disciplina   : [Linguagem e Lógica de Programação]
// Descrição   : Calcula o volume de uma lata de óleo
// Autor(a)    : Guilherme Vieira de Paiva
// Data atual  : 12/03/2021
Var
raio, altura: inteiro
volume: real

Inicio
escreva("Digite o valor do raio da lata: ")
leia(raio)

escreva("Digite a altura da lata: ")
leia(altura)

volume := 3.14 * raio^2 * altura

escreva("O volume da lata de óleo é de:", volume, "m³")
Fimalgoritmo
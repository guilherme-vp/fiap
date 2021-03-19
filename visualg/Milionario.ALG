Algoritmo "milionario"
// Disciplina   : [Linguagem e Lógica de Programação]
// Descrição   : Calcula o valor de sobra e o tempo necessário para se tornar um milionário
// Autor(a)    : Guilherme Vieira de Paiva
// Data atual  : 12/03/2021
Var
valorSalario, despesasMensais, sobra, anos: real

Inicio
escreva("Digite o valor de seu salário: ")
leia(valorSalario)

escreva("Digite o valor das suas despesas mensais: ")
leia(despesasMensais)

sobra := valorSalario - despesasMensais
escreval("O valor total de sobra é de:", sobra, " reais.")

anos := (1000000/sobra) / 12
escreva("Para se tornar um milionário, você precisaria poupar ", anos:2:0, " anos de seu salário. FORÇA GUERREIRO(A)!!")
Fimalgoritmo
salario = float(input("Digite o valor do seu salário: R$ "))
despesas = float(input("Digite o valor das suas despesas mensais: R$ "))

sobra = salario - despesas
print("O valor total de sobra é de: R$", sobra)

anos = round((1000000/sobra)/12, 1)
print("Para se tornar um milionário, você precisaria poupar",
      anos, 'anos de seu salário. FORÇA GUERREIRO(A)!')

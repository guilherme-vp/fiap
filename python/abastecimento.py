valorAbastecimento = float(input("Insira o valor de abastecimento: R$ "))
valorCombustivel = float(input("insira o preço do litro do combustível: R$ "))

resultado = round(valorAbastecimento/valorCombustivel)

if resultado == 1:
    print("Você comprará", resultado, "litro")
else:
    print("Você comprará", resultado, "litros")

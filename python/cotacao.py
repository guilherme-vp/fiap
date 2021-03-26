cotacaoDolar = float(input("Digite o valor de cotação do dólar: "))
valorReais = float(input("Digite a quantidade em reais: "))

dolares = round(valorReais/cotacaoDolar, 2)

print("O valor de", valorReais, "reais na cotação do dólar de",
      cotacaoDolar, "é de", dolares, "dólares.")

boleto = int(input("Digite o valor do boleto: "))

jurosPorcentagem = int(input("Digite o valor dos juros em porcentagem: "))

dias = int(input("Digite o número de dias passados: "))

total = boleto + (boleto * (jurosPorcentagem/100)) * dias

print("O valor final a ser pago é de: R$", total)

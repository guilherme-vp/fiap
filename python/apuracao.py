candidatoA = int(
    input("Insira a quantidade de eleitores que votaram no candidato A: "))
candidatoB = int(
    input("Insira a quantidade de eleitores que votaram no candidato B: "))
candidatoC = int(
    input("Insira a quantidade de eleitores que votaram no candidato C: "))
votosBrancos = int(input("Insira a quantidade de votos em branco: "))
votosNulos = int(input("Insira a quantidade de votos nulos: "))

totalVotos = candidatoA + candidatoB + candidatoC + votosBrancos + votosNulos

print("\nO número total de eleitores é de:", totalVotos)

porcentualCandidatoA = candidatoA/totalVotos * 100
porcentualCandidatoB = candidatoB/totalVotos * 100
porcentualCandidatoC = candidatoC/totalVotos * 100
porcentualBranco = votosBrancos/totalVotos * 100
porcentualNulos = votosNulos/totalVotos * 100

print("O porcentual de votos que o candidato A recebeu é de:",
      round(porcentualCandidatoA))
print("O porcentual de votos que o candidato B recebeu é de:",
      round(porcentualCandidatoB))
print("O porcentual de votos que o candidato C recebeu é de:",
      round(porcentualCandidatoC))
print("O porcentual de votos brancos é de:", round(porcentualBranco))
print("O porcentual de votos nulos é de:", round(porcentualNulos))

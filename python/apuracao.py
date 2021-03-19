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

porcentualCandidatoA = round(candidatoA/totalVotos * 100)
porcentualCandidatoB = round(candidatoB/totalVotos * 100)
porcentualCandidatoC = round(candidatoC/totalVotos * 100)
porcentualBranco = round(votosBrancos/totalVotos * 100)
porcentualNulos = round(votosNulos/totalVotos * 100)

print("O porcentual de votos que o candidato A recebeu é de:",
      porcentualCandidatoA, "%")
print("O porcentual de votos que o candidato B recebeu é de:",
      porcentualCandidatoB, "%")
print("O porcentual de votos que o candidato C recebeu é de:",
      porcentualCandidatoC, "%")
print("O porcentual de votos brancos é de:", porcentualBranco, "%")
print("O porcentual de votos nulos é de:", porcentualNulos, "%")

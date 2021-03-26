nomeAtendente = input("Digite o nome do(a) recepcionista: ")
qtdYoga = int(
    input("Digite a quantidade de pessoas que frequentaram a atividade de yoga: "))
qtdNatacao = int(input(
    "Digite a quantidade de pessoas que frequentaram a atividade de natação: "))
qtdHidro = int(input(
    "Digite a quantidade de pessoas que frequentaram a atividade de hidroginástica: "))
qtdGinastica = int(input(
    "Digite a quantidade de pessoas que frequentaram a atividade de ginástica artística: "))
qtdTotal = qtdYoga + qtdGinastica + qtdHidro + qtdNatacao


def getPorcentagem(qtd):
    porcentagemTotal = round(qtd/qtdTotal * 100, 2)
    return porcentagemTotal


porcYoga = getPorcentagem(qtdYoga)
porcNatacao = getPorcentagem(qtdNatacao)
porcHidro = getPorcentagem(qtdHidro)
porcGinastica = getPorcentagem(qtdGinastica)


print('Prezado(a) ' + nomeAtendente + '.\nNa data de hoje,', qtdTotal,
      'pessoas frequentaram o Clube de Campo Viver a vida com alegria.\n',
      porcYoga, '% da atividade YOGA\n',
      porcNatacao, '% da atividade NATAÇÃO\n',
      porcHidro, '% da atividade HIDROGINÁSTICA\n',
      porcGinastica, '% da atividade GINÁSTICA ARTÍSTICA')

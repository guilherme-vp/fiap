package aula2.src;

import aula2.src.Computador.Computador;

public class TesteComputador {
  public static void main(String[] args) {
    Computador pc1 = new Computador();
    Computador pc2 = new Computador();

    pc1.processador = "Intel i7";
    pc2.processador = "AMD Ryzen 5";

    pc1.configurarComputador("Intel i9", true, 1000, "B450M", 3000);

    System.out.println(("Processador do pc1: " + pc1.processador));
    System.out.println(("Processador do pc2: " + pc2.processador));

    String conf1 = pc1.retornarConfiguracao();
    System.out.println("Pc1: " + conf1);

    String conf2 = pc2.retornarConfiguracao();
    System.out.println("Pc2: " + conf2);

    double precoComDesconto = conf1.length();

    System.out.println("Preço com desconto do pc1: " + precoComDesconto);
  }
}

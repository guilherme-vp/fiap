package aula2.src;

import java.util.Scanner;

import aula2.src.Computador.Computador;

public class EntradaComputador {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    System.out.print("Digite o processador: ");
    String processador = leitor.next() + leitor.nextLine();

    System.out.print("Tem placa de vídeo? (true/false): ");
    boolean placaVideo = leitor.nextBoolean();

    System.out.print("Tamanho do HD: ");
    int hd = leitor.nextInt();

    System.out.print("Placa mãe: ");
    String placaMae = leitor.next() + leitor.nextLine();

    System.out.print("Preço: ");
    double preco = leitor.nextDouble();

    Computador pc = new Computador();

    pc.configurarComputador(processador, placaVideo, hd, placaMae, preco);

    String configuracao = pc.retornarConfiguracao();
    System.out.println(configuracao);

    System.out.print("Digite o desconto: (%)");
    double desconto = leitor.nextDouble();

    double valor = pc.calcularDesconto(desconto);

    System.out.println("Valor com desconto: " + valor);

    leitor.close();
  }
}

package aula2.src.Computador;

public class Computador {
  public String processador;
  public Boolean placaVideo;
  public String placaMae;
  public int HD;
  public double preco;

  public String retornarConfiguracao() {
    String result = "Processador: " + processador + ", Placa de Vídeo" + placaVideo + ", HD: " + HD + ", Placa mãe: "
        + placaMae + "e Preço: " + preco;

    return result;
  }

  public void configurarComputador(String processador, boolean placaVideo, int hd, String placaMae, double preco) {
    processador = this.processador;
    placaVideo = this.placaVideo;
    hd = this.HD;
    placaMae = this.placaMae;
    preco = this.preco;
  }

  public double calcularDesconto(double desconto) {
    double valorFinal = this.preco + (this.preco * desconto / 100);

    return valorFinal;
  }
}
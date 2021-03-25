package elevador;

public class Elevador {
  public int andar = 0;
  public int totalAndares;
  public int capacidadeMax;
  public int capacidade = 0;

  public void inicializa(int setCapacidadeMax, int setTotalAndares) {
    this.capacidadeMax = setCapacidadeMax;
    this.totalAndares = setTotalAndares;
  }

  public void entra() {
    if (this.capacidade == this.capacidadeMax) {
      System.out.println("O elevador já está com sua capacidade máxima!");
    } else {
      this.capacidade++;
    }
  }

  public void sai() {
    if (this.capacidade == 0) {
      System.out.println("O elevador não tem nenhuma pessoa!");
    }
    this.capacidade--;
  }

  public void sobe() {
    if (this.andar == this.totalAndares) {
      System.out.println("O elevador já está no último andar.");
    } else {
      this.andar++;
    }
  }

  public void desce() {
    if (this.andar == 0) {
      System.out.println("O elevador já está no térreo.");
    } else {
      this.andar--;
    }
  }
}

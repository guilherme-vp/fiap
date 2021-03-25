package pessoa;

public class Pessoa {
  public String nome;
  public int idade;
  public double altura;

  public void set(String setNome, int setIdade, double setAltura) {
    this.nome = setNome;
    this.idade = setIdade;
    this.altura = Math.floor(setAltura);
  }

  public void get() {
    System.out.println("A pessoa criada se chamada: " + this.nome + ", tem " + this.idade + "anos de idade e "
        + this.altura + "cm de altura.");
  }
}

package pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa newPerson = new Pessoa();
        newPerson.set("Guilherme", 19, 1.73);

        newPerson.get();
    }
}

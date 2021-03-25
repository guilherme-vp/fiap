package elevador;

public class App {
    public static void main(String[] args) throws Exception {
        Elevador newElevador = new Elevador();
        newElevador.inicializa(5, 5);

        for (int i = 0; i < 6; i++) {
            newElevador.entra();
            newElevador.sobe();
        }

        for (int i = 0; i < 6; i++) {
            newElevador.sai();
            newElevador.desce();
        }       
    }
}
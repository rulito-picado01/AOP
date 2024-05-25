package herencia;

public class Main {
    public static void main(String[] args) {
        var castrilli = new Arbitro("Castrilli");
        var elDiego = new Jugador("Diego", new Registracion());
        elDiego.insultarA(castrilli, "lppp...");
    }
}
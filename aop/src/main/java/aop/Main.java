package aop;

public class Main {
    public static void main(String[] args) {
        var castrilli = new Arbitro("Castrilli");
        var elDiego = new Jugador("Diego");
        elDiego.insultarA(castrilli, "lppp...");

        var ayudante = new AyudanteDeCampo();
        var entrenador = new Entrenador("Coco");
        entrenador.dialogarCon(ayudante, "Cambiemos el 4 que tiene amarilla ...");
    }
}
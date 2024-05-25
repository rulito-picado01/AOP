package herencia;

public class Jugador extends PersonaDelFutbol {
    public Jugador(String nombre, Registracion registracion) {
        super(nombre, registracion);
    }

    // supongamos que esta clase tiene otras responsabilidades
    // si no, no tendria razon de ser
}

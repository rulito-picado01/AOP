package herencia;

public class Dirigente extends PersonaDelFutbol {
    public Dirigente(String nombre, Registracion registracion) {
        super(nombre, registracion);
    }

    // supongamos que esta clase tiene otras responsabilidades
    // si no, no tendria razon de ser
}

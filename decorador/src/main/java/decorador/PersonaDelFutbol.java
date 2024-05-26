package decorador;

public class PersonaDelFutbol implements Futbolista {
    protected String nombre;

    public PersonaDelFutbol(String nombre) {
        this.nombre = nombre;
    }

    public void insultarA(Arbitro unArbitro, String insulto) {
        unArbitro.escuchar(insulto);
    }
}

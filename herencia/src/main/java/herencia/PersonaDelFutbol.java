package herencia;

public class PersonaDelFutbol {
    protected String nombre;
    protected Registracion registracion;

    public PersonaDelFutbol(String nombre, Registracion registracion) {
        this.nombre = nombre;
        this.registracion = registracion;
    }

    public void insultarA(Arbitro unArbitro, String insulto) {
        unArbitro.escuchar(insulto);
        this.registracion.registrar(insulto);
    }
}

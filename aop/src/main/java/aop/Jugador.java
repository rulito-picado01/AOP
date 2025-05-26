package aop;

public class Jugador {
    private String nombre;

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    @RegistrarInsulto
    public void insultarA(Arbitro unArbitro, String insulto) {
        unArbitro.escuchar(insulto);
    }

    public String nombre() {
        return nombre;
    }
}

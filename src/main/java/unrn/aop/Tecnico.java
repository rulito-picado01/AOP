package unrn.aop;

public class Tecnico {
    private String nombre;

    public Tecnico(String nombre) {
        this.nombre = nombre;
    }

    public void insultarA(Arbitro unArbitro, String insulto) {
        //Se para del banco, hace algo y luego:
        unArbitro.escuchar(insulto);
    }
}

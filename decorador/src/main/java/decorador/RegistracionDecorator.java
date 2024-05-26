package decorador;

public class RegistracionDecorator implements Futbolista {

    private Futbolista futbolista;

    public RegistracionDecorator(Futbolista futbolista) {
        this.futbolista = futbolista;
    }

    public void registrar(String insulto) {
        System.out.println("Registrando Insulto: " + insulto);
    }

    @Override
    public void insultarA(Arbitro unArbitro, String insulto) {
        this.futbolista.insultarA(unArbitro, insulto);
        this.registrar(insulto);
    }
}
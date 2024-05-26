package observer;

public class Registracion implements Observer {

    @Override
    public void actualizar(String data) {
        System.out.println("Registrando Insulto: " + data);

    }
}
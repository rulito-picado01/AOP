package observer;

import java.util.List;

public class PersonaDelFutbol extends Subject {
    protected String nombre;

    public PersonaDelFutbol(String nombre, List<Observer> observers) {
        super(observers);
        this.nombre = nombre;
    }

    public void insultarA(Arbitro unArbitro, String insulto) {
        unArbitro.escuchar(insulto);
        this.notificar(insulto);
    }
}

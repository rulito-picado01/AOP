package observer;

import java.util.List;

public class Dirigente extends PersonaDelFutbol {
    public Dirigente(String nombre, List<Observer> observers) {
        super(nombre, observers);
    }

    // supongamos que esta clase tiene otras responsabilidades
    // si no, no tendria razon de ser
}

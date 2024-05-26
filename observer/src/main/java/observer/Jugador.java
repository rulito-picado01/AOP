package observer;

import java.util.List;

public class Jugador extends PersonaDelFutbol {
    public Jugador(String nombre, List<Observer> observers) {
        super(nombre, observers);
    }

    // supongamos que esta clase tiene otras responsabilidades
    // si no, no tendria razon de ser
}

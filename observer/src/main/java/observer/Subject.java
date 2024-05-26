package observer;

import java.util.List;

public abstract class Subject {
    private List<Observer> observers;

    public Subject(List<Observer> observers) {
        this.observers = observers;
    }

    protected void notificar(String data) {
        observers.stream().forEach(o -> o.actualizar(data));
    }
}

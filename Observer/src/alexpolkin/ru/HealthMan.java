package alexpolkin.ru;

import java.util.ArrayList;
import java.util.List;

public class HealthMan implements Observed {

    int temp;
    int pressure;

    List<Observer> observers = new ArrayList<>();

    public void setHealth(int temp, int pressure){
        this.temp = temp;
        this.pressure = pressure;
        notifyObserver();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers){
            observer.handleEvent(temp, pressure);
        }
    }
}

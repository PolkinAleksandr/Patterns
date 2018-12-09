package alexpolkin.ru;

public class OneObserver implements Observer {
    @Override
    public void handleEvent(int temp, int pressure) {
        System.out.println("Temperature: " + temp + ". Pressure: " + pressure);
    }
}

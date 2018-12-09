package alexpolkin.ru;

public class Main {

    public static void main(String argv[]) {

        HealthMan healthMan = new HealthMan();

        healthMan.addObserver(new OneObserver());

        healthMan.setHealth(15, 60);
    }
}

package alexpolkin.ru;

public class CarFactory {

    private String engine;

    public CarFactory() {}

    public CarFactory(String engine) {
        this.engine = engine;
    }

    public String getEngine() {
        return engine;
    }
}

package alexpolkin.ru;

public class MotoFactory {

    private String engine;

    public MotoFactory() {}

    public MotoFactory(String engine) {
        this.engine = engine;
    }

    public String getEngine() {
        return engine;
    }
}

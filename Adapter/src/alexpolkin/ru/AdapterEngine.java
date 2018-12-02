package alexpolkin.ru;

public class AdapterEngine extends CarFactory {

    private MotoFactory moto;

    public AdapterEngine(MotoFactory moto) {
        this.moto = moto;
    }

    @Override
    public String getEngine() {
        return "Change engine on a car";
    }
}

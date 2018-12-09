package alexpolkin.ru;

public class RadioDFM implements IStation{

    @Override
    public void play() {
        System.out.println("Radio DFM");
    }

    @Override
    public IStation nextStation() {
        return new RadioRoad();
    }
}

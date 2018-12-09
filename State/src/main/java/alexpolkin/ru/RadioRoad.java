package alexpolkin.ru;

public class RadioRoad implements IStation {

    @Override
    public void play() {
        System.out.println("Radio Road");
    }

    @Override
    public IStation nextStation() {
        return new RadioDFM();
    }
}

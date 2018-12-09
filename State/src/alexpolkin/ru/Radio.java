package alexpolkin.ru;

public class Radio {

    public IStation station;
    public void nextStation(){
        station = station.nextStation();
    }

    public void play(){
        station.play();
    }
}

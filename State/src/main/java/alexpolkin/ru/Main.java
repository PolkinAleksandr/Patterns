package alexpolkin.ru;

public class Main {

    public static void main(String argv[]) {
        Radio radio = new Radio();
        radio.station = new RadioDFM();
        radio.play();
        radio.nextStation();
        radio.play();
    }
}

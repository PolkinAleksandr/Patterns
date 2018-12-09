package alexpolkin.ru;

public class ImageButton implements AllButtons{

    @Override
    public void changeColorOnBlue() {
        System.out.println("changeColorOnBlue ImageButton");
    }

    @Override
    public void changeColorOnRed() {
        System.out.println("changeColorOnRed ImageButton");
    }
}

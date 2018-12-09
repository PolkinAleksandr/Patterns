package alexpolkin.ru;

public class Button implements AllButtons {
    @Override
    public void changeColorOnBlue() {
        System.out.println("changeColorOnBlue Button");
    }

    @Override
    public void changeColorOnRed() {
        System.out.println("changeColorOnRed Button");
    }
}

package alexpolkin.ru;

abstract class OnScreen {
    void show(){
        AllButtons buttons = createButton();
        buttons = createButton();
        buttons.changeColorOnRed();
        buttons.changeColorOnBlue();
    }

    abstract AllButtons createButton();
}

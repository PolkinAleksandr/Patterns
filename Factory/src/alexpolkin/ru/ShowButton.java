package alexpolkin.ru;

class ShowButton extends OnScreen {

    @Override
    AllButtons createButton() {
        return new Button();
    }
}

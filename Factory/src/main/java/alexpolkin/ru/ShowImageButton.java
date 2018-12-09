package alexpolkin.ru;

class ShowImageButton extends OnScreen {

    @Override
    AllButtons createButton() {
        return new ImageButton();
    }
}

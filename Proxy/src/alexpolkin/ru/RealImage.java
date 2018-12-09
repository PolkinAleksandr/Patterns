package alexpolkin.ru;

public class RealImage implements Image {

    String file;

    public RealImage(String file) {
        this.file = file;
        load();
    }

    private void load() {
        System.out.println("Загрузка " + file);
    }

    @Override
    public void display() {
        System.out.println("Просмотр " + file);
    }
}

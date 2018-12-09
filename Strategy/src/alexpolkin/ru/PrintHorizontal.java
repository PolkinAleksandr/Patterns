package alexpolkin.ru;

public class PrintHorizontal implements PrintStyle {
    @Override
    public void print(String text) {
        System.out.println("Горизонтальный вывод:");
        System.out.println(text);
    }
}

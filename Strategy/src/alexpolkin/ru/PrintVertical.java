package alexpolkin.ru;

public class PrintVertical implements PrintStyle {
    @Override
    public void print(String text) {
        System.out.println("Вертикальный вывод:");
        for (int i = 0; i < text.length(); i++){
            System.out.println(text.charAt(i));
        }
    }
}

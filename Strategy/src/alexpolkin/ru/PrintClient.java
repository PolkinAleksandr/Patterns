package alexpolkin.ru;

public class PrintClient {

    private PrintStyle printStyle;

    public void setStrategy(PrintStyle printStyle) {
        this.printStyle = printStyle;
    }

    public void executeStrategy(String text){
        printStyle.print(text);
    }
}

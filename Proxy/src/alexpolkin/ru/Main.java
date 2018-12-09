package alexpolkin.ru;

public class Main {

    public static void main(String argv[]){
        Image image = new ProxyImage("D:/images/img.jpg");
        image.display();
    }
}

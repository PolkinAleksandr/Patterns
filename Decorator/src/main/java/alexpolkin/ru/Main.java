package alexpolkin.ru;

public class Main {

    public static void main(String argv[]) {
        Decorator decorator = new DecoratorOne(new ComponenOne());
        decorator.doSomething();
        decorator.newSomething();
    }
}

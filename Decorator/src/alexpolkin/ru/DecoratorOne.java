package alexpolkin.ru;

public class DecoratorOne extends Decorator{


    public DecoratorOne(Component component) {
        super(component);
    }

    @Override
    public void doSomething() {
        System.out.println("something");
    }


    @Override
    public void newSomething() {
        System.out.println("new something");
    }
}

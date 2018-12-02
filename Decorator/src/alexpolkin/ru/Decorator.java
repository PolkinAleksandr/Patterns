package alexpolkin.ru;

public class Decorator implements Component {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void doSomething() {
        component.doSomething();
    }

    public void newSomething() {
        System.out.println("new something");
    }
}

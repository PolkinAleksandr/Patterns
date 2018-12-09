package alexpolkin.ru;

public class Restoraunt {

    private Waiter waiter;
    private Cook cook;

    public Restoraunt() {
        this.cook = new Cook();
        this.waiter = new Waiter();
    }

    public void openRestoraunt() {
        waiter.cleanUp();
        cook.toCook();
    }
}

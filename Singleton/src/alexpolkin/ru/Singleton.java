package alexpolkin.ru;

public class Singleton {

    private static Singleton single = new Singleton();

    private Singleton() {
    }

    public void doSomething(){
        System.out.print("do something");
    }

    public static Singleton getInstance(){
        if (single == null) {
            return new Singleton();
        }else{
            return single;
        }
    }
}

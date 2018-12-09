package alexpolkin.ru;

public class Singleton {

    private static final Object sync = new Object();
    private static volatile Singleton single = null;

    private Singleton() {
    }

    public void doSomething(){
        System.out.print("do something");
    }

    public static Singleton getInstance(){
        if (single == null) {
            synchronized (sync){
                if (single == null){
                    single = new Singleton();
                }
            }
        }
        return single;
    }
}

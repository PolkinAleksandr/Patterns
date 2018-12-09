package alexpolkin.ru;

public class Main {

    public static void main(String argv[]){

        Singleton singleton = Singleton.getInstance();
        singleton.doSomething();
    }
}

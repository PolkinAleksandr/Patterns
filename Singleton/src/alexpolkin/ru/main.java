package alexpolkin.ru;

public class main {

    public static void main(String argv[]){

        Singleton singleton = Singleton.getInstance();
        singleton.doSomething();
    }
}

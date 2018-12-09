package alexpolkin.ru;

public class Main {

    public static void main(String argv[]){
        Car car = new Car("car engine");
        CarFactory carFactory = new CarFactory("car engine");
        MotoFactory motoFactory = new MotoFactory("moto engine");

        AdapterEngine adapterEngine = new AdapterEngine(motoFactory);

        System.out.println(adapterEngine.getEngine());
    }
}

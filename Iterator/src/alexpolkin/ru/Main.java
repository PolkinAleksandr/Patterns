package alexpolkin.ru;

public class Main {

    public static void main(String argv[]) {
        ConcreteAggregate concreteAggregate = new ConcreteAggregate();

        Iterator iterator = concreteAggregate.getIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

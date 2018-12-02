package alexpolkin.ru;

public class ConcreteAggregate implements Aggregate {

    private int[] arr = {9, 7, 6, 5, 3, 4, 6, 4, 2, 5, 6, 8, 5, 3, 2};

    @Override
    public Iterator getIterator() {
        return new ConcreteIterator(arr);
    }
}

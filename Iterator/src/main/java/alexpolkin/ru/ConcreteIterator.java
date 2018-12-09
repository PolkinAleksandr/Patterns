package alexpolkin.ru;

public class ConcreteIterator implements Iterator {

    private int index = 0;
    private int[] arr;

    public ConcreteIterator(int[] arr) {
        this.arr = arr;
    }

    @Override
    public Object next() {
        return arr[index++];
    }

    @Override
    public boolean hasNext() {
       return index < arr.length;
    }

    @Override
    public void reset() {
        index = 0;
    }
}

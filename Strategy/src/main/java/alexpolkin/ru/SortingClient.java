package alexpolkin.ru;

import java.util.Arrays;

public class SortingClient {

    Sorting strategy;

    public void setStrategy(Sorting strategy){
        this.strategy = strategy;
    }

    public void executeStrategy(int[] arr){
        strategy.sort(arr);
        System.out.println("после:\t" + Arrays.toString(arr));
    }
}

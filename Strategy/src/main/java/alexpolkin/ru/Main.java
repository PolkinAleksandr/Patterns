package alexpolkin.ru;

import java.util.Arrays;

public class Main {

    public static void main(String argv[]){
       int[] arr = {2, 5, 3, 7, 9, 5, 2, 6, 3, 7};
       String text = "Какой-либо текст";

       SortingClient sortingClient = new SortingClient();

       System.out.println("до:\t" + Arrays.toString(arr));

       sortingClient.setStrategy(new BubbleSort());
       sortingClient.executeStrategy(arr);

       sortingClient.setStrategy(new SelectionSort());
       sortingClient.executeStrategy(arr);

       PrintClient printClient = new PrintClient();

       printClient.setStrategy(new PrintHorizontal());
       printClient.executeStrategy(text);

       printClient.setStrategy(new PrintVertical());
       printClient.executeStrategy(text);
    }
}

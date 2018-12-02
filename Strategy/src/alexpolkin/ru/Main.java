package alexpolkin.ru;

public class Main {

    public static void main(String argv[]){
        String str = "strategy";

        StrategyClient strategyClient = new StrategyClient();

        strategyClient.setStrategy(new OneStrategy());
        strategyClient.executeStrategy(str);

        strategyClient.setStrategy(new TwoStrategy());
        strategyClient.executeStrategy(str);
    }
}

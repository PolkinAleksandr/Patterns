package alexpolkin.ru;

public class StrategyClient {

    Strategy strategy;

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public void executeStrategy(String strat){
        strategy.setStrategy(strat);
    }
}

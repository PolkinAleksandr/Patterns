package alexpolkin.ru;

public class TwoStrategy implements Strategy {
    @Override
    public void setStrategy(String strat) {
        System.out.println("Two " + strat);
    }
}

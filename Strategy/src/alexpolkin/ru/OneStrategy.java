package alexpolkin.ru;

public class OneStrategy implements Strategy{
    @Override
    public void setStrategy(String strat) {
        System.out.println("One " + strat);
    }
}

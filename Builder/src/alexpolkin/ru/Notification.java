package alexpolkin.ru;

public class Notification{

    private int one;
    private int two;
    private int three;
    private int four;
    private int five;

    public Notification(Builder builder) {
        this.one = builder.one;
        this.two = builder.two;
        this.three = builder.three;
        this.four = builder.four;
        this.five = builder.five;
        System.out.print(one + " " + two + " " + three + " " + four + " " + five);
    }
}

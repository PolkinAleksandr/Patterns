package alexpolkin.ru;


public class Builder {

    public int one;
    public int two;
    public int three;
    public int four;
    public int five;

    public Builder settingOne(int one) {
            this.one = one;
            return this;
        }


    public Builder settingTwo(int two) {
            this.two = two;
            return this;
        }


    public Builder settingThree(int three) {
            this.three = three;
            return this;
        }


    public Builder settingFour(int four) {
            this.four = four;
            return this;
        }


    public Builder settingFive(int five) {
            this.five = five;
            return this;
        }

    public Notification build(){
     return new Notification(this);
    }
}

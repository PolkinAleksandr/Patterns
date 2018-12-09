package alexpolkin.ru;

public class Main {

    public static void main(String argv[]){

        Notification notification;
        Builder builder = new Builder();

        builder.settingOne(1)
                .settingTwo(2)
                .settingThree(3)
                .settingFour(4)
                .settingFive(5)
                .build();

    }
}

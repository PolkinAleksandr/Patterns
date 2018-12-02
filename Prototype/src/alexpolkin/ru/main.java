package alexpolkin.ru;

public class main {

    public static void main(String argv[]){

        Rectangle shapeOne = new Rectangle();
        shapeOne.height = 10;
        shapeOne.width = 20;

        Rectangle shapeTwo = (Rectangle) shapeOne.clone();

        System.out.println(shapeOne.height + " " + shapeTwo.height);
        System.out.println(shapeOne.width + " " + shapeTwo.width);
        System.out.println(shapeOne == shapeTwo);
        System.out.println(shapeOne.equals(shapeTwo));

    }
}

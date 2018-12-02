package alexpolkin.ru;


public class Factoty {
        private static OnScreen onScreen;

         public static void main(String arg[]){
             onScreen = new ShowButton();
             onScreen.show();
             onScreen = new ShowImageButton();
             onScreen.show();
         }
    }

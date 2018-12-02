package alexpolkin.ru;

public class Main {

    public static void main(String argv[]){

        TextChat chat = new TextChat();

        User admin = new Admin(chat);
        User user = new OneUser(chat);

        chat.setAdmin(admin);
        chat.setUser(user);

        user.sendMessage("I'm user");
        admin.sendMessage("I'm admin");
    }
}

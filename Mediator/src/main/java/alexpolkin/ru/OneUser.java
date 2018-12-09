package alexpolkin.ru;

public class OneUser implements User {

    private Chat chat;

    public OneUser(Chat chat) {
        this.chat = chat;
    }

    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("User get: " + message);
    }
}

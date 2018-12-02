package alexpolkin.ru;

public class TextChat implements Chat {

    User admin;
    User user;

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public void sendMessage(String message, User user) {
        this.user.getMessage(message);
        admin.getMessage(message);
    }
}

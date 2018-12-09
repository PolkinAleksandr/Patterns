package alexpolkin.ru;

public interface Element {
    void accept(Visitor visitor);
}

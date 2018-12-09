package alexpolkin.ru;

public interface Visitor {
    void visit(EngineElement engine);
    void visit(BodyElement body);
}

package alexpolkin.ru;

public class HooliganVisitor implements Visitor {
    @Override
    public void visit(EngineElement engine) {
        System.out.println("Сломал двигатель");
    }

    @Override
    public void visit(BodyElement body) {
        System.out.println("Отодрал краску");
    }
}

package alexpolkin.ru;

public class MachanicalVisitor implements Visitor {
    @Override
    public void visit(EngineElement engine) {
        System.out.println("Починил двигатель");
    }

    @Override
    public void visit(BodyElement body) {
        System.out.println("Покрасил машину");
    }
}

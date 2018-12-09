package alexpolkin.ru;

public class Main {

    public static void main(String argc[]){
        Element body = new BodyElement();
        Element engine = new EngineElement();

        Visitor mechanical = new MachanicalVisitor();
        Visitor hooligan = new HooliganVisitor();

        body.accept(mechanical);
        engine.accept(mechanical);

        body.accept(hooligan);
        engine.accept(hooligan);
    }
}

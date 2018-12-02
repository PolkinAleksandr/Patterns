package alexpolkin.ru;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Graphic {

    private List<Graphic> graphicList = new ArrayList<>();

    @Override
    public void print() {
        for (Graphic graphic : graphicList) {
            graphic.print();
        }
    }

    public void add(Graphic graphic) {
        graphicList.add(graphic);
    }
}

package jp.ne.yonem.pattern.Visitor.A3;

import java.util.ArrayList;

public class ElementArrayList extends ArrayList<Element> implements Element {

    public void accept(Visitor v) {
        for (var o : this) o.accept(v);
    }
}

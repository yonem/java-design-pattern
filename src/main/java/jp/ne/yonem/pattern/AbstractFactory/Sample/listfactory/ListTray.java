package jp.ne.yonem.pattern.AbstractFactory.Sample.listfactory;

import jp.ne.yonem.pattern.AbstractFactory.Sample.factory.Item;
import jp.ne.yonem.pattern.AbstractFactory.Sample.factory.Tray;

public class ListTray extends Tray {

    public ListTray(String caption) {
        super(caption);
    }

    public String makeHTML() {
        var buffer = new StringBuilder();
        buffer.append("<li>\n");
        buffer.append(caption).append("\n");
        buffer.append("<ul>\n");

        for (Item o : tray) {
            buffer.append(o.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("</li>\n");
        return buffer.toString();
    }
}

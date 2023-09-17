package jp.ne.yonem.pattern.AbstractFactory.Sample.tablefactory;

import jp.ne.yonem.pattern.AbstractFactory.Sample.factory.Item;
import jp.ne.yonem.pattern.AbstractFactory.Sample.factory.Tray;


public class TableTray extends Tray {

    public TableTray(String caption) {
        super(caption);                     // super(...)という表記法
    }

    public String makeHTML() {
        var buffer = new StringBuilder();
        buffer.append("<td>");
        buffer.append("<table width=\"100%\" border=\"1\"><tr>");
        buffer.append("<td bgcolor=\"#cccccc\" align=\"center\" colspan=\"").append(tray.size()).append("\"><b>").append(caption).append("</b></td>");
        buffer.append("</tr>\n");
        buffer.append("<tr>\n");

        for (Item o : tray) {
            buffer.append(o.makeHTML());
        }
        buffer.append("</tr></table>");
        buffer.append("</td>");
        return buffer.toString();
    }
}

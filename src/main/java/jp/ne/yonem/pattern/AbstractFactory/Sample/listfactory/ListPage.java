package jp.ne.yonem.pattern.AbstractFactory.Sample.listfactory;

import jp.ne.yonem.pattern.AbstractFactory.Sample.factory.Item;
import jp.ne.yonem.pattern.AbstractFactory.Sample.factory.Page;

public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title, author);
    }

    public String makeHTML() {
        var buffer = new StringBuilder();
        buffer.append("<html><head><title>").append(title).append("</title></head>\n");
        buffer.append("<body>\n");
        buffer.append("<h1>").append(title).append("</h1>\n");
        buffer.append("<ul>\n");

        for (Item o : content) {
            buffer.append(o.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("<hr><address>").append(author).append("</address>");
        buffer.append("</body></html>\n");
        return buffer.toString();
    }
}

package jp.ne.yonem.pattern.AbstractFactory.Sample.listfactory;

import jp.ne.yonem.pattern.AbstractFactory.Sample.factory.Factory;
import jp.ne.yonem.pattern.AbstractFactory.Sample.factory.Link;
import jp.ne.yonem.pattern.AbstractFactory.Sample.factory.Page;
import jp.ne.yonem.pattern.AbstractFactory.Sample.factory.Tray;

public class ListFactory extends Factory {

    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}

package jp.ne.yonem.pattern.AbstractFactory.A2.factory;

public abstract class Factory {

    public static Factory getFactory(String classname) {
        Factory factory = null;

        try {
            factory = (Factory) Class.forName(classname).getDeclaredConstructor().newInstance();

        } catch (ClassNotFoundException e) {
            System.err.println("クラス " + classname + " が見つかりません。");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }

    public abstract Link createLink(String caption, String url);

    public abstract Tray createTray(String caption);

    public abstract Page createPage(String title, String author);

    public Page createYahooPage() {
        return createYahooPage("no suffix");
    }

    public Page createYahooPage(String suffix) {
        var link = createLink("Yahoo!", "http://www.yahoo.com/");
        var page = createPage("Yahoo! - " + suffix, "Yahoo!");
        page.add(link);
        return page;
    }
}

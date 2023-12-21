package jp.ne.yonem.pattern.Observer.A2;

public class GraphObserver implements Observer {

    public void update(NumberGenerator generator) {
        System.out.print("GraphObserver:");
        var count = generator.getNumber();
        for (var i = 0; i < count; i++) System.out.print("*");
        System.out.println();

        try {
            Thread.sleep(100);

        } catch (InterruptedException ignored) {
        }
    }
}

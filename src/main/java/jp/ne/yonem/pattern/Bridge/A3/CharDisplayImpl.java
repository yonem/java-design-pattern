package jp.ne.yonem.pattern.Bridge.A3;

public class CharDisplayImpl extends DisplayImpl {

    private final char head;
    private final char body;
    private final char foot;

    public CharDisplayImpl(char head, char body, char foot) {
        this.head = head;
        this.body = body;
        this.foot = foot;
    }

    public void rawOpen() {
        System.out.print(head);
    }

    public void rawPrint() {
        System.out.print(body);
    }

    public void rawClose() {
        System.out.println(foot);
    }
}

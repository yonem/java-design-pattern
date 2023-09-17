package jp.ne.yonem.pattern.ChainOfResponsibility.Sample;

public class Main {

    public static void main(String[] args) {
        var alice = new NoSupport("Alice");
        var bob = new LimitSupport("Bob", 100);
        var charlie = new SpecialSupport("Charlie", 429);
        var diana = new LimitSupport("Diana", 200);
        var elmo = new OddSupport("Elmo");
        var fred = new LimitSupport("Fred", 300);

        // 連鎖の形成
        alice.setNext(bob).setNext(charlie).setNext(diana).setNext(elmo).setNext(fred);

        // さまざまなトラブル発生
        for (var i = 0; i < 500; i += 33) {
            alice.support(new Trouble(i));
        }
    }
}

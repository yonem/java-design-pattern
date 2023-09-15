package jp.ne.yonem.pattern.Strategy.Sample;

public interface Strategy {

    Hand nextHand();

    void study(boolean win);
}

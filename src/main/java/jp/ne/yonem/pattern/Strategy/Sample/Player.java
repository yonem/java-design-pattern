package jp.ne.yonem.pattern.Strategy.Sample;

public class Player {
    
    private final String name;
    private final Strategy strategy;
    private int winCount;
    private int loseCount;
    private int gameCount;

    public Player(String name, Strategy strategy) {         // 名前と戦略を授けられる
        this.name = name;
        this.strategy = strategy;
    }

    public Hand nextHand() {                                // 戦略におうかがいを立てる
        return strategy.nextHand();
    }

    public void win() {                 // 勝った
        strategy.study(true);
        winCount++;
        gameCount++;
    }

    public void lose() {                // 負けた
        strategy.study(false);
        loseCount++;
        gameCount++;
    }

    public void even() {                // 引き分け
        gameCount++;
    }

    public String toString() {
        return "[" + name + ":" + gameCount + " games, " + winCount + " win, " + loseCount + " lose" + "]";
    }
}

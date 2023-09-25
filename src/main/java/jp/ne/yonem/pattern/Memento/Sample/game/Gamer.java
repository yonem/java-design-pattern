package jp.ne.yonem.pattern.Memento.Sample.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Gamer {

    private int money; // 所持金
    private List<String> fruits = new ArrayList<>(); // フルーツ
    private final Random random = new Random(); // 乱数発生器
    private static final String[] fruitsName = { // フルーツ名の表
            "リンゴ", "ぶどう", "バナナ", "みかん",
    };

    public Gamer(int money) { // コンストラクタ
        this.money = money;
    }

    public int getMoney() { // 現在の所持金を得る
        return money;
    }

    public void bet() { // 賭ける…ゲームの進行
        var dice = random.nextInt(6) + 1; // サイコロを振る

        switch (dice) {
            case 1 -> {         // 1の目…所持金が増える
                money += 100;
                System.out.println("所持金が増えました。");
            }
            case 2 -> {         // 2の目…所持金が半分になる
                money /= 2;
                System.out.println("所持金が半分になりました。");
            }
            case 6 -> {         // 6の目…フルーツをもらう
                var f = getFruit();
                System.out.println("フルーツ(" + f + ")をもらいました。");
                fruits.add(f);
            }
            default ->          // それ以外…何も起きない
                    System.out.println("何も起こりませんでした。");
        }
    }

    public Memento createMemento() { // スナップショットをとる
        var m = new Memento(money);

        for (var fruit : fruits) {

            // フルーツはおいしいものだけ保存
            if (fruit.startsWith("おいしい")) m.addFruit(fruit);
        }
        return m;
    }

    public void restoreMemento(Memento memento) { // アンドゥを行う
        this.money = memento.money;
        this.fruits = memento.getFruits();
    }

    public String toString() { // 文字列表現
        return "[money = " + money + ", fruits = " + fruits + "]";
    }

    private String getFruit() { // フルーツを1個得る
        var prefix = "";
        if (random.nextBoolean()) prefix = "おいしい";
        return prefix + fruitsName[random.nextInt(fruitsName.length)];
    }
}

package jp.ne.yonem.pattern.Memento.Sample.game;

import java.util.ArrayList;
import java.util.List;

public class Memento {
    
    int money;                              // 所持金
    List<String> fruits;                    // フルーツ

    public int getMoney() {                 // 所持金を得る(narrow interface)
        return money;
    }

    Memento(int money) {                    // コンストラクタ(wide interface)
        this.money = money;
        this.fruits = new ArrayList<>();
    }

    void addFruit(String fruit) {           // フルーツを追加する(wide interface)
        fruits.add(fruit);
    }

    List<String> getFruits() {                    // フルーツを得る(wide interface)
        return fruits;
    }
}

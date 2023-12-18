package jp.ne.yonem.pattern.Memento.A4.game;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Memento implements Serializable {

    int money;                              // 所持金
    ArrayList fruits;                          // フルーツ

    public int getMoney() {                 // 所持金を得る(narrow interface)
        return money;
    }

    Memento(int money) {                    // コンストラクタ(wide interface)
        this.money = money;
        this.fruits = new ArrayList();
    }

    void addFruit(String fruit) {           // フルーツを追加する(wide interface)
        fruits.add(fruit);
    }

    List getFruits() {                    // フルーツを得る(wide interface)
        return (List) fruits.clone();
    }
}

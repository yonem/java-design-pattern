package jp.ne.yonem.pattern.Memento.Sample;

import jp.ne.yonem.pattern.Memento.Sample.game.Gamer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static java.lang.System.out;

class MainTest {

    @Test
    @DisplayName("Memento")
    void test1() {
        var gamer = new Gamer(100);   // 最初の所持金は100
        var memento = gamer.createMemento(); // 最初の状態を保存しておく

        for (var i = 0; i < 15; i++) {
            out.println("==== " + (i + 1)); // 回数表示
            out.println("現状:" + gamer);    // 現在の主人公の状態表示

            gamer.bet(); // ゲームを進める

            out.println("所持金は" + gamer.getMoney() + "円になりました。");

            // Mementoの取り扱いの決定
            if (gamer.getMoney() > memento.getMoney()) {
                out.println("    （だいぶ増えたので、現在の状態を保存しておこう）");
                memento = gamer.createMemento();

            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                out.println("    （だいぶ減ったので、以前の状態に復帰しよう）");
                gamer.restoreMemento(memento);
            }

            // 時間待ち
            try {
                Thread.sleep(1000);

            } catch (InterruptedException ignored) {
            }
            out.println();
        }
    }
}
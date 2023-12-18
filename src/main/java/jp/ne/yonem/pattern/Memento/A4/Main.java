package jp.ne.yonem.pattern.Memento.A4;

import jp.ne.yonem.pattern.Memento.A4.game.Gamer;
import jp.ne.yonem.pattern.Memento.A4.game.Memento;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        var gamer = new Gamer(100); // 最初の所持金は100
        var memento = loadMemento(); // ファイルからロード

        if (memento != null) {
            System.out.println("前回保存した結果からスタートします。");
            gamer.restoreMemento(memento);

        } else {
            System.out.println("新規にスタートします。");
            memento = gamer.createMemento();
        }

        for (var i = 0; i < 30; i++) {
            System.out.println("==== " + i); // 回数表示
            System.out.println("現状:" + gamer); // 現在の主人公の状態表示

            gamer.bet(); // ゲームを進める

            System.out.println("所持金は" + gamer.getMoney() + "円になりました。");

            // Mementoの取り扱いの決定
            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("    （だいぶ増えたので、現在の状態を保存しておこう）");
                memento = gamer.createMemento();
                saveMemento(memento); // ファイルに保存

            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("    （だいぶ減ったので、以前の状態に復帰しよう）");
                gamer.restoreMemento(memento);
            }

            // 時間待ち
            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
            }
            System.out.println();
        }
    }

    public static void saveMemento(Memento memento) {

        try (var out = new ObjectOutputStream(new FileOutputStream(Main.class.getResource("game.dat").getPath()))) {
            out.writeObject(memento);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Memento loadMemento() {
        Memento memento = null;

        try (var in = new ObjectInputStream(new FileInputStream(Main.class.getResource("game.dat").getPath()))) {
            memento = (Memento) in.readObject();

        } catch (FileNotFoundException e) {
            System.out.println(e);

        } catch (IOException e) {
            e.printStackTrace();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return memento;
    }
}

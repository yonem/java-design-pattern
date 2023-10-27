package jp.ne.yonem.pattern.Bridge.A2;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        var d = new CountDisplay(new FileDisplayImpl(Objects.requireNonNull(
                Main.class.getResource("star.txt")).getPath()));
        d.multiDisplay(3);
    }
}

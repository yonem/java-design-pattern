package jp.ne.yonem.pattern.Singleton.A2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    @DisplayName("Singleton")
    void test1() {
        System.out.println("Start.");

        for (var i = 0; i < 9; i++) {
            var triple = Triple.getInstance(i % 3);
            System.out.println(i + ":" + triple);
        }
        System.out.println("End.");
    }
}
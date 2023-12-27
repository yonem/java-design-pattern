package jp.ne.yonem.pattern.Singleton.Sample;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    @DisplayName("Singleton")
    void test1() {
        System.out.println("Start.");
        var obj1 = Singleton.getInstance();
        var obj2 = Singleton.getInstance();

        if (obj1 == obj2) {
            System.out.println("obj1とobj2は同じインスタンスです。");

        } else {
            System.out.println("obj1とobj2は同じインスタンスではありません。");
        }
        System.out.println("End.");
    }
}
package jp.ne.yonem.pattern.Flyweight.A2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest {

    private static final BigString[] bsarray = new BigString[1000];

    @Test
    @DisplayName("Flyweight")
    void test1() {
        System.out.println("共有した場合:");
        testAllocation(true);
        System.out.println("共有しない場合:");
        testAllocation(false);
    }

    private static void testAllocation(boolean shared) {

        for (var i = 0; i < bsarray.length; i++) {
            bsarray[i] = new BigString("1212123", shared);
        }
        showMemory();
    }

    public static void showMemory() {
        Runtime.getRuntime().gc();
        var used = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("使用メモリ = " + used);
    }
}
package jp.ne.yonem.pattern.Singleton.A1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    @DisplayName("Singleton")
    void test1() {
        System.out.println("Start.");
        for (var i = 0; i < 10; i++) System.out.println(i + ":" + TicketMaker.getInstance().getNextTicketNumber());
        System.out.println("End.");
    }
}
package jp.ne.yonem.pattern.State.A3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    @DisplayName("State")
    void test1() {
        var frame = new SafeFrame("State Sample");

        while (true) {

            for (var hour = 0; hour < 24; hour++) {
                frame.setClock(hour);   // 時刻の設定

                try {
                    Thread.sleep(1000);

                } catch (InterruptedException ignored) {
                }
            }
        }
    }
}
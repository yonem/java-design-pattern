package jp.ne.yonem.pattern.Decorator.Q2;

import jp.ne.yonem.pattern.Decorator.A2.FullBorder;
import jp.ne.yonem.pattern.Decorator.A2.MultiStringDisplay;
import jp.ne.yonem.pattern.Decorator.A2.SideBorder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    @DisplayName("Decorator")
    void test1() {
        var md = new MultiStringDisplay();
        md.add("おはようございます。");
        md.add("こんにちは。");
        md.add("おやすみなさい、また明日。");
        md.show();

        var d1 = new SideBorder(md, '#');
        d1.show();

        var d2 = new FullBorder(md);
        d2.show();
    }
}
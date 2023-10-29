package jp.ne.yonem.pattern.Builder.A4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest {
    
    @Test
    @DisplayName("plain")
    void test1() {
        var textbuilder = new TextBuilder();
        var director = new Director(textbuilder);
        director.construct();
        var result = textbuilder.getResult();
        System.out.println(result);
    }

    @Test
    @DisplayName("html")
    void test2() {
        var htmlbuilder = new HTMLBuilder();
        var director = new Director(htmlbuilder);
        director.construct();
        var filename = htmlbuilder.getResult();
        System.out.println(filename + "が作成されました。");
    }
}

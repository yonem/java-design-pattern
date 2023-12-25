package jp.ne.yonem.pattern.Proxy.A1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    @DisplayName("Proxy")
    void test1() {
        var p = new PrinterProxy("Alice", Printer.class.getName());
        System.out.println("名前は現在" + p.getPrinterName() + "です。");
        p.setPrinterName("Bob");
        System.out.println("名前は現在" + p.getPrinterName() + "です。");
        p.print("Hello, world.");
    }
}
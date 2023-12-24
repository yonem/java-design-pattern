package jp.ne.yonem.pattern.Proxy.A1;

public class Main {

    public static void main(String[] args) {
        var p = new PrinterProxy("Alice", Printer.class.getName());
        System.out.println("名前は現在" + p.getPrinterName() + "です。");
        p.setPrinterName("Bob");
        System.out.println("名前は現在" + p.getPrinterName() + "です。");
        p.print("Hello, world.");
    }
}

package jp.ne.yonem.pattern.Proxy.Sample;

public interface Printable {
    
    void setPrinterName(String name);   // 名前の設定

    String getPrinterName();            // 名前の取得

    void print(String string);          // 文字列表示(プリントアウト)
}

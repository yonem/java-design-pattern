package jp.ne.yonem.pattern.State.A4;

public class Main {

    public static void main(String[] args) {
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

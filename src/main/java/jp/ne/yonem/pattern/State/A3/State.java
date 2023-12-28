package jp.ne.yonem.pattern.State.A3;

public interface State {

    void doClock(Context context, int hour);    // 時刻設定

    void doUse(Context context);                // 金庫使用

    void doAlarm(Context context);              // 非常ベル

    void doPhone(Context context);              // 通常通話
}

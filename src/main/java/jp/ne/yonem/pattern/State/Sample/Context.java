package jp.ne.yonem.pattern.State.Sample;

public interface Context {

    void setClock(int hour);                // 時刻の設定

    void changeState(State state);          // 状態変化

    void callSecurityCenter(String msg);    // 警備センター警備員呼び出し

    void recordLog(String msg);             // 警備センター記録
}

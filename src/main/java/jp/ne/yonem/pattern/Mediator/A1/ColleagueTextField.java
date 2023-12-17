package jp.ne.yonem.pattern.Mediator.A1;

import java.awt.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class ColleagueTextField extends TextField implements TextListener, Colleague {

    private Mediator mediator;

    public ColleagueTextField(String text, int columns) { // コンストラクタ
        super(text, columns);
    }

    public void setMediator(Mediator mediator) { // Mediatorを保持
        this.mediator = mediator;
    }

    public void setColleagueEnabled(boolean enabled) { // Mediatorから有効/無効が指示される
        setEnabled(enabled);
        setBackground(enabled ? Color.white : Color.lightGray);
    }

    public void textValueChanged(TextEvent e) { // 文字列が変化したらMediatorに通知
        mediator.colleagueChanged();
    }
}

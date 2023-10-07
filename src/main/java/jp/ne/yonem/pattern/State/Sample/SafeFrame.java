package jp.ne.yonem.pattern.State.Sample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SafeFrame extends JFrame implements ActionListener, Context {

    private final JTextField textClock = new JTextField(60);        // 現在時刻表示
    private final JTextArea textScreen = new JTextArea(10, 60);     // 警備センター出力
    private final JButton buttonUse = new JButton("金庫使用");      // 金庫使用ボタン
    private final JButton buttonAlarm = new JButton("非常ベル");    // 非常ベルボタン
    private final JButton buttonPhone = new JButton("通常通話");    // 通常通話ボタン
    private final JButton buttonExit = new JButton("終了");         // 終了ボタン

    private State state = DayState.getInstance();           // 現在の状態

    // コンストラクタ
    public SafeFrame(String title) {
        super(title);
        setBackground(Color.lightGray);
        setLayout(new BorderLayout());

        // textClockを配置
        add(textClock, BorderLayout.NORTH);
        textClock.setEditable(false);

        // textScreenを配置
        add(new JScrollPane(textScreen), BorderLayout.CENTER);
        textScreen.setEditable(false);

        // パネルにボタンを格納
        Panel panel = new Panel();
        panel.add(buttonUse);
        panel.add(buttonAlarm);
        panel.add(buttonPhone);
        panel.add(buttonExit);

        // そのパネルを配置
        add(panel, BorderLayout.SOUTH);

        // 表示
        pack();
        setVisible(true);

        // リスナーの設定
        buttonUse.addActionListener(this);
        buttonAlarm.addActionListener(this);
        buttonPhone.addActionListener(this);
        buttonExit.addActionListener(this);
    }

    // ボタンが押されたらここに来る
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());

        if (e.getSource() == buttonUse) {           // 金庫使用ボタン
            state.doUse(this);

        } else if (e.getSource() == buttonAlarm) {  // 非常ベルボタン
            state.doAlarm(this);

        } else if (e.getSource() == buttonPhone) {  // 通常通話ボタン
            state.doPhone(this);

        } else if (e.getSource() == buttonExit) {   // 終了ボタン
            System.exit(0);

        } else {
            System.out.println("?");
        }
    }

    // 時刻の設定
    public void setClock(int hour) {
        var clockstring = "現在時刻は";

        if (hour < 10) {
            clockstring += "0" + hour + ":00";

        } else {
            clockstring += hour + ":00";
        }
        System.out.println(clockstring);
        textClock.setText(clockstring);
        state.doClock(this, hour);
    }

    // 状態変化
    public void changeState(State state) {
        System.out.println(this.state + "から" + state + "へ状態が変化しました。");
        this.state = state;
    }

    // 警備センター警備員呼び出し
    public void callSecurityCenter(String msg) {
        textScreen.append("call! " + msg + "\n");
    }

    // 警備センター記録
    public void recordLog(String msg) {
        textScreen.append("record ... " + msg + "\n");
    }
}

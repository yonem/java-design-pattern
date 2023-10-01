package jp.ne.yonem.pattern.Mediator.Sample;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends Frame implements ActionListener, Mediator {

    private ColleagueCheckbox checkGuest;
    private ColleagueCheckbox checkLogin;
    private ColleagueTextField textUser;
    private ColleagueTextField textPass;
    private ColleagueButton buttonOk;
    private ColleagueButton buttonCancel;

    // コンストラクタ。
    // Colleagueたちを生成し、配置した後に表示を行う。
    public LoginFrame(String title) {
        super(title);
        setBackground(Color.lightGray);

        // レイアウトマネージャを使って4×2のグリッドを作る
        setLayout(new GridLayout(4, 2));

        // Colleagueたちの生成
        createColleagues();

        // 配置
        add(checkGuest);
        add(checkLogin);
        add(new Label("Username:"));
        add(textUser);
        add(new Label("Password:"));
        add(textPass);
        add(buttonOk);
        add(buttonCancel);

        // 有効/無効の初期指定
        colleagueChanged();

        // 表示
        pack();
        setVisible(true);
    }

    // Colleagueたちを生成する。
    public void createColleagues() {

        // 生成
        var g = new CheckboxGroup();
        checkGuest = new ColleagueCheckbox("Guest", g, true);
        checkLogin = new ColleagueCheckbox("Login", g, false);
        textUser = new ColleagueTextField("", 10);
        textPass = new ColleagueTextField("", 10);
        textPass.setEchoChar('*');
        buttonOk = new ColleagueButton("OK");
        buttonCancel = new ColleagueButton("Cancel");

        // Mediatorのセット
        checkGuest.setMediator(this);
        checkLogin.setMediator(this);
        textUser.setMediator(this);
        textPass.setMediator(this);
        buttonOk.setMediator(this);
        buttonCancel.setMediator(this);

        // Listenerのセット
        checkGuest.addItemListener(checkGuest);
        checkLogin.addItemListener(checkLogin);
        textUser.addTextListener(textUser);
        textPass.addTextListener(textPass);
        buttonOk.addActionListener(this);
        buttonCancel.addActionListener(this);
    }

    // Collegeからの通知で各Collegeの有効/無効を判定する。
    public void colleagueChanged() {

        if (checkGuest.getState()) { // Guest mode
            textUser.setColleagueEnabled(false);
            textPass.setColleagueEnabled(false);
            buttonOk.setColleagueEnabled(true);

        } else { // Login mode
            textUser.setColleagueEnabled(true);
            userPassChanged();
        }
    }

    // textUserまたはtextPassの変更があった。
    // 各Collegeの有効/無効を判定する。
    private void userPassChanged() {

        if (!textUser.getText().isEmpty()) {
            textPass.setColleagueEnabled(true);
            buttonOk.setColleagueEnabled(!textPass.getText().isEmpty());

        } else {
            textPass.setColleagueEnabled(false);
            buttonOk.setColleagueEnabled(false);
        }
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        System.exit(0);
    }
}

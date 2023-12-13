package jp.ne.yonem.pattern.Interpreter.A1;

import jp.ne.yonem.pattern.Interpreter.A1.language.InterpreterFacade;
import jp.ne.yonem.pattern.Interpreter.A1.turtle.TurtleCanvas;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main extends Frame implements ActionListener {

    private final TurtleCanvas canvas = new TurtleCanvas(400, 400);
    private final InterpreterFacade facade = new InterpreterFacade(canvas);
    // private TextField programTextField = new TextField("program repeat 3 go right go left end end");
    private final TextField programTextField = new TextField("program repeat 4 repeat 3 go right go left end right end end");

    // コンストラクタ
    public Main(String title) {
        super(title);

        canvas.setExecutor(facade);

        setLayout(new BorderLayout());

        programTextField.addActionListener(this);

        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        add(programTextField, BorderLayout.NORTH);
        add(canvas, BorderLayout.CENTER);
        pack();
        parseAndExecute();
        setVisible(true);
    }

    // ActionListener用
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == programTextField) parseAndExecute();
    }

    private void parseAndExecute() {
        var programText = programTextField.getText();
        System.out.println("programText = " + programText);
        facade.parse(programText);
        canvas.repaint();
    }

    public static void main(String[] args) {
        new Main("Interpreter Pattern Sample");
    }
}

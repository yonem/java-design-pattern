package jp.ne.yonem.pattern.Builder.A3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameBuilder extends Builder implements ActionListener {

    private final JFrame frame = new JFrame();
    private final Box box = new Box(BoxLayout.Y_AXIS);

    public void makeTitle(String title) {
        frame.setTitle(title);
    }

    public void makeString(String str) {
        box.add(new JLabel(str));
    }

    public void makeItems(String[] items) {
        Box innerbox = new Box(BoxLayout.Y_AXIS);

        for (var item : items) {
            var button = new JButton(item);
            button.addActionListener(this);
            innerbox.add(button);
        }
        box.add(innerbox);
    }

    public void close() {
        frame.getContentPane().add(box);
        frame.pack();
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public JFrame getResult() {
        return frame;
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
    }
}

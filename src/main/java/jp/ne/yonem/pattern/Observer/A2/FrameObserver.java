package jp.ne.yonem.pattern.Observer.A2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameObserver extends JFrame implements Observer, ActionListener {

    private final GraphText textGraph = new GraphText(60);
    private final GraphCanvas canvasGraph = new GraphCanvas();
    private final JButton buttonClose = new JButton("Close");

    public FrameObserver() {
        super("FrameObserver");
        setLayout(new BorderLayout());
        setBackground(Color.lightGray);
        textGraph.setEditable(false);
        canvasGraph.setSize(500, 500);
        add(textGraph, BorderLayout.NORTH);
        add(canvasGraph, BorderLayout.CENTER);
        add(buttonClose, BorderLayout.SOUTH);
        buttonClose.addActionListener(this);
        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        System.exit(0);
    }

    public void update(NumberGenerator generator) {
        textGraph.update(generator);
        canvasGraph.update(generator);
    }
}

class GraphText extends JTextField implements Observer {

    public GraphText(int columns) {
        super(columns);
    }

    public void update(NumberGenerator generator) {
        var number = generator.getNumber();
        setText(number + ":" + "*".repeat(Math.max(0, number)));
    }
}

class GraphCanvas extends Canvas implements Observer {

    private int number;

    public void update(NumberGenerator generator) {
        number = generator.getNumber();
        repaint();
    }

    public void paint(Graphics g) {
        int width = getWidth();
        int height = getHeight();
        g.setColor(Color.white);
        g.fillArc(0, 0, width, height, 0, 360);
        g.setColor(Color.green);
        g.fillArc(0, 0, width, height, 90, -number * 360 / 50);
    }
}

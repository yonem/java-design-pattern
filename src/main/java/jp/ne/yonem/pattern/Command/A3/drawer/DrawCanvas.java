package jp.ne.yonem.pattern.Command.A3.drawer;

import jp.ne.yonem.pattern.Command.A3.command.MacroCommand;

import java.awt.*;

public class DrawCanvas extends Canvas implements Drawable {

    // 描画色
    private final Color color = Color.red;
    // 描画する点の半径
    private final int radius = 6;
    // 履歴
    private final MacroCommand history;

    // コンストラクタ
    public DrawCanvas(int width, int height, MacroCommand history) {
        setSize(width, height);
        setBackground(Color.white);
        this.history = history;
    }

    // 履歴全体を再描画
    public void paint(Graphics g) {
        history.execute();
    }

    // 描画
    public void draw(int x, int y) {
        var g = getGraphics();
        g.setColor(color);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }
}

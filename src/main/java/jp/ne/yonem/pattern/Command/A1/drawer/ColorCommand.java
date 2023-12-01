package jp.ne.yonem.pattern.Command.A1.drawer;


import jp.ne.yonem.pattern.Command.A1.command.Command;

import java.awt.*;

public class ColorCommand implements Command {
    
    // 描画対象
    protected Drawable drawable;
    // 描画色
    private Color color;

    // コンストラクタ
    public ColorCommand(Drawable drawable, Color color) {
        this.drawable = drawable;
        this.color = color;
    }

    // 実行
    public void execute() {
        drawable.setColor(color);
    }
}

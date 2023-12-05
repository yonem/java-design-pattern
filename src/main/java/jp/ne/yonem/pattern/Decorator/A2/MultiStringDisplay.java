package jp.ne.yonem.pattern.Decorator.A2;

import java.util.ArrayList;
import java.util.List;

public class MultiStringDisplay extends Display {

    private final List<String> body = new ArrayList<>();             // 表示文字列

    private int columns = 0;                        // 最大文字数

    public void add(String msg) {                   // 文字列追加
        body.add(msg);
        updateColumn(msg);
    }

    public int getColumns() {                       // 文字数
        return columns;
    }

    public int getRows() {                          // 行数
        return body.size();
    }

    public String getRowText(int row) {             // 行の内容
        return body.get(row);
    }

    private void updateColumn(String msg) {         // 文字数を更新する
        if (msg.getBytes().length > columns) columns = msg.getBytes().length;

        for (var row = 0; row < body.size(); row++) {
            var fills = columns - body.get(row).getBytes().length;
            if (fills > 0) body.set(row, body.get(row) + spaces(fills));
        }
    }

    private String spaces(int count) {              // 空白作成
        return " ".repeat(Math.max(0, count));
    }
}

package jp.ne.yonem.pattern.Command.A3.command;

import java.util.Stack;

public class MacroCommand implements Command {

    // 命令の集合
    private final Stack<Command> commands = new Stack<>();

    // 実行
    public void execute() {
        for (Command command : commands) command.execute();
    }

    // 追加
    public void append(Command cmd) {
        if (cmd != this) commands.push(cmd);
    }

    // 最後の命令を削除
    public void undo() {
        if (!commands.empty()) commands.pop();
    }

    // 全部削除
    public void clear() {
        commands.clear();
    }
}

package jp.ne.yonem.pattern.Interpreter.Sample;

import java.util.ArrayList;
import java.util.List;

// <command list> ::= <command>* end
public class CommandListNode extends Node {

    private final List<Node> list = new ArrayList<>();

    public void parse(Context context) throws ParseException {

        while (true) {

            if (context.currentToken() == null) {
                throw new ParseException("Missing 'end'");

            } else if (context.currentToken().equals("end")) {
                context.skipToken("end");
                break;

            } else {
                var commandNode = new CommandNode();
                commandNode.parse(context);
                list.add(commandNode);
            }
        }
    }

    public String toString() {
        return list.toString();
    }
}

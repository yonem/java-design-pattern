package jp.ne.yonem.pattern.Interpreter.A1.language;

public class InterpreterFacade implements Executor {

    private final ExecutorFactory factory;
    private Node programNode;

    public InterpreterFacade(ExecutorFactory factory) {
        this.factory = factory;
    }

    public boolean parse(String text) {
        var ok = true;
        var context = new Context(text);
        context.setExecutorFactory(factory);
        this.programNode = new ProgramNode();

        try {
            programNode.parse(context);
            System.out.println(programNode.toString());

        } catch (ParseException e) {
            e.printStackTrace();
            ok = false;
        }
        return ok;
    }

    public void execute() throws ExecuteException {

        try {
            programNode.execute();

        } catch (ExecuteException e) {
            e.printStackTrace();
        }
    }
}

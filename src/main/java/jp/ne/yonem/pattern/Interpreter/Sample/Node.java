package jp.ne.yonem.pattern.Interpreter.Sample;

public abstract class Node {
    
    public abstract void parse(Context context) throws ParseException;
}

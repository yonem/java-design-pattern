package jp.ne.yonem.pattern.Builder.A3;

public class Main {

    public static void main(String[] args) {
        var framebuilder = new FrameBuilder();
        var director = new Director(framebuilder);
        director.construct();
        var frame = framebuilder.getResult();
        frame.setVisible(true);
    }
}

package jp.ne.yonem.pattern.Bridge.A3;

public class IncreaseDisplay extends CountDisplay {

    private final int step; // 増加数

    public IncreaseDisplay(DisplayImpl impl, int step) {
        super(impl);
        this.step = step;
    }

    public void increaseDisplay(int level) {
        var count = 0;

        for (var i = 0; i < level; i++) {
            multiDisplay(count);
            count += step;
        }
    }
}

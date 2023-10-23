package jp.ne.yonem.pattern.Adapter.Q2;

import jp.ne.yonem.pattern.Adapter.A2.FileProperties;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Objects;

class MainTest {

    @Test
    @DisplayName("Output file")
    void test1() {
        var f = new FileProperties();

        try {
            f.readFromFile(Objects.requireNonNull(Main.class.getResource("file.txt")).getPath());
            f.setValue("year", "2004");
            f.setValue("month", "4");
            f.setValue("day", "21");
            f.writeToFile("new_file.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
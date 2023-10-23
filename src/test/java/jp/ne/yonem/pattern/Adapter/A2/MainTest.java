package jp.ne.yonem.pattern.Adapter.A2;

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
            f.setValue("year", "2023");
            f.setValue("month", "10");
            f.setValue("day", "23");
            f.writeToFile("new_file.txt");
            f.writeToXmlFile("new_file.xml");
            System.out.println(f.getValue("year"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
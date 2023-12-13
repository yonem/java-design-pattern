package jp.ne.yonem.pattern.Interpreter.Sample;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Objects;

class MainTest {

    @Test
    @DisplayName("Interpreter")
    void test1() {

        try (var reader = new BufferedReader(new FileReader(Objects.requireNonNull(Main.class.getResource("program.txt")).getPath()))) {
            String text;

            while ((text = reader.readLine()) != null) {
                System.out.println("text = \"" + text + "\"");
                var node = new ProgramNode();
                node.parse(new Context(text));
                System.out.println("node = " + node);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
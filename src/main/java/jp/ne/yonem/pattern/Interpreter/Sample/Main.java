package jp.ne.yonem.pattern.Interpreter.Sample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {

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

package jp.ne.yonem.pattern.Composite.A2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    @DisplayName("フォームの起動")
    void test1() {
        try {
            var rootdir = new Directory("root");

            var usrdir = new Directory("usr");
            rootdir.add(usrdir);

            var yuki = new Directory("yuki");
            usrdir.add(yuki);

            var file = new File("Composite.java", 100);
            yuki.add(file);
            rootdir.printList();

            System.out.println();
            System.out.println("file = " + file.getFullName());
            System.out.println("yuki = " + yuki.getFullName());

        } catch (FileTreatmentException e) {
            e.printStackTrace();
        }
    }
}
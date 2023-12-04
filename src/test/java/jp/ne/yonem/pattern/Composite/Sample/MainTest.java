package jp.ne.yonem.pattern.Composite.Sample;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    @DisplayName("フォームの起動")
    void test1() {

        try {
            System.out.println("Making root entries...");
            var rootdir = new Directory("root");
            var bindir = new Directory("bin");
            var tmpdir = new Directory("tmp");
            var usrdir = new Directory("usr");
            rootdir.add(bindir);
            rootdir.add(tmpdir);
            rootdir.add(usrdir);
            bindir.add(new File("vi", 10000));
            bindir.add(new File("latex", 20000));
            rootdir.printList();

            System.out.println();
            System.out.println("Making user entries...");
            var yuki = new Directory("yuki");
            var hanako = new Directory("hanako");
            var tomura = new Directory("tomura");
            usrdir.add(yuki);
            usrdir.add(hanako);
            usrdir.add(tomura);
            yuki.add(new File("diary.html", 100));
            yuki.add(new File("Composite.java", 200));
            hanako.add(new File("memo.tex", 300));
            tomura.add(new File("game.doc", 400));
            tomura.add(new File("junk.mail", 500));
            rootdir.printList();

        } catch (FileTreatmentException e) {
            e.printStackTrace();
        }
    }
}
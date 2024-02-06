package jp.ne.yonem.pattern.Visitor.Q1;

import jp.ne.yonem.pattern.Visitor.A1.Directory;
import jp.ne.yonem.pattern.Visitor.A1.File;
import jp.ne.yonem.pattern.Visitor.A1.FileFindVisitor;
import jp.ne.yonem.pattern.Visitor.A1.FileTreatmentException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    @DisplayName("Visitor")
    void test1() {

        try {
            var rootdir = new Directory("root");
            var bindir = new Directory("bin");
            var tmpdir = new Directory("tmp");
            var usrdir = new Directory("usr");
            rootdir.add(bindir);
            rootdir.add(tmpdir);
            rootdir.add(usrdir);
            bindir.add(new File("vi", 10000));
            bindir.add(new File("latex", 20000));

            var yuki = new Directory("yuki");
            var hanako = new Directory("hanako");
            var tomura = new Directory("tomura");
            usrdir.add(yuki);
            usrdir.add(hanako);
            usrdir.add(tomura);
            yuki.add(new File("diary.html", 100));
            yuki.add(new File("Composite.java", 200));
            hanako.add(new File("memo.tex", 300));
            hanako.add(new File("index.html", 350));
            tomura.add(new File("game.doc", 400));
            tomura.add(new File("junk.mail", 500));

            var ffv = new FileFindVisitor(".html");
            rootdir.accept(ffv);

            System.out.println("HTML files are:");
            var it = ffv.getFoundFiles();

            while (it.hasNext()) {
                File file = it.next();
                System.out.println(file.toString());
            }

        } catch (FileTreatmentException e) {
            e.printStackTrace();
        }
    }
}
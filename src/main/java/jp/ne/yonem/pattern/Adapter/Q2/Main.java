package jp.ne.yonem.pattern.Adapter.Q2;

import jp.ne.yonem.pattern.Adapter.A2.FileIO;
import jp.ne.yonem.pattern.Adapter.A2.FileProperties;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        var f = new FileProperties();

        try {
            f.readFromFile("src/main/java/jp/ne/yonem/pattern/Adapter/Q2/file.txt");
            f.setValue("year", "2004");
            f.setValue("month", "4");
            f.setValue("day", "21");
            f.writeToFile("src/main/java/jp/ne/yonem/pattern/Adapter/Q2/newfile.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

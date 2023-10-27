package jp.ne.yonem.pattern.Bridge.A2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileDisplayImpl extends DisplayImpl {
    private final String filename;
    private BufferedReader reader;

    public FileDisplayImpl(String filename) {
        this.filename = filename;
    }

    public void rawOpen() {

        try {
            reader = new BufferedReader(new FileReader(filename));
            // 繰り返し表示させられる上限（バッファサイズ）
            var MAX_READAHEAD_LIMIT = 4096;
            reader.mark(MAX_READAHEAD_LIMIT);

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("=-=-=-=-=-= " + filename + " =-=-=-=-=-="); // 飾り枠
    }

    public void rawPrint() {

        try {
            String line;
            reader.reset(); // markした位置まで巻き戻す

            while ((line = reader.readLine()) != null) {
                System.out.println("> " + line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void rawClose() {
        System.out.println("=-=-=-=-=-= "); // 飾り枠

        try {
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

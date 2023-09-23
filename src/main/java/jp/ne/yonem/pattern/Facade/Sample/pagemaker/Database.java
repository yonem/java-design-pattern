package jp.ne.yonem.pattern.Facade.Sample.pagemaker;

import jp.ne.yonem.pattern.Facade.Sample.Main;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

public class Database {

    private Database() { // newでインスタンス生成させないためにprivate宣言
    }

    public static Properties getProperties(String dbname) { // データベース名からPropertiesを得る
        var filename = Objects.requireNonNull(Main.class.getResource(dbname + ".txt")).getPath();
        var prop = new Properties();

        try {
            prop.load(new FileInputStream(filename));

        } catch (IOException e) {
            System.out.println("Warning: " + filename + " is not found.");
        }
        return prop;
    }
}

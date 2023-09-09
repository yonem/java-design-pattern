package jp.ne.yonem.pattern.Builder.Sample;

public class Main {

    public static void main(String[] args) {

        if (args.length != 1) {
            usage();
            System.exit(0);
        }

        if (args[0].equals("plain")) {
            var textbuilder = new TextBuilder();
            var director = new Director(textbuilder);
            director.construct();
            var result = textbuilder.getResult();
            System.out.println(result);

        } else if (args[0].equals("html")) {
            var htmlbuilder = new HTMLBuilder();
            var director = new Director(htmlbuilder);
            director.construct();
            var filename = htmlbuilder.getResult();
            System.out.println(filename + "が作成されました。");

        } else {
            usage();
            System.exit(0);
        }
    }

    public static void usage() {
        System.out.println("Usage: java Main plain      プレーンテキストで文書作成");
        System.out.println("Usage: java Main html       HTMLファイルで文書作成");
    }
}

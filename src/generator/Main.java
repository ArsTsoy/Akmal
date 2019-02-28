package generator;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        PageDownloader wordDownloader = new PageDownloader();
        try {
            wordDownloader.htmlCodeDownload("http://www.dmc.fmph.uniba.sk/public_html/doc/Java/ch2.htm");
        } catch (IOException e) {
            System.out.println("не удалось подключиться к сайту");
            e.printStackTrace();
        }
    }
}

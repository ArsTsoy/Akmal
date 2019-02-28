package generator;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class PageDownloader {
    private String text;

    public String htmlCodeDownload(String urlPath) throws IOException {
        URL url = new URL(urlPath);
        URLConnection urlConnection = url.openConnection();
        InputStream inputStream = urlConnection.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String line;
        while( (line = bufferedReader.readLine()) != null ){
            System.out.println(line);
        }
        return null;
    }



}

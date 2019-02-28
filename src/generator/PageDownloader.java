package generator;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class PageDownloader {
    private StringBuilder text;

    public String htmlCodeDownload(String urlPath) throws IOException {
        text = new StringBuilder();

        URL url = new URL(urlPath);
        URLConnection urlConnection = url.openConnection();
        InputStream inputStream = urlConnection.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String line;
        while( (line = bufferedReader.readLine()) != null ){
            text.append(line);
        }
        return text.toString();
    }



}

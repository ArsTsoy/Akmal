package generator;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PageDownloader {
    private StringBuilder text;
    private HashSet<String> symbols;

    public PageDownloader(){
        text = new StringBuilder();
    }

    public Set<String> htmlCodeDownload(String urlPath) throws IOException {
        URL url = new URL(urlPath);
        URLConnection urlConnection = url.openConnection();
        InputStream inputStream = urlConnection.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String line;
        while( (line = bufferedReader.readLine()) != null ){
            text.append(line);
        }

        generateSymbols();
        return symbols;
    }

    private void generateSymbols(){
        Pattern pattern = Pattern.compile("[A-z]");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            symbols.add(matcher.group(0));
        }




    }



}

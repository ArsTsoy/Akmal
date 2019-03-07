package generator;

import java.util.HashMap;
import java.util.HashSet;

public class Dictionary {
    private HashMap<String, String> dict;
    public Dictionary(){
        // your code
        HashMap<String, String> dict = new HashMap<>();
    }

    public void newEntry(String key, String value){
        // your code
        dict.put(key, value);
    }

    public String look(String key){
        // your code

        String val = dict.get(key) ;
        return  val == null ? ("Cant find entry for " + key) : val;

    }
}
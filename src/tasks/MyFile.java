package tasks;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class MyFile {


    public void readFile(String path) throws FileNotFoundException {
        FileReader fileReader = new FileReader(new File(path));
    }
}

package week10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.List;

public class Task1 {

    public List<String> getAllFunctions(File path){

        try {
            FileInputStream fis = new FileInputStream(new File("src\\week9\\Utils.java"));
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            
        }catch(Exception ex){}
        return null;
    }
}

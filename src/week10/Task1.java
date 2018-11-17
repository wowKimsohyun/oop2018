package week10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Task1 {

    public List<String> getAllFunctions(File path){

        List<String> listFunct = new ArrayList();

        try {
            FileInputStream fis = new FileInputStream(path);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);

            String line;
            while ((line = br.readLine()) != null){

                String getcode = line;

                if(line.indexOf("static") != -1 && line.endsWith("{") || line.indexOf("static") != -1 && line.endsWith(")") ){

                    String str;
                    int _count = 1;
                    while(_count!=0){

                        str = br.readLine();
                        getcode = getcode+"\n"+str;
                        if (str.indexOf("{") != -1){

                            _count++;
                        }
                        if(str.indexOf("}") != -1){

                            _count--;
                        }
                    }
                    listFunct.add(getcode);
                }
            }
            
        }catch(Exception ex){}
        return listFunct;
    }

    public String findFunctionByName(String name){

        List<String> listFunct = new ArrayList();
        listFunct = getAllFunctions(new File("src\\week9\\Utils.java"));
        String _name = name.substring(0,name.indexOf("("));
        String []arr = (name.substring(name.indexOf("(")+1,name.indexOf(")"))).split(",");
        for (String str : listFunct){

            if (str.contains(_name)){


                StringTokenizer token = new StringTokenizer(str.substring(str.indexOf("(")+1,str.indexOf(")")),", ");
                while(token.hasMoreTokens()){

                    String value = token.nextToken();
                    int check = 0;
                    for (int  i =0; i < arr.length; i++){

                        if (arr[i].equalsIgnoreCase(value)){

                            check++;
                        }
                    }
                    if (check == arr.length){
                        return str;
                    }
                }
            }
        }
        return null;
    }

    public static void main (String[] args){

        List<String> list = new ArrayList();
        Task1 t1 = new Task1();
        list = t1.getAllFunctions(new File("src\\week9\\Utils.java"));
        String b = t1.findFunctionByName("findFileByName1(String,String)");
        System.out.println(b);

    }
}

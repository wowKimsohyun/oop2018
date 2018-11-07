package week9;

import java.io.*;
import java.util.Scanner;

public class Utils {

    public static String readContentFromFile(String path){
        String data = null;
        String line;
        try {
            FileInputStream fis = new FileInputStream(path);
            InputStreamReader isr = new InputStreamReader(fis,"UTF8");
            BufferedReader br = new BufferedReader(isr);

            data = br.readLine()+"\n";
            while ((line = br.readLine()) != null){
                    data += line + "\n";
            }

        }catch (IOException e){
            e.printStackTrace();
        }
        return data;
    }

    public static void writeContentToFile(String path){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap noi dung can ghi vao file:");
        String data = sc.nextLine();
        try {

            FileOutputStream fos = new FileOutputStream(path);
            OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF8");
            BufferedWriter bw = new BufferedWriter(osw);

            bw.write(data);
            bw.newLine();

            bw.close();
            osw.close();
            fos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void writeContentToFile(String path, boolean check){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap du lieu can ghi them vao file:");
        String data;
        data = sc.nextLine();
        System.out.println(data);
        System.out.println("--------------");
        try {
            File file = new File(path);
            FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.newLine();
            bw.write(data);

            bw.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static File findFileByName(String folderPath, String fileName){
        String path = folderPath+"\\"+fileName;
        File _file = new File(path);
        if (_file.exists()==true){
            System.out.println("File da duoc tim thay");
            return _file;
        }
        else{
            System.out.println("Khong tim thay file");
            return null;
        }
    }

    public static void main (String[] args){
        File file = findFileByName("C:\\test","file.txt");
        //writeContentToFile("C:\\test\\file.txt",true);
        String data = readContentFromFile("C:\\test\\file.txt");
        System.out.println(data);
    }
}

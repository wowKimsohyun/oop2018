package week7.task2;


import java.io.*;

public class Task2 {
    public static void ArrayIndexOutOfBoundsException(int a[], int outsize) throws ArrayIndexOutOfBoundsException {
        try{
            System.out.println(a[outsize]);
        }catch (Exception e){
            throw  e;
        }
    }

    public static void ArithmeticException(int a, int b) throws ArithmeticException{
        try{
            System.out.println(a/b);
        }catch (Exception e){
            throw  e;
        }
    }

    public static void NullPointerException() throws NullPointerException{
        try{
            TestNull str = new TestNull();
            str.printLength();
        }catch (Exception e){
            throw  e;
        }
    }

    public static void FileNotFoundException() throws IOException {
        String path ="C:\\Hoctap\\abc.txt";
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(path), "UTF8");
        BufferedReader reader = new BufferedReader(inputStreamReader);
        try{
            String line;
            while ((line = reader.readLine())!= null){
                System.out.println(line);
            }
        }catch (IOException e){
            throw e;
        }
    }

    public static void ClassCastException() throws ClassCastException{
        try{
            Object i = Integer.valueOf(42);
            String s = (String)i;
        }catch (Exception e){
            throw  e;
        }
    }

    public static void IOException() throws IOException{
        throw new IOException();
    }
    public static void main (String[] args){
        // ArrayIndexOutOfBoundsException
        try{
            int a[] = new int[7];
            ArrayIndexOutOfBoundsException(a,10);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

        // ArithmeticException
        try{
            ArithmeticException(7,0);
        }catch (ArithmeticException e){
            System.out.println(e);
        }

        // NullPointerException
        try{
            NullPointerException();
        }catch (NullPointerException e){
            System.out.println(e);
        }

        // FileNotFoundException
        try{
            FileNotFoundException();
        }catch (IOException e){
            System.out.println(e);
        }

        // ClassCastException
        try{
            ClassCastException();
        }catch (ClassCastException e){
            System.out.println(e);
        }

        //IOException
        try{
            IOException();
        }catch (IOException e){
            System.out.println(e);
        }
    }
}

class TestNull{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printLength(){
        System.out.println(name.length());
    }
}


package week10;

import java.util.Random;

public class Task2 {

    public static void bubbleSort(double[] arr, int size){

        for (int i = 0; i < size - 1; ++i){

            for (int j = 0 ; j < size - i - 1;++j){
                if (arr[j] > arr[j+1]){
                    double temp;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (double n : arr){
            System.out.println(n);
        }
    }

    public static void main (String[] args){
        Random rd = new Random();
        double[] arr = new double[1000];
        for (int i = 0; i < 1000; i++){
            arr[i] = rd.nextDouble()*770;
        }
        bubbleSort(arr,1000);

    }
}

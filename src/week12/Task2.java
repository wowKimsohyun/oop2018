package week12;

public class Task2 {

    public static void main(String[] args){
        int[] arr = {5,6,7,9,4,8,1,3};
        SortFormat sf = new InsertionSort();
        sf.sort(arr);
        for (int i : arr){

            System.out.print(i+" ");
        }
    }


}

interface SortFormat{

    public void sort(int[] arr);
}

class BubbleSort implements SortFormat{

    @Override
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length ; i++){
            for (int j = 0; j < arr.length - i - 1; j++){

                if (arr[j] > arr[j+1]){

                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }
    }
}

class InsertionSort implements SortFormat{


    @Override
    public void sort(int[] arr) {

        for (int i = 1; i < arr.length; ++i)
        {

            int key = arr[i];
            int j = i-1;

            while (j>=0 && arr[j] > key)
            {

                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }
}

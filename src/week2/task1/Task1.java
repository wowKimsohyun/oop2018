package week2.task1;

public class Task1 {

    public static int gcd(int a, int b) {
        // TODO: Tính ước chung lớn nhất của 2 số a, b
        int temp;
        while (b != 0){
            temp = a%b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static int fibonacci(int n) {
        // TODO: Tìm số fibonacci ở vị trí n
        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}

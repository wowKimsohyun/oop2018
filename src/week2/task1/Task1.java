package week2.task1;

public class Task1 {

    /**
     * Phương thức tính ước chung lớn nhất của 2 số truyền vào
     * @param a - số nguyên a
     * @param b - số nguyên b
     * @return - giá trị ước chung lớn nhất của 2 số truyền vào
     */
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

    /**
     * Phương thức tính dãy fibonacci
     * @param n - vị trí số fibonacci
     * @return - số fibonacci thứ n truyền vào
     */
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
    public static void main (String[] args){
        int a = Task1.gcd(3,9);
        System.out.println("UCLN cua 3 va 9 la:"+a);
        int b = Task1.fibonacci(6);
        System.out.println("So fibonacci thu 6 trong day la:"+b);
    }
}

package week3;

import org.junit.Assert;

public class Week3Test {

    public void test() {
        // TODO: Viết 5 testcase cho phương thức max()
        Assert.assertEquals(17, Week3.max(17, 10));
        Assert.assertEquals(7, Week3.max(1, 7));
        Assert.assertEquals(-2, Week3.max(-8, -2));
        Assert.assertEquals(27, Week3.max(-27, 27));
        Assert.assertEquals(0, Week3.max(-1, 0));
        // TODO: Viết 5 testcase cho phương thức minOfArray()
        int arr1[] = {1, 2, 3, 4, 5};   //Min = 1
        int arr2[] = {-1, 2, 3, -5};   //Min = -5
        int arr3[] = {-5, -6, -3, 0};  //Min = -6
        int arr4[] = {1, 1, 5, 3, 4};   //Min = 1
        int arr5[] = {9, 9, 9, 5, 3};   //Min = 3
        Assert.assertEquals(1, Week3.minOfArray(arr1));
        Assert.assertEquals(-5, Week3.minOfArray(arr2));
        Assert.assertEquals(-6, Week3.minOfArray(arr3));
        Assert.assertEquals(1, Week3.minOfArray(arr4));
        Assert.assertEquals(3, Week3.minOfArray(arr5));
        // TODO: Viết 5 testcase cho phương thức calculateBMI()
        Assert.assertEquals("Thiếu cân", Week3.calculateBMI(54, 1.8));
        Assert.assertEquals("Bình thường", Week3.calculateBMI(57, 1.7));
        Assert.assertEquals("Thừa cân", Week3.calculateBMI(67, 1.67));
        Assert.assertEquals("Béo phì", Week3.calculateBMI(90, 1.65));
        Assert.assertEquals("Béo phì", Week3.calculateBMI(70, 1.6));
    }
}

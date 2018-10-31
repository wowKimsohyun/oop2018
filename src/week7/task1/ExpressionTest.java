package week7.task1;

public class ExpressionTest {
    public static void main (String[] args){
        // Test
        int result = 10*10 - 1 + 2*3;
        System.out.println("(10^2 - 1 + 2*3)^2 = "+result*result);
        // Sua
        Numeral n10 = new Numeral(10);
        Numeral n1 = new Numeral(1);
        Numeral n2 = new Numeral(2);
        Numeral n3 = new Numeral(3);
        Square square1 = new Square(n10);
        Subtraction subtraction = new Subtraction(square1,n1);
        Multiplication multiplication = new Multiplication(n2,n3);
        Addition addition = new Addition(subtraction,multiplication);
        Square finalresult = new Square(addition);
        System.out.println(finalresult.toString()+" = "+finalresult.evaluate());

        System.out.println("/------------------------------------------------------/");
        try{
            Numeral n0 = new Numeral(0);
            Division division = new Division(n10,n0);
            System.out.println(division.evaluate());
        }catch (ArithmeticException e){
            System.out.println("Lỗi chia cho 0");
        }

    }
}

package week2.task2;

public class Fraction {

    // TODO: khai báo các thuộc tính
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void setNumerator(int numerator){
        this.numerator = numerator;
    }

    public int getNumerator(){
        return this.numerator;
    }

    public void setDenominator(int denominator){
        this.denominator = denominator;
    }

    public int getDenominator(){
        return this.denominator;
    }

    // Them phuong thuc toi gian phan so
    public void toiGianFraction (){
        int a,b,t;
        a = this.numerator;
        b = this.denominator;
        while (b != 0){
            t = a%b;
            a = b;
            b = t;
        }
        this.numerator = this.numerator/a;
        this.denominator = this.denominator/a;
    }
    // Them phuong thuc in ra phan so da dinh dang
    // Them phuong thuc in ra phan so
    public void showFraction (){
        if (this.numerator < 0 && this.denominator < 0){
            this.numerator = Math.abs(this.numerator);
            this.denominator = Math.abs(this.denominator);
        }
        else if (this.denominator < 0){
            this.numerator = this.numerator*(-1);
            this.denominator = Math.abs(this.denominator);
        }
        if (this.denominator == 1){
            System.out.println(this.numerator);
        }
        else {
            System.out.println(this.numerator + "/" + this.denominator);
        }
    }

    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction _Fr = new Fraction(1,1);
        _Fr.numerator = this.numerator*other.getDenominator()+this.denominator*other.getNumerator();
        _Fr.denominator = this.denominator*other.getDenominator();
        _Fr.toiGianFraction();
        return _Fr;
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction _Fr = new Fraction(1,1);
        _Fr.numerator = this.numerator*other.getDenominator()-this.denominator*other.getNumerator();
        _Fr.denominator = this.denominator*other.getDenominator();
        _Fr.toiGianFraction();
        return _Fr;
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction _Fr = new Fraction(1,1);
        _Fr.numerator = this.numerator*other.getNumerator();
        _Fr.denominator = this.denominator*other.getDenominator();
        _Fr.toiGianFraction();
        return _Fr;
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction _Fr = new Fraction(1,1);
        _Fr.numerator = this.numerator*other.getDenominator();
        _Fr.denominator = this.denominator*other.getNumerator();
        _Fr.toiGianFraction();
        return _Fr;
    }

    public boolean equals(Object obj){

        if(obj instanceof Fraction) {
            Fraction other = (Fraction) obj;
            if(this.numerator*other.getDenominator() == other.getNumerator()*this.denominator)
                return true;
            else
                return false;
        }
        return false;                   //obj ko thuoc lop Fraction
    }

    public static void main (String[] args){
        Fraction ps1 = new Fraction(1,2);
        Fraction ps2 = new Fraction(3,2);
        Fraction ps3 = new Fraction(1,1);
        ps3 = ps1.add(ps2);
        System.out.print(ps1.numerator+"/"+ps1.denominator+" + "+ps2.numerator+"/"+ps2.denominator+" = ");
        ps3.showFraction();
        ps3 = ps1.subtract(ps2);
        System.out.print(ps1.numerator+"/"+ps1.denominator+" - "+ps2.numerator+"/"+ps2.denominator+" = ");
        ps3.showFraction();
        ps3 = ps1.multiply(ps2);
        System.out.print(ps1.numerator+"/"+ps1.denominator+" x "+ps2.numerator+"/"+ps2.denominator+" = ");
        ps3.showFraction();
        ps3 = ps1.divide(ps2);
        System.out.print(ps1.numerator+"/"+ps1.denominator+" / "+ps2.numerator+"/"+ps2.denominator+" = ");
        ps3.showFraction();
        boolean c;
        c = ps1.equals(ps2);
        System.out.println(c);

    }
}

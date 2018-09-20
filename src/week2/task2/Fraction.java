package week2.task2;

public class Fraction {

    // TODO: khai báo các thuộc tính
    int numerator;
    int denominator;

    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction _Fr = new Fraction(1,1);
        _Fr.numerator = this.numerator*other.denominator+this.denominator*other.numerator;
        _Fr.denominator = this.denominator*other.denominator;
        return _Fr;
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction _Fr = new Fraction(1,1);
        _Fr.numerator = this.numerator*other.denominator-this.denominator*other.numerator;
        _Fr.denominator = this.denominator*other.denominator;
        return _Fr;
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction _Fr = new Fraction(1,1);
        _Fr.numerator = this.numerator*other.numerator;
        _Fr.denominator = this.denominator*other.denominator;
        return _Fr;
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction _Fr = new Fraction(1,1);
        _Fr.numerator = this.numerator*other.denominator;
        _Fr.denominator = this.denominator*other.numerator;
        return _Fr;
    }
    public boolean equals(Fraction other){
        if (this.numerator*other.denominator == this.denominator*other.numerator){
            return true;
        }
        else{
            return false;
        }
    }
}

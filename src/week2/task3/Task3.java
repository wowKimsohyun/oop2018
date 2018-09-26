package week2.task3;

public class Task3 {
}

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
class Triangle{
    // Ba cạnh của tam giác
    private double a;
    private double b;
    private double c;

    /**
     * Constructer 1
     * @param a - cạnh của tam giác
     * @param b - cạnh của tam giác
     * @param c - cạnh của tam giác
     */
    public Triangle (int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Setter/Getter
    public void setA(int a) {
        this.a = a;
    }
    public double getA(){
        return this.a;
    }
    public void setB(int b) {
        this.b = b;
    }
    public double getB(){
        return this.b;
    }
    public void setC(int c) {
        this.c = c;
    }
    public double getC(){
        return this.c;
    }

    /**
     * Phương thức tính chu vi của tam giác
     * @return - giá trị chu vi của tam giác
     */
    public double perimeterOfTriangle(){
        double t;
        t = this.a + this.b + this.c;
        return t;
    }

    /**
     * Phương thức tính diện tích của tam giác
     * @return - giá trị diện tích của tam giác
     */
    public double acreageOfTriangle(){
        double t;
        t = (Math.sqrt((this.a+this.b+this.c)*(this.a+this.b-this.c)*(this.b+this.c-this.a)*(this.a+this.c-this.b)))/4;
        return t;
    }

    /**
     * Phương thức kiểm tra loại của tam giác
     */
    public void typeOfTrangle(){
        if (this.a == this.b && this.b == this.c){
            System.out.println("Tam giac vua nhap la tam giac deu");
        }
        else if ((this.a == this.b && this.a*this.a + this.b*this.b == this.c*this.c ) ||
                (this.a == this.c && this.a*this.a + this.c*this.c == this.b*this.b ) ||
                (this.c == b && this.c*this.c + this.b*this.b == this.a*this.a )){
            System.out.println("Tam giac do la tam giac vuong can");
        }
        else if (this.a*this.a + this.b*this.b == this.c*this.c ||
                this.c*this.c + this.b*this.b == this.a*this.a ||
                this.a*this.a + this.c*this.c == this.b*this.b){
            System.out.println("Tam giac do la tam giac vuong");
        }
        else if (this.a == this.b || this.a == this.c || this.c == this.b){
            System.out.println("Tam giac do la tam giac can");
        }
        else {
            System.out.println("Tam giac do la tam giac thuong");
        }
    }
    public static void main (String[] args){
        Triangle t1 = new Triangle(3,3,3);
        Triangle t2 = new Triangle(3,4,5);
        System.out.println(t2.acreageOfTriangle());
        System.out.println(t2.perimeterOfTriangle());
        t2.typeOfTrangle();
    }
}

class ATM {
    private String tenTK;
    private String soTK;
    private double soTien;  // don vi $
    private String tenMK;

    /**
     * Constructer 1
     * @param tenTK - tên chủ tài khoản ATM
     * @param soTK - số tài khoản ATM
     * @param soTien - số tiền trong tài khoản ATM
     * @param tenMK - mật khẩu của tài khoản ATM
     */
    public ATM(String tenTK, String soTK, double soTien, String tenMK){
        this.tenTK = tenTK;
        this.soTK = soTK;
        this.soTien = soTien;
        this.tenMK = tenMK;
    }

    // Getter/Setter
    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    public String getTenTK() {
        return tenTK;
    }

    public void setSoTK(String soTK) {
        this.soTK = soTK;
    }

    public String getSoTK() {
        return soTK;
    }

    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }

    public double getSoTien() {
        return soTien;
    }

    public void setTenMK(String tenMK) {
        this.tenMK = tenMK;
    }

    public String getTenMK() {
        return tenMK;
    }

    /**
     * Phương thức chuyển tiền từ tài khoản ATM này sang tài khoản ATM khác (this và other)
     * @param other - tài khoản muốn chuyển tiền đến
     * @param soTien - số tiền muốn chuyển khoản
     */
    public void chuyenTien (ATM other, double soTien){
        this.soTien = this.soTien - soTien;
        other.soTien = other.soTien + soTien;
        System.out.println("Ban da chuyen tien thanh cong den TK: "+other.getSoTK()+" - "+other.getTenTK());
    }

    /**
     * Phương thức rút tiền từ tài khoản ATM
     * @param soTien - số tiền muốn rút
     */
    public void rutTien (double soTien){
        this.soTien = this.soTien - soTien;
        System.out.println("So tien con lai trong tai khoan cua ban la: "+this.getSoTien()+"$");
    }

    /**
     * Phương thức đổi mật khẩu tài khoản ATM
     * @param tenMK - mật khẩu mới
     */
    public void doiMK(String tenMK){
        this.tenMK = tenMK;
        System.out.println("Ban da doi mat khau thanh cong");
    }
    public static void main (String[] args){
        ATM tk1 = new ATM("Cao Quy Dang", "17020680",2000,"haha");
        ATM tk2 = new ATM("Luong Thi Nhu Nguyet","17020770",1000,"hihi");
        tk1.chuyenTien(tk2,500);
        System.out.println("So tien con lai trong tai khoan cua ban la: "+tk1.getSoTien()+"$");
        tk1.rutTien(200);
        tk1.doiMK("testdoiMK");
    }
}

class Teacher{
    private String name;
    private int age;
    private String sex; // male/female
    private String subjects;

    /**
     * Constructer 1
     * @param name - tên giáo viên
     * @param age - độ tuổi
     * @param sex - giới tính
     * @param subjects - bộ môn giảng dạy
     */
    public Teacher (String name, int age, String sex, String subjects){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.subjects = subjects;
    }// Getter/Setter
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }

    public String getSubjects() {
        return subjects;
    }

    /**
     * Phương thức chào
     */
    public void sayHello(){
        if (this.sex.equals("male")){
            System.out.println("Chao ca lop thay ten la: "+this.name);
        }
        else{
            System.out.println("Chao ca lop co ten la: "+this.name);
        }
    }

    /**
     * Phương thức dạy học
     */
    public void dayhoc(){
        System.out.println("Dang day hoc");
    }

    /**
     * Phương thức nói
     * @param s - chuỗi kí tự muốn nói
     */
    public void speaking (String s){
        System.out.println(s);
    }

    public static void main (String[] args){
        Teacher gv1 = new Teacher("Pham Xuan Nam", 30, "female","Ngu Van");
        gv1.sayHello();
        gv1.speaking("Hom nay chung ta hoc bai Kieu o lau ngung bich");
        gv1.dayhoc();
    }
}

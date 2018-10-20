package week5_6;


import java.awt.*;

abstract class Shape {
    protected Color color;  // màu của hình
    protected int x,y;      // tọa độ tâm của hình theo trục x,y
    protected int vx,vy;    // vận tốc theo trục x,y

    /**
     * Constructer
     * @param color - màu của hình
     * @param x - tọa độ tâm theo trục x
     * @param y - tọa độ tâm theo trục y
     */
    public Shape(String color, int x, int y){
        if(color == "red") {
            this.color = Color.red;
        }
        else if(color == "blue") {
            this.color = Color.blue;
        }
        else if(color == "black") {
            this.color = Color.black;
        }
        else if(color == "cyan") {
            this.color = Color.cyan;
        }
        else if(color == "darkGray") {
            this.color = Color.darkGray;
        }
        else if(color == "gray") {
            this.color = Color.gray;
        }
        else if(color == "green") {
            this.color = Color.green;
        }
        else if(color == "yellow") {
            this.color = Color.yellow;
        }
        else if(color == "lightGray") {
            this.color = Color.lightGray;
        }
        else if(color == "magenta") {
            this.color = Color.magenta;
        }
        else if(color == "orange") {
            this.color = Color.orange;
        }
        else if(color == "pink") {
            this.color = Color.pink;
        }
        else if(color == "white") {
            this.color = Color.white;
        }

        this.x = x;
        this.y = y;
        this.vx = 5;
        this.vy = 5;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public abstract void moving();

}
class Rectangle extends Shape{
    private int cr;
    private int cc;

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getCc() {
        return cc;
    }

    public void setCr(int cr) {
        this.cr = cr;
    }

    public int getCr() {
        return cr;
    }

    /**
     * Constructer
     * @param color - màu của hình chữ nhật
     * @param x - tọa độ tâm theo trục x
     * @param y - tọa độ tâm theo trục y
     * @param cr - chiều rộng
     * @param cc - chiều cao
     */
    public Rectangle(String color, int x, int y, int cr, int cc){
        super(color,x,y);
        this.cr = cr;
        this.cc = cc;
    }

    @Override
    public void moving(){
        if (x + vx < 0 || x + cr + vx > Diagram.getMainFrame().getWidth()){
            vx*=-1;
        }
        if (y + vy < 0 || y + cc + vy > Diagram.getMainFrame().getHeight()){
            vy*=-1;
        }
        x += vx;
        y += vy;
    }
}

class Square extends Shape{
    private int cd;

    /**
     * Khởi tạo hình vuông
     * @param color - màu của hình vuông
     * @param x - tọa độ tâm theo trục x
     * @param y - tọa độ tâm theo trục y
     * @param cd - độ dài của 1 cạnh
     */
    public Square(String color, int x, int y, int cd) {
        super(color, x, y);
        this.cd = cd;
    }

    public void setCd(int rad) {
        this.cd = cd;
    }

    public int getCd() {
        return cd;
    }

    @Override
    public void moving(){
        if (x + vx < 0 || x + cd + vx > Diagram.getMainFrame().getWidth()){
            vx*=-1;
        }
        if (y + vy < 0 || y + cd + vy > Diagram.getMainFrame().getHeight()){
            vy*=-1;
        }
        x += vx;
        y += vy;
    }

}

class Triangle extends Shape{
    private int canh;

    public void setCanh(int canh) {
        this.canh = canh;
    }

    public int getCanh() {
        return canh;
    }

    public Triangle(String color, int x, int y, int canh){
        super(color, x, y);
        this.canh = canh;
    }

    @Override
    public void moving() {

    }
}
class Circle extends Shape {
    private int rad;

    public void setRad(int rad) {
        this.rad = rad;
    }
    public int getRad() {
        return rad;
    }
    /**
     * Constructer
     * @param color - màu của hình tròn
     * @param x - tọa độ tâm theo trục x
     * @param y - tọa dộ tâm theo trục y
     * @param rad - bán kính của hình tròn
     */
    public Circle(String color, int x, int y, int rad){
        super(color,x,y);
        this.rad = rad;
    }

    @Override
    public void moving(){
        if (x + vx < 0 || x + rad + vx > Diagram.getMainFrame().getWidth()){
            vx*=-1;
        }
        if (y + vy < 0 || y + rad + vy > Diagram.getMainFrame().getHeight()){
            vy*=-1;
        }
        x += vx;
        y += vy;
    }
}



package week5_6;

public class Circle extends Shape {
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


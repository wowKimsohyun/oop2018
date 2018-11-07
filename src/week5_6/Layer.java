package week5_6;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Layer extends JPanel {
    private List<Shape> listShape = new ArrayList<>();

    public Layer(){
        listShape.add(0,new Circle("red",100,50,50));
        listShape.add(1,new Circle("blue",300,150,50));
        listShape.add(2,new Circle("pink",200,200,90));
        listShape.add(3,new Circle("blue",300,400,100));
        listShape.add(4,new Circle("pink",150,50,70));
        listShape.add(5,new Circle("cyan",100,200,80));
        listShape.add(6,new Circle("cyan",300,250,70));
        listShape.add(6,new Square("red",250,50,70));
        listShape.add(6,new Square("blue",50,100,70));
        listShape.add(6,new Rectangle("darkGray",470,440,50,90));
        listShape.add(6,new Rectangle("darkGray",70,370,40,70));


        Diagram.getMainFrame().add(this);
    }

    public void removeTriangle(){
        for (int i=0; i < listShape.size(); i++){
            if (listShape.get(i) instanceof Triangle){
                listShape.remove(i);
            }
        }
    }

    public void run() {
        while(true) {
            try {
                Thread.sleep(20);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
            for (int i=0; i < listShape.size() ; i++){
                listShape.get(i).moving();
            }
            repaint();
        }
    }

    public  void paint (Graphics g){
        super.paint(g);
        for (int i = 0; i < listShape.size(); i++){
            if (listShape.get(i) instanceof Circle) {
                int _rad = ((Circle) listShape.get(i)).getRad();
                g.setColor(listShape.get(i).getColor());
                g.fillOval(listShape.get(i).x,listShape.get(i).y,_rad,_rad);
            }
            if (listShape.get(i) instanceof Square){
                int _cd = ((Square)listShape.get(i)).getCd();
                g.setColor(listShape.get(i).getColor());
                g.fillRect(listShape.get(i).x,listShape.get(i).y,_cd,_cd);
            }
            if (listShape.get(i) instanceof Rectangle){
                int _cc = ((Rectangle)listShape.get(i)).getCc();
                int _cr = ((Rectangle)listShape.get(i)).getCr();
                g.setColor(listShape.get(i).getColor());
                g.fillRect(listShape.get(i).x,listShape.get(i).y,_cr,_cc);
            }

        }
    }
}

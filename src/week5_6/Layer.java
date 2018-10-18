package week5_6;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Layer extends JPanel {
    private List<Circle> listShape = new ArrayList<>();

    public Layer(){
        listShape.add(0,new Circle("red",100,50,50));
        listShape.add(1,new Circle("blue",300,150,50));
        listShape.add(2,new Circle("pink",200,200,90));
        listShape.add(3,new Circle("blue",200,150,100));
        listShape.add(4,new Circle("pink",150,50,70));
        listShape.add(5,new Circle("cyan",100,200,80));
        listShape.add(6,new Circle("darkGray",300,250,70));

        Diagram.getMainFrame().add(this);
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
                g.setColor(listShape.get(i).getColor());
                g.fillOval(listShape.get(i).x,listShape.get(i).y,listShape.get(i).getRad(),listShape.get(i).getRad());
            }

        }
    }
}

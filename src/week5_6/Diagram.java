package week5_6;




import javax.swing.*;
import java.util.ArrayList;
import java.util.List;


public class Diagram {
    private static JFrame mainFrame = new JFrame("Ball Moving");
    private static List<Layer> list = new ArrayList<>();

    public static JFrame getMainFrame(){
        return mainFrame;
    }

    public static void main(String[] args) {
        Layer layer1 = new Layer();
        list.add(layer1);
        mainFrame.setSize(600,600);
        mainFrame.setVisible(true);
        //list.get(0).run();
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public void removeCircle(){

    }
}
package week5_6;




import javax.swing.*;
import java.util.ArrayList;
import java.util.List;


public class Diagram {
    private static JFrame mainFrame = new JFrame("Ball Moving");

    public static JFrame getMainFrame(){
        return mainFrame;
    }

    public static void main(String[] args) {
        List<Layer> list = new ArrayList<>();
        list.add(new Layer());
        mainFrame.setSize(400,400);
        mainFrame.setVisible(true);
        list.get(0).run();
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
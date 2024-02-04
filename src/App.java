import javax.swing.*;
import java.awt.*;

public class App {
    
    public static void main(String[] args) throws Exception {
        Dice dice = new Dice();
        JFrame f = new JFrame("test");

        f.setSize(1000, 800);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(dice.roll());
        f.show();
        while(true){
            dice.roll();
            try {
                // Introduce a 1-second (1000 milliseconds) delay
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
    }
}
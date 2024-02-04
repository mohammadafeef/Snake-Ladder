import javax.swing.*;
import java.awt.*;

public class App {
        static Dice dice = new Dice();
        static Board board = new Board();
        static coins red = new coins("/media/afeef/New Volume/Ubuntu/Documents/projects/SnakeNLadder/res/red.png",0);
        static coins yel = new coins("/media/afeef/New Volume/Ubuntu/Documents/projects/SnakeNLadder/res/blue.png",1);
        static JFrame f = new JFrame("test");

    public static void main(String[] args) throws Exception {
       
        f.setSize(840, 950);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.getContentPane().setBackground(Color.decode("#7a3b0d"));
        f.setResizable(false);
        JLayeredPane layers = new JLayeredPane();
        layers.setBounds(0, 0, 840, 950);;

        layers.add(dice.roll(), JLayeredPane.DEFAULT_LAYER);
        layers.add(board.Lboard(), JLayeredPane.DEFAULT_LAYER);
        layers.add(yel.setcoin(1),JLayeredPane.PALETTE_LAYER);
        layers.add(red.setcoin(1),JLayeredPane.PALETTE_LAYER);
        

        f.add(layers);
        f.setVisible(true);
        for(int i=1;i<=100;i++){
            layers.add(yel.setcoin(i),JLayeredPane.PALETTE_LAYER);
            try {
                // Introduce a 1-second (1000 milliseconds) delay
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
    
            }
        }
        
          
  
    }

}
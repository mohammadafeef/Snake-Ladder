import javax.swing.*;
import java.awt.*;

public class App {
        static boolean turn = true;
        static Dice dice = new Dice();
        static Board board = new Board();
        static coins red = new coins("/media/afeef/New Volume/Ubuntu/Documents/projects/SnakeNLadder/res/red.png",0);
        static coins yel = new coins("/media/afeef/New Volume/Ubuntu/Documents/projects/SnakeNLadder/res/blue.png",1);
        static JFrame f = new JFrame("test");
        static JLayeredPane layers = new JLayeredPane();
        static int posA=1, posB=1;
        public static void delay(int time){
            try {
                // Introduce a 1-second (1000 milliseconds) delay
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
    
            }
        }
    public static void main(String[] args) throws Exception {
        
        f.setSize(840, 950);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.getContentPane().setBackground(Color.decode("#7a3b0d"));
        f.setResizable(false);
        
        layers.setBounds(0, 0, 840, 950);;

        layers.add(dice.roll(), JLayeredPane.DEFAULT_LAYER);
        layers.add(board.Lboard(), JLayeredPane.DEFAULT_LAYER);
        layers.add(yel.setcoin(posA),JLayeredPane.PALETTE_LAYER);
        layers.add(red.setcoin(posB),JLayeredPane.PALETTE_LAYER);
        

        f.add(layers);
        f.setVisible(true); 
        while(posA<100 && posB<100 ){
            while(turn){
                delay(100);
            }
            play();
            layers.add(yel.setcoin(posB),JLayeredPane.PALETTE_LAYER);
            delay(500);
            posB = ladder(posB);
            layers.add(yel.setcoin(posB),JLayeredPane.PALETTE_LAYER);
            if(posB==100)break;
            bot();
            layers.add(red.setcoin(posA),JLayeredPane.PALETTE_LAYER);
            delay(500);
            posA = ladder(posA);
            layers.add(red.setcoin(posA),JLayeredPane.PALETTE_LAYER);
                
        }
        
    }
    public static void play(){
        if(!turn){
            dice.roll();
            posB = (posB+dice.value<=100)?posB+dice.value:posB;
            delay(1000);
            turn = true;
        }
    }
    public static void bot(){
        if(turn){
            delay(1000);
            dice.roll();
            posA = (posA+dice.value<=100)?posA+dice.value:posA;
           delay(1000);
        }
    }
    static int ladder(int a){
        switch (a) {
            case 5:return 58;
            case 14:return 49;
            case 38:return 20;
            case 51:return 10;
            case 53:return 72;
            case 64:return 83;
            case 76:return 54;
            case 91:return 73;
            case 97:return 61;
            default:return a;
        }
    }

}
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;


import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Board {
    static JLabel board = new JLabel();
    static int newHeight=800, newWidth=800;
    
    static String path = "/media/afeef/New Volume/Ubuntu/Documents/projects/SnakeNLadder/res/";
    static BufferedImage img;
    static Image boardImg,red,yel;
    public Board(){
           try{
            img = ImageIO.read(new File(path+"board.jpeg"));
            this.boardImg = img.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);       
        }
        catch(Exception e){
            System.out.println("Image not found");
        }
    }
    public static JLabel Lboard(){
        // Create a JLabel to display the image
        board.setBounds(20, 20, newWidth, newHeight);
        board.setIcon(new ImageIcon(boardImg));

        return board;
    }
}


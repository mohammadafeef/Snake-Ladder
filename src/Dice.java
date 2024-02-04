import java.io.File;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.*;

import java.util.Random;
import java.util.random.*;

public class Dice {
    static JLabel dice = new JLabel();
    static JPanel p = new JPanel();
    static JFrame f = new JFrame();
    static int value = 6;
    static String path = "/media/afeef/New Volume/Ubuntu/Documents/projects/SnakeNLadder/res/";
    static BufferedImage img;
    static Image m1,m2,m3,m4,m5,m6;
    Dice(){
        try{
            int newHeight=100, newWidth=100;
            img = ImageIO.read(new File(path+"1.jpeg"));
            this.m1 = img.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
            img = ImageIO.read(new File(path+"2.jpeg"));
            this.m2 = img.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
            img = ImageIO.read(new File(path+"3.jpeg"));
            this.m3 = img.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
            img = ImageIO.read(new File(path+"4.jpeg"));
            this.m4 = img.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
            img = ImageIO.read(new File(path+"5.jpeg"));
            this.m5 = img.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
            img = ImageIO.read(new File(path+"6.jpeg"));
            this.m6 = img.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
        }
        catch(Exception e){
            System.out.println("Image not found");
        }
    }
    public static JLabel roll(){
        // Create a JLabel to display the image
        Random val = new Random();
        value = val.nextInt(6)+1;
        switch (value) {
            case 1:dice.setIcon(new ImageIcon(m1));
                    break;
            case 2:dice.setIcon(new ImageIcon(m2));
                    break;
            case 3:dice.setIcon(new ImageIcon(m3));
                    break;
            case 4:dice.setIcon(new ImageIcon(m4));
                    break;
            case 5:dice.setIcon(new ImageIcon(m5));
                    break;
            case 6:dice.setIcon(new ImageIcon(m6));
                    break;
            default:
                break;
        }
        
        return dice;
    }

}

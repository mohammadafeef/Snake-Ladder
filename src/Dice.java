import java.io.File;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.MouseEvent;

import java.util.Random;
import java.util.random.*;

public class Dice {
    static JLabel dice = new JLabel();
    static int newHeight=100, newWidth=100;
    static int value = 6;
    static String path = "/media/afeef/New Volume/Ubuntu/Documents/projects/SnakeNLadder/res/";
    static BufferedImage img;
    static Image m1,m2,m3,m4,m5,m6;
    Dice(){
        dice.addMouseListener(new MouseAdapter() {
             
            @Override
            public void mouseClicked(MouseEvent e) {
                // Handle the click event
                        App.turn=false;
                }
        }
        );
        try{
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
    public JLabel roll(){
        // Create a JLabel to display the image
        dice.setBounds(370, 830, newWidth, newHeight);
        Random val = new Random();
        value = val.nextInt(6)+1;
        for(int i=0;i<=6;i++){
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
            try {
                // Introduce a 1-second (1000 milliseconds) delay
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

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

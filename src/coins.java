import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class coins {
    JLabel coin = new JLabel();
    static int coinHeight=60, coinWidth=40;
    BufferedImage img;
    Image pice;
    int layer;
    int posx,posy;
    int basex,basey;
    public coins(String path,int layer){
        this.layer = layer;
        basex = 40+layer*10;
        basey = 750-layer*10;
        try{
            img = ImageIO.read(new File(path));
            this.pice = img.getScaledInstance(coinWidth, coinHeight, Image.SCALE_SMOOTH);
            
        }
        catch(Exception e){
            System.out.println("Image not found");
        }
    }
    public JLabel setcoin(int x){
        x--;
        int tens = x/10, ones = x%10;
        posx = basex + ((tens%2==0)?ones:(9-ones))*80;
        posy = basey - tens*80;
        coin.setBounds(posx, posy, coinWidth, coinHeight);
        coin.setIcon(new ImageIcon(pice));

        return coin;
    }
    
}

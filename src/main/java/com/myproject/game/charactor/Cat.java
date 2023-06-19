
package com.myproject.game.charactor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;


public class Cat {
    
    public int x, y, health = 200;
    static int speed = 90;
    
    public Cat() {
        
    }

    public Cat(int x, int y) {
        this.x = x;
        this.y = y;

    }
    
    public void jump(JPanel game) {
        this.y -= speed;
        game.repaint();
        Timer timer = new Timer(450, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                y += speed;
                game.repaint();
            }   
        });
        timer.setRepeats(false);
        timer.start();
    }
    
     //Cat image
    public BufferedImage getImage() {
        BufferedImage image = null;
        try {
            image = ImageIO.read(new File("img\\dog.png"));
            return image;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return image;
    }
    
    
    
}

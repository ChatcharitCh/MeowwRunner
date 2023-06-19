
package com.myproject.game.charactor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;


public class Cat {
    
    public int x, y, catSize, health;
    private int jumpHigh = 100;

    public Cat(int x, int y, int catSize, int health) {
        this.x = x;
        this.y = y;
        this.catSize = catSize;
        this.health = health;
    }
    
    public void jump(JPanel game) {
        this.y -= jumpHigh;
        game.repaint();
        Timer timer = new Timer(450, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                y += jumpHigh;
                game.repaint();
            }   
        });
        timer.setRepeats(false);
        timer.start();
    }
    
    // Cat image
//    public BufferedImage getImage() {
//        BufferedImage image = null;
//        try {
//            image = ImageIO.read(new File("img\\cat.png"));
//            return image;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return image;
//    }
    
    
    
}

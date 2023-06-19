
package com.myproject.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;


public class Cat {
    
    public int x, y, catSize;
    private int jumpHigh = 50;

    public Cat(int x, int y, int catSize) {
        this.x = x;
        this.y = y;
        this.catSize = catSize;
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
    
}

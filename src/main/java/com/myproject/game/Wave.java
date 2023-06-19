
package com.myproject.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;


public class Wave {
    public int x, y, width, height, gameSpeed, xStart;

    public Wave(int x, int y, int w, int h, int s, JPanel game) {
        this.x = x;
        this.xStart = x;
        this.y = y;
        this.width = w;
        this.height = h;
        this.gameSpeed = s;
        move(game);
    }
    
    public void move(JPanel game) {
        Timer timer = new Timer(50, new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                x -= gameSpeed;
                game.repaint();
                if (x < 0) {
                    x = xStart;
                }
            }
        });
        timer.start();
    }
    
}

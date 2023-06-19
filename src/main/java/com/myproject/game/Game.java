

package com.myproject.game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;


public class Game extends JPanel  implements KeyListener{

    Cat cat = new Cat(50, 300, 50);
    
    public Game() {
        this.setBounds(0, 0, 1000, 600);
        this.addKeyListener(this);
        this.setFocusable(true); // focus window
        this.setLayout(null); // manaul setting layout
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.red);
        g2.drawRect(cat.x, cat.y, cat.catSize, 50);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == 38 || e.getKeyCode() == 32) {
            cat.jump(this);
            this.repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
       
    }
    
}

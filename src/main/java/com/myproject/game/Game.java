

package com.myproject.game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;


public class Game extends JPanel {

    public Game() {
        this.setBounds(0, 0, 1000, 600);
        this.setFocusable(true); // focus window
        this.setLayout(null); // manaul setting layout
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.red);
        g2.drawRect(50, 50, 50, 50);
    }
    
}

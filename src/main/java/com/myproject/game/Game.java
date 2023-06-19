

package com.myproject.game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;


public class Game extends JPanel  implements KeyListener{

    Cat cat = new Cat(50, 300, 50);
    Wave wave = new Wave(800, 300, 30, 40, 30, this);
    int gameSpeed = 30;
    Wave[] waveSet = makeWaveSet(4);
    
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
        g2.setColor(Color.black);
        for (Wave wave : waveSet) {
            g2.drawRect(wave.x, wave.y, wave.width, wave.height);
        }   
    }
    
    private Wave[] makeWaveSet(int waveNumber) {
        Wave[] waveSet = new Wave[waveNumber];
        for (int i = 0; i < waveNumber; i++) {
            double waveLocation = 1000 + Math.floor(Math.random() * 1000);
            waveSet[i] = new Wave((int)waveLocation, 300 , 30, 40, 30, this);
        }
        return waveSet;
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

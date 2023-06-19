
package com.myproject.game.display;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;


public class Display extends JFrame implements ActionListener {
    
    
    // create JFrame
    public Display() {
        this.setTitle("Meowww~~~~~~");
        this.setSize(1000, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(300, 200);
        this.setVisible(true);
        this.getContentPane().add(new Game());
    }
    
    public void removeContent() {
        this.getContentPane().removeAll();
        this.getContentPane().repaint();
    }

    public void endGame(long point) {
        removeContent();
        this.getContentPane().add(new Menu(point, this));
    }
    
    @Override
    public void actionPerformed(ActionEvent event) {
        if(event.getActionCommand().equals("Restart")) {
            removeContent();
            Game game = new Game();
            this.getContentPane().add(game);
            game.requestFocus();
        }
    }
    
    
}

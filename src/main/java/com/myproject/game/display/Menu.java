package com.myproject.game.display;

import com.myproject.game.element.ElementButton;
import com.myproject.game.element.ElementLabel;
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

public class Menu extends JPanel {

    public long point;

    public Menu() {

    }

    public Menu(long point, ActionListener main) {
        try {
            this.point = point;
            this.setBackground(new Color(3041, 98, 65));
            this.setBounds(0, 0, 1000, 600);
            this.setFocusable(true);
            this.setLayout(null);

            ElementLabel status = new ElementLabel("You Died!", 40, 400, 100, 200, 100);
            status.setForeground(Color.white);

            ElementLabel showPoint = new ElementLabel("Total : " + this.point, 30, 400, 200, 200, 100);
            showPoint.setForeground(Color.white);

            ElementButton restart = new ElementButton("restart", 15, 380, 300, 200, 50);
            restart.addActionListener(main);

            this.add(showPoint);
            this.add(status);
            this.add(restart);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

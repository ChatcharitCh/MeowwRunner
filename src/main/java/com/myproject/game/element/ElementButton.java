
package com.myproject.game.element;

import java.awt.Color;
import javax.swing.JButton;


public class ElementButton extends JButton{
        public ElementButton(String title, int size, int x, int y, int width, int height) {
        super(title);
        this.setBackground(new Color(18, 100, 250));
        this.setForeground(Color.red);
        this.setFont(Element.getFont(size));
        this.setBounds(x, y, width, height);
    }
}

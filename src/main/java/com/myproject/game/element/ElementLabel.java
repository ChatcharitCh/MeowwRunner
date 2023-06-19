
package com.myproject.game.element;

import javax.swing.JLabel;


public class ElementLabel extends JLabel {
    public ElementLabel(String title, int size, int x, int y, int width, int height){
        super(title);
        setFont(Element.getFont(size));
        setBounds(x, y, width, height);
    }
}

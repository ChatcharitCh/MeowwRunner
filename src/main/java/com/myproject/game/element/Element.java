
package com.myproject.game.element;

import java.awt.Font;
import java.io.File;
import javax.swing.JButton;


public class Element extends JButton{
    
    public static Font getFont(int size) {
        Font font = null;
        try {
            font = font.createFont(Font.TRUETYPE_FONT, new File("font\\Mali-Bold.ttf"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return font;
    }
    
}


package com.myproject.game;


public class Cat {
    
    public int x, y, catSize;
    private int JumpHight = 50;

    public Cat(int x, int y, int catSize) {
        this.x = x;
        this.y = y;
        this.catSize = catSize;
    }
    
    public void jump() {
        this.y -= JumpHight;
    }
    
}

package com.myproject.game.event;

import com.myproject.game.charactor.Wave;
import com.myproject.game.charactor.Cat;
import com.myproject.game.charactor.Environment;

public class Event {

    public static boolean checkHit(Cat cat, Wave wave, int catSize, int waveHeight) {
        if (cat.x + catSize > wave.x && cat.x < wave.x) {
            if (cat.y + catSize >= wave.y - waveHeight) {
                return true;
            }
        }
        return false;
    }

    public static void gameStop(Wave[] wave, Environment[] env) {

    }
}

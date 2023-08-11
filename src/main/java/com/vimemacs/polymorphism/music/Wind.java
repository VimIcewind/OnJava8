package com.vimemacs.polymorphism.music;

/**
 * Wind objects are instruments
 * because they haave the same interface
 * @author HWD
 * @date 2023/8/9 16:29
 */
public class Wind extends Instrument {
    // Redefine interface method:
    @Override
    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }
}

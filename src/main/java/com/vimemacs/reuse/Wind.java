package com.vimemacs.reuse;

/**
 * Inheritance & upcasting
 * @author HWD
 * @date 2023/8/9 11:03
 */

class Instrument {
    public void play() {
        
    }
    
    static void tune(Instrument i) {
        // ...
        i.play();
    }
}

// Wind objects are instruments
// because they have the same interface:
public class Wind extends Instrument {
    public static void main(String[] args) {
        Wind flute = new Wind();
        Instrument.tune(flute); // Upcasting
    }
}

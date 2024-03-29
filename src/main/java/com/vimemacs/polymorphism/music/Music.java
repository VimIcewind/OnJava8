package com.vimemacs.polymorphism.music;

/**
 * Inheritance & upcasting
 * @author HWD
 * @date 2023/8/9 16:31
 */
public class Music {
    public static void tune(Instrument i) {
        // ...
        i.play(Note.MIDDLE_C);
    }
    
    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute); // Upcasting
    }
}
/* Output:
Wind.play() MIDDLE_C
*/
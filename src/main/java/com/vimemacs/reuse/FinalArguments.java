package com.vimemacs.reuse;

/**
 * Using "final" with method arguments
 * @author HWD
 * @date 2023/8/9 14:28
 */

class Gizmo {
    public void spin() {
        
    }
}

public class FinalArguments {
    void with(final Gizmo g) {
        //- g = new Gizmo(); // Illegal -- g is final
    }
    
    void without(Gizmo g) {
        g = new Gizmo(); // OK -- g is not final
        g.spin();
    }
    
    // void f(final int i) { i++; } // Can't change
    // You can only read from a final primitive
    int g(final int i) {
        return i + 1;
    }

    public static void main(String[] args) {
        FinalArguments bf = new FinalArguments();
        bf.without(null);
        bf.with(null);
    }
}

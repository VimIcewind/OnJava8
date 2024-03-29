package com.vimemacs.reuse;

/**
 * Overloading a base-class method name in a derived
 * class does not hide the base-class versions
 * @author HWD
 * @date 2023/8/7 15:57
 */

class Homer {
    char doh(char c) {
        System.out.println("doh(char)");
        return 'd';
    }
    
    float doh(float f) {
        System.out.println("doh(float)");
        return 1.0f;
    }
}

class Milhouse {
    
}

class Bart extends Homer {
    void doh(Milhouse m) {
        System.out.println("doh(Milhouse)");
    }
}

public class Hide {
    public static void main(String[] args) {
        Bart b = new Bart();
        b.doh(1);
        b.doh('x');
        b.doh(1.0f);
        b.doh(new Milhouse());
    }
}
/* Output:
doh(float)
doh(char)
doh(float)
doh(Milhouse)
*/
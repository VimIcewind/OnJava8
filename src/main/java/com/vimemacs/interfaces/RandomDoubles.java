package com.vimemacs.interfaces;

import java.util.Random;

/**
 * @author HWD
 * @date 2023/8/18 10:42
 */
public interface RandomDoubles {
    Random RAND = new Random(47);
    
    default double next() {
        return RAND.nextDouble();
    }
    
    static void main(String[] args) {
        RandomDoubles rd = new RandomDoubles() {};
        for (int i = 0; i < 7; i++) {
            System.out.println(rd.next() + " ");
        }
    }
}
/* Output:
0.7271157860730044 
0.5309454508634242 
0.16020656493302599 
0.18847866977771732 
0.5166020801268457 
0.2678662084200585 
0.2613610344283964 
*/
package com.vimemacs.polymorphism;

/**
 * Cleaning up shared member objects
 * @author HWD
 * @date 2023/8/14 15:51
 */

class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;
    
    Shared() {
        System.out.println("Creating " + this);
    }
    
    public void addRef() {
        refcount++;
    }
    
    protected void dispose() {
        if (--refcount == 0) {
            System.out.println("Disposing " + this);
        }
    }
    
    @Override
    public String toString() {
        return "Shared " + id;
    }
}

class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;
    
    Composing(Shared shared) {
        System.out.println("Creating " + this);
        this.shared = shared;
        this.shared.addRef();
    }
    
    protected void dispose() {
        System.out.println("disposing " + this);
        shared.dispose();
    }
    
    @Override
    public String toString() {
        return "Composing " + id;
    }
}

public class ReferenceCounting {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composing = {
                new Composing(shared),
                new Composing(shared),
                new Composing(shared),
                new Composing(shared),
                new Composing(shared),
        };
        for (Composing c: composing) {
            c.dispose();
        }
    }
}
/* Output:
Creating Shared 0
Creating Composing 0
Creating Composing 1
Creating Composing 2
Creating Composing 3
Creating Composing 4
disposing Composing 0
disposing Composing 1
disposing Composing 2
disposing Composing 3
disposing Composing 4
Disposing Shared 0
*/
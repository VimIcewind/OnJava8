package com.vimemacs.reuse;

/**
 * It only looks like you can override
 * a private or private final method
 * @author HWD
 * @date 2023/8/9 14:41
 */

class WithFinals {
    // Indentical to "private" alone:
    private final void f() {
        System.out.println("WithFinals.f()");
    }
    
    // Also automatically "final":
    private void g() {
        System.out.println("WithFinals.g()");
    }
}

class OverridingPrivate extends WithFinals {
    private final void f() {
        System.out.println("OverridingPrivate.f()");
    }

    private void g() {
        System.out.println("OverridingPrivate.g()");
    }
}

class OverridingPrivate2 extends OverridingPrivate {
    private final void f() {
        System.out.println("OverridingPrivate2.f()");
    }
    
    private void g() {
        System.out.println("OverridingPrivate2.g()");
    }
}

public class FinalOverridingIllusion {
    public static void main(String[] args) {
        OverridingPrivate2 op2 = new OverridingPrivate2();
        //- op2.f();
        //- op2.g();
        // You can upcast:
        OverridingPrivate op = op2;
        // But you can't call the methods:
        //- op.f();
        //- op.g();
        // Same here
        WithFinals wf = op2;
        //- wf.f();
        //- wf.g();
    }
}

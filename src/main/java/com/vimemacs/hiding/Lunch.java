package com.vimemacs.hiding;

/**
 * Demonstrates class access specifiers. Make a class
 * effectively private with private constructors
 * @author HWD
 * @date 2023/1/24 22:41
 */
class Soup1 {
    private Soup1() {
    }

    public static Soup1 makeSoup() {
        return new Soup1();
    }
}

class Soup2 {
    private Soup2() {
    }

    private static Soup2 ps1 = new Soup2();

    public static Soup2 access() {
        return ps1;
    }

    public void f() {
    }
}

// Only one public class allowed per file
public class Lunch {
    void testPrivate() {
        // Can't do this! Private constructor
        //- Soup1 soup = new Soup1();
    }

    void testStatic() {
        Soup1 soup = Soup1.makeSoup();
    }

    void testSingleton() {
        Soup2.access().f();
    }

    public static void main(String[] args) {
        Lunch lunch = new Lunch();
        lunch.testPrivate();
        lunch.testStatic();
        lunch.testSingleton();
    }
}

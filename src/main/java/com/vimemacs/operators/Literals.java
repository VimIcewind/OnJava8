package com.vimemacs.operators;

/**
 * @author HWD
 * @date 2022/12/21 14:05
 */
public class Literals {
    public static void main(String[] args) {
        int i1 = 0x2f;
        System.out.println("i1: " + Integer.toBinaryString(i1));
        int i2 = 0X2F;
        System.out.println("i2: " + Integer.toBinaryString(i2));
        int i3 = 0177;
        System.out.println("i3: " + Integer.toBinaryString(i3));
        char c = 0xffff; // 最大 char 型 16 进制值
        System.out.println("c: " + Integer.toBinaryString(c));
        byte b = 0x7f; // 最大 byte 型 16 进制值 01111111
        System.out.println("b: " + Integer.toBinaryString(b));
        short s = 0x7fff; // 最大 short 型 16 进制值
        System.out.println("s: " + Integer.toBinaryString(s));
        long n1 = 200L;
        long n2 = 200l;
        long n3 = 200;

        byte blb = (byte)0b00110101;
        System.out.println("blb: " + Integer.toBinaryString(blb));
        short bls = (short)0B0010111110101111;
        System.out.println("bls: " + Integer.toBinaryString(bls));
        int bli = 0b00101111101011111010111110101111;
        System.out.println("bli: " + Integer.toBinaryString(bli));
        long bll = 0b00101111101011111010111110101111;
        System.out.println("bll: " + Long.toBinaryString(bll));
        float f1 = 1;
        float f2 = 1F;
        float f3 = 1f;
        double d1 = 1d;
        double d2 = 1D;
    }
}

package com.vimemacs.objects;

/**
 * @author HWD
 * @date 2021/11/17 10:17
 */
public class ShowProperties {
    public static void main(String[] args) {
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("java.library.path"));
    }
}

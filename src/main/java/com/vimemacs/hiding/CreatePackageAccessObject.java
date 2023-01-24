package com.vimemacs.hiding;

import com.vimemacs.hiding.packageaccess.*;
/**
 * @author HWD
 * @date 2023/1/24 22:01
 * {WillNotCompile}
 * error: PublicConstructor is not public in com.vimemacs.hiding.packageaccess;
 * cannot be accessed from outside package
 */
public class CreatePackageAccessObject {
    public static void main(String[] args) {
        //- new PublicConstructor();
    }
}

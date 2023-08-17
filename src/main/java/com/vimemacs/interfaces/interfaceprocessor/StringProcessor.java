package com.vimemacs.interfaces.interfaceprocessor;

import java.util.Arrays;

/**
 * @author HWD
 * @date 2023/8/17 14:23
 */
public interface StringProcessor extends Processor {
    @Override
    String process(Object input); // [1]
    String S = "If she weighs the same as a duck, she's make of wood"; // [2]
    
    static void main(String[] args) { // [3]
        Applicator.apply(new Upcase(), S);
        Applicator.apply(new Downcase(), S);
        Applicator.apply(new Splitter(), S);
    }
}
/* Output:
Using Processor Upcase
IF SHE WEIGHS THE SAME AS A DUCK, SHE'S MAKE OF WOOD
Using Processor Downcase
if she weighs the same as a duck, she's make of wood
Using Processor Splitter
[If, she, weighs, the, same, as, a, duck,, she's, make, of, wood]
*/

class Upcase implements StringProcessor {
    // 返回协变类型
    @Override
    public String process(Object input) {
        return ((String) input).toUpperCase();
    }
}

class Downcase implements StringProcessor {
    @Override
    public String process(Object input) {
        return ((String) input).toLowerCase();
    }
}

class Splitter implements StringProcessor {

    @Override
    public String process(Object input) {
        return Arrays.toString(((String) input).split(" "));
    }
}

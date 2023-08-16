package com.vimemacs.interfaces;

/**
 * @author HWD
 * @date 2023/8/16 10:32
 */
abstract class AbstractAccess {
    private void m1() {
        
    }
    
    // private abstract void m1a(); // error: illegal combination of modifiers: abstract and private
    
    protected void m2() {
        
    }
    
    protected abstract void m2a();
    
    void m3() {
        
    }
    
    abstract void m3a();
    
    public void m4() {
        
    }
    
    public abstract void m4a();
}

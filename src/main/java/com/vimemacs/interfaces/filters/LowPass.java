package com.vimemacs.interfaces.filters;

/**
 * @author HWD
 * @date 2023/8/17 14:10
 */
public class LowPass extends Filter {
    double cutoff;
    
    public LowPass(double cutoff) {
        this.cutoff = cutoff;
    }

    @Override
    public Waveform process(Waveform input) {
        return input; // Dummy processing 哑处理
    }
}

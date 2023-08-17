package com.vimemacs.interfaces.filters;

/**
 * @author HWD
 * @date 2023/8/17 14:12
 */
public class HighPass extends Filter {
    double cutoff;

    public HighPass(double cutoff) {
        this.cutoff = cutoff;
    }

    @Override
    public Waveform process(Waveform input) {
        return input;
    }
}

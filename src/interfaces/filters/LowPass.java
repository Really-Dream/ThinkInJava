package interfaces.filters;

/**
 * Created by H.J
 * 2018/5/24
 */
public class LowPass extends Filter{
    double cutoff;
    public LowPass(double cutoff){
        this.cutoff = cutoff;
    }
    public Waveform process(Waveform input){
        return input;
    }
}

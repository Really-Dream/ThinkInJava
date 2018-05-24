package interfaces.filters;

/**
 * Created by H.J
 * 2018/5/24
 */
public class HighPass extends Filter {
    double cutoff;
    public HighPass(double cutoff){
        this.cutoff = cutoff;
    }
    public Waveform process(Waveform input){
        return input;
    }
}

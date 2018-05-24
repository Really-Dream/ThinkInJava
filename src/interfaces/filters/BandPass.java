package interfaces.filters;

/**
 * Created by H.J
 * 2018/5/24
 */
public class BandPass extends Filter {
    double lowCutoff,highCutoff;
    public BandPass(double lowCutoff,double highCutoff){
        lowCutoff = lowCutoff;
        highCutoff = highCutoff;
    }
    public Waveform process(Waveform input){
        return input;
    }
}

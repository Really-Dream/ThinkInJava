package interfaces.filters;

/**
 * Created by H.J
 * 2018/5/24
 */
public class Filter {
    public String name(){
        return getClass().getSimpleName();
    }
    public Waveform process(Waveform input){
        return input;
    }
}

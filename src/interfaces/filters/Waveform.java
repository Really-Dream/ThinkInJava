package interfaces.filters;

/**
 * Created by H.J
 * 2018/5/24
 */
public class Waveform {
    private static long counter;
    private final long id = counter++;
    public String toString(){
        return "Waveform " + id;
    }
}

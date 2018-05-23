package polymorphism.music;

/**
 * Created by H.J
 * 2018/5/23
 */
public class Wind extends Instrument{
    public void play(Note n){
        System.out.println("Wind play() " + n);
    }
}

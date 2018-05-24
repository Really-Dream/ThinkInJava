package interfaces.music5;

import polymorphism.music.Note;

/**
 * Created by H.J
 * 2018/5/24
 */
interface Instrument{
    int VALUE = 5;
    void play(Note n);
    void adjust();
}

class Wind implements Instrument{

    @Override
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }

    @Override
    public void adjust() {
        System.out.println(this + " .adjust()");
    }

    public String toString(){
        return "Wind";
    }
}

class Percussion implements Instrument{
    @Override
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }

    @Override
    public void adjust() {
        System.out.println(this + " .adjust()");
    }

    public String toString(){
        return "Percussion";
    }
}

class Stringed implements Instrument{
    @Override
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }

    @Override
    public void adjust() {
        System.out.println(this + " .adjust()");
    }

    public String toString(){
        return "Stringed";
    }
}

class Brass extends Wind{
    public String toString(){return "Brass";}
}

class Woodwind extends Wind{
    public String toString(){
        return "Woodwind";
    }
}

public class Music5 {
    static void tune(Instrument i){
        i.play(Note.MIDDLE_C);
    }
    static void tuneAll(Instrument[] e){
        for(Instrument i : e){
            tune(i);
        }
    }
    public static void main(String[] args){
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }

}

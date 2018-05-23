package polymorphism;

/**
 * Created by H.J
 * 2018/5/23
 */
class Grain{
    public String toString(){
        return "Grain";
    }
}

class Wheat extends Grain{
    public String toString(){
        return "Wheat";
    }
}

class Mill{
    Grain proccess(){
        return new Grain();
    }
}

class WheatMile extends Mill{
    Wheat process(){
        return new Wheat();
    }
}

public class CovariantReturn {
    public static void main(String[] args){
        Mill m = new Mill();
        Grain g = m.proccess();
        System.out.println(g);
        m = new WheatMile();
        g = m.proccess();
        System.out.println(g);
    }
}

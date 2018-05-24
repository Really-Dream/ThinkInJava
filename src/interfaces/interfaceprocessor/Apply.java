package interfaces.interfaceprocessor;

/**
 * Created by H.J
 * 2018/5/24
 */
public class Apply {
    public static void process(Processor p,Object s){
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(s));
    }
}

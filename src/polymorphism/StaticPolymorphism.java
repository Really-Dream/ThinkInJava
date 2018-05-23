package polymorphism;

/**
 * Created by H.J
 * 2018/5/23
 */
class StaticSuper{
    public static String staticGet(){
        return "Base staticGet()";
    }
    public String dynamicGet(){
        return "Base dynamicGet()";
    }
}

class StaticSub extends StaticSuper{
    public static String staticGet(){
        return "Derived staticGet()";
    }
    public String dynamicGet(){
        return "Derived dynamicGet()";
    }
}

public class StaticPolymorphism {
    public static void main(String[] args){
        StaticSuper sup = new StaticSub();
        System.out.println(StaticSuper.staticGet());
        System.out.println(sup.dynamicGet());
    }
}

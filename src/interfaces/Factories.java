package interfaces;

/**
 * Created by H.J
 * 2018/5/24
 */
interface Service{
    void method1();
    void method2();
}

interface ServiceFactory{
    Service getService();
}

class Implementationl1 implements Service{
    Implementationl1(){}
    public void method1(){
        System.out.println("Implementationl1 method1");
    }
    public void method2(){
        System.out.println("Implementationl1 method2");
    }
}

class Implemention1Factory implements ServiceFactory{
    public Service getService(){
        return new Implementationl1();
    }
}

class Implementationl2 implements Service{
    Implementationl2(){}
    public void method1(){
        System.out.println("Implementationl2 method1");
    }
    public void method2(){
        System.out.println("Implementationl2 method2");
    }
}

class Implemention2Factory implements ServiceFactory{
    public Service getService(){
        return new Implementationl2();
    }
}

public class Factories {
    public static void serviceConsumer(ServiceFactory fact){
        Service s = fact.getService();
        s.method1();
        s.method2();
    }
    public static void main(String[] args){
        serviceConsumer(new Implemention1Factory());
        serviceConsumer(new Implemention2Factory());
    }

}

package IO.serialize;


import java.io.*;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by H.J
 * 2018/5/19
 * transient关键字，不被序列化
 */
public class Logon implements Serializable {
    private Date date = new Date();
    private  String username;
    private transient String password;
    public Logon(String name,String pwd){
        this.username = name;
        this.password = pwd;
    }

    public String toString(){
        return "Logon info : \n username: "+username + "\n data: " + date + "\n password: "+password;
    }

    public static void main(String args[])throws Exception{
        Logon a = new Logon("Hulk","myLittlePony");
        System.out.println("Logon a = "+a);
        ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("Logon.out"));
        o.writeObject(a);
        o.close();
        TimeUnit.SECONDS.sleep(1);

        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("Logon.out")
        );
        System.out.println("Recovering object at " + new Date());
        a = (Logon)in.readObject();
        System.out.println("Logon a = "+ a);
    }
}

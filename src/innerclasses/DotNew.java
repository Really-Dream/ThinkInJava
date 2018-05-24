package innerclasses;

/**
 * Created by H.J
 * 2018/5/24
 */
public class DotNew {
    public class Inner{}
    public static void main(String[] args){
        DotNew dn = new DotNew();
        DotNew.Inner dni = dn.new Inner();
    }
}

package holding;

import java.util.ArrayList;

/**
 * Created by H.J
 * 2018/5/28
 */
public class ApplesAndOrangesWithGenerics {
    public static void main(String[] args){
        ArrayList<Apple> apples = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            apples.add(new Apple());
        }
        for(int i = 0; i < apples.size(); i++){
            System.out.println(apples.get(i).id());
        }
        for(Apple c : apples){
            System.out.println(c.id());
        }
    }
}

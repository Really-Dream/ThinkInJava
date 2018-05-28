package holding;

import java.util.*;

/**
 * Created by H.J
 * 2018/5/28
 */
public class AddingGroups {
    public static void main(String[] args){
        Collection<Integer> collection = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Integer[] moreInts = {6,7,8,9,10};
        collection.addAll(Arrays.asList(moreInts));


        Collections.addAll(collection,11,12,13,14,15);
        Collections.addAll(collection,moreInts);

        //asList创建的List，长度固定
        List<Integer> list = Arrays.asList(16,17,18,19,20);
        list.set(1,99);
        list.add(21);
        for(Integer i : list){
            System.out.println(i);
        }
    }
}

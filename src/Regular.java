import java.util.Arrays;

/**
 * Created by H.J
 * 2018/4/27
 */
public class Regular {

    public static void main(String[] args){
        //是否以大写字母开头，句号结尾
        System.out.println("Wsda.".matches("^[A-Z].*.$"));

        String knights = "Then ,when you have found the shrubbery, you must cut down the mightiest tree in the forest... with... a herring!";

        //在the和you处分割
        String[] list = knights.split("the|you");
        System.out.println(Arrays.toString(list));

        //用下划线替换所有元音字母
        System.out.println(knights.replaceAll("a|e|i|o|u","_"));
        System.out.println(knights.replaceAll("[aeiou]","_"));

        int[] a = new int[12];
        int[] b = a;
        a[0] = 3;

        int c = 4;
        int d = c;
        c = 5;

        String e = "s";
        String f = e;
        e = "3";
        System.out.println(f);
        System.out.println(d);
        System.out.println(Arrays.toString(b));
    }
}

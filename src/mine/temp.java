package mine;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class temp {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer();
        Map<Integer, Integer> map  = new HashMap<>();
        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
//        int a = 7, b = 7;
//        while (b != 0) {
//            int c = (a & b) << 1;
//            a = a ^ b;
//            b = c;
//        }
//        System.out.println(a);
//        System.out.println(1&1);

//        int m = 1;
//        int temp = 3;
//        while ((m & temp) == 0) {
//            m = m<<1;
//        }
        // 分割符
        String str = "havananvzxnnANDvlzkvnznvANDlzvknkvnakANDdnvvz";
        String[] res = str.split("AND");
        for (String s1 : res) {
            System.out.println(s1);
        }
    }
}

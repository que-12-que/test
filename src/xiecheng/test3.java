package xiecheng;

import java.util.*;

/**
 * 游游拿到一个正整数n，希望找到一对正整数想x,y,满足|x！ * y - y - n|最小，且x,y都不等于2.
 * 输入：一个正整数n
 * 输出：两个正整数，分别表示x,y
 * 2
 * 1 1
 *
 * 25
 * 3 5
 */
public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double t = Math.sqrt(n);
        int MIN = Integer.MAX_VALUE;
        Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
//        int[] value = new int[n];
        for (int i = 1; i <= t; i++) {
            if (i == 2) {
                continue;
            } else {
                int N = getN(i);
                for (int j = 1; j <= t; j++) {
                    List<Integer> list = new ArrayList<>();
                    if (j == 2) {
                        continue;
                    } else {
                        int temp = Math.abs(N*j-j-n);
                        list.add(i);
                        list.add(j);
                        map.put(temp, list);
                    }
                }
            }
        }
        Iterator<Map.Entry<Integer, List<Integer>>> iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<Integer, List<Integer>> entry = iter.next();
            if (entry.getKey() < MIN) {
                MIN = entry.getKey();
            }
        }
        List<Integer> res = map.get(MIN);
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }

    }
    public static int getN(int n) {
        if (n == 1) return 1;
        return getN(n-1)*n;
    }
}

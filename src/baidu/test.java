package baidu;
/**
 * 字符串能否重新排列成Baidu
 *
 * 输入：第一行一个t，表示t组输入
 * 之后t行字符串
 * 返回Yes or No
 *
 * ac
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String[] strs = new String[t];
        for(int i = 0; i < t; i++){
            strs[i] = sc.next();
        }

        for (int i = 0; i < t; i++) {
            String s = strs[i];
            Map<Character, Integer> map = new HashMap<>();
            if (s.length() != 5) {
                System.out.println("No");
                continue;
            }
            for (int j = 0; j < s.length(); j++) {
                map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
            }
            if (map.containsKey('B') && map.containsKey('a') && map.containsKey('i') &&
                    map.containsKey('d') && map.containsKey('u')) {
                if (map.get('B') == 1 && map.get('a') == 1 && map.get('i') == 1
                        && map.get('d') == 1 && map.get('u') == 1) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            } else {
                System.out.println("No");
            }
        }
    }
}

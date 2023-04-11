package xiecheng;
/**
 *输入：一个字符串
 * 输出：多少个圆圈（0， 6， 9有1个圆圈，8两个）
 */
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) - '0' == 0 || s.charAt(i) - '0' == 6 || s.charAt(i) - '0' == 9) {
                count++;
            } else if (s.charAt(i) - '0' == 8) {
                count += 2;
            } else {
                continue;
            }
        }
        System.out.println(count);
    }
}


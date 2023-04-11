package mayi;
import java.util.Scanner;

/**
 * 分裂桃，体积为1不分裂，大于1进行随机分裂，比如5 -> 1,4 / 2,3
 * input: x k, x 代表体积，k代表天数
 * output: 输出最大和最小的数量
 */
public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int k = sc.nextInt();
        // 最小的情况为每次x分裂为1+（x-1），最大的情况为x分裂为一半

        // 最大的情况
        int time = k;
        int volume = x;
        int max = 1;
        while (volume > 1 && time > 0) {
            if (volume % 2 == 0) {
                if (volume >= 2) {
                    for (int j = 0; j < k-time; j++) {
                        max = max * 2;
                    }
                }
                volume = volume/2;
                time -= 1;


            } else {
                if (volume >= 2) {
                    for (int j = 0; j < k-time; j++) {
                        max = max * 2;
                    }
                }
                volume = volume/2;
                time -= 1;

            }
        }

        // 最小的情况
        int min = 1;
        time = k;
        volume = x;
        while(volume > 1 && time > 0) {
            volume -= 1;
            min += 1;
            time--;
        }
        System.out.print(max + " " + min);
    }
}

package pinxixi;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int A[] = new int[n];
        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int start = -1, end = -1;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (getRes(A, i, j) > max1) {
                    max1 = getRes(A, i, j);
                    if (j-i >= max2) {
                        start = i;
                        end = j;
                        max2 = j-i;
                    }
                }


            }
        }
        if (max1 <= 0) {
            System.out.print(-1);
        } else {
            System.out.print(start + " " + end);
        }

    }


    // 获取A数组从i到j元素的积
    public static int getRes(int A[], int start, int end) {
        int res = 1;
        for (int i = start; i <= end; i++) {
            res = res * A[i];
        }
        return res;
    }
}

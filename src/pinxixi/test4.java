package pinxixi;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int A[] = new int[n];
            for (int j = 0; j < n; j++) {
                A[j] = sc.nextInt();
            }
            // start
            boolean flag = check(A);
            if (flag){
                System.out.println(0);
            } else {
                int count = 0;
                for (int j = 1; j < n; j++) {
                    if (A[j-1] > A[j]) {
                        int temp = A[j-1];
                        for (int k = 0; k < n; k++) {
                            if (A[k] == temp) {
                                A[k] = 0;
                            }
                        }
                        j = 0;
                        count++;
                        if (check(A)) {
                            System.out.println(count);
                            break;
                        }
                    }
                }
            }
        }
    }
    public static boolean check(int A[]) {
        int flag = 0;
        for (int j = 0; j < A.length-1; j++) {
            if (A[j] > A[j+1]) {
                flag = 1;
            }
        }
        if (flag == 0) { // 如果是非递减的
            return true;
        }
        return false;
    }
}

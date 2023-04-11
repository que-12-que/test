package mine;

class Solution {
    public static void main(String[] args) {
        int nums[] = {16,2,2,3,3,4,5,5};
        int res[] = singleNumbers(nums);
        for (int i : res) {
            System.out.println(i);
        }
    }
    public static int[] singleNumbers(int[] nums) {
        int ret = 0;
        for (int n : nums) {
            ret ^= n;
        }
        int div = 1;
        while ((div & ret) == 0) {
            div <<= 1;
        }
        int a = 0, b = 0;
        for (int n : nums) {
            if ((div & n) != 0) {
                a ^= n;
            } else {
                b ^= n;
            }
        }
        return new int[]{a, b};
    }
}


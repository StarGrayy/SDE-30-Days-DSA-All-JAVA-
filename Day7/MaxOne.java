package Day7;

public class MaxOne {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxCnt = 0;
        int i = 0;

        while (i < nums.length) {
            int cnt = 0;
            if (nums[i] == 1) {
                while (i < nums.length && nums[i] == 1) {
                    i++;
                    cnt++;
                }
                maxCnt = Math.max(cnt, maxCnt);
            }
            i++;
        }
        return maxCnt;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println("Maximum consecutive ones: " + findMaxConsecutiveOnes(nums));
    }
}


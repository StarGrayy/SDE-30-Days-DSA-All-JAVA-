package Day4;

import java.util.HashSet;
import java.util.Set;

public class LCS {
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        
        int maxCnt = 1;
        for (int num : set) {
            if (!set.contains(num - 1)) { 
                int currentNum = num;
                int cnt = 1;
                
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    cnt++;
                }
                
                maxCnt = Math.max(maxCnt, cnt);
            }
        }
        
        return maxCnt;
    }
    public static void main(String[] args) {
        int[] nums ={100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));
    }
}

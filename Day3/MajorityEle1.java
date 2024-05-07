package Day3;

import java.util.Arrays;

public class MajorityEle1 {
    public static int majorityElement(int[] nums){
        int temp = 0;
         int cnt=0;
         Arrays.sort(nums);
        temp=nums[0];
        for(int i=0;i<nums.length;i++){
        if(nums[i] == temp)
          cnt++;
        if(cnt > ((nums.length)/2)){
            return nums[i];
        }else{
            temp=nums[i+1];
        }
        }
        return 0;  
        }
        public static void main(String[] args) {
            int[] nums= {2,2,1,1,1,2,2};
            System.out.println(majorityElement(nums));
        }
}

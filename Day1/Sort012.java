package Day1;

import java.util.Arrays;

public class Sort012 {
    public static void sortColors(int[] nums) {
        int cnt0=0;
        int cnt1=0;
        int cnt2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) cnt0++;
            if(nums[i]==1) cnt1++;
            if(nums[i]==2) cnt2++;
        }

        int k=0;
        for(int i =0;i<cnt0;i++){
            nums[k++]=0;
        }
        for(int i =0;i<cnt1;i++){
            nums[k++]=1;
        }
        for(int i =0;i<cnt2;i++){
            nums[k++]=2;
        }
    }
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}

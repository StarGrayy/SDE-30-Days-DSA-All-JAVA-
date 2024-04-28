import java.util.Arrays;

public class NextPermut {
    public static void nextPermutation(int[] nums) {
        int c=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                c=i;
                break;
            }
        }
        if(c==-1){
        Arrays.sort(nums);
        return;
        } 

        for(int i=nums.length-1;i>c;i--){
            if(nums[i]>nums[c]){
                int temp = nums[i];
                nums[i]=nums[c];
                nums[c]=temp;
                break;
            }
        }

        Arrays.sort(nums,c+1,nums.length);

    }
    public static void main(String[] args) {
        int[] nums = {1,5,4};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
}

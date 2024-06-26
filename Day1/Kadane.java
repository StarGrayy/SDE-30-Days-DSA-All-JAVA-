public class Kadane {
    public static int maxSubArray(int[] nums) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i =0;i<nums.length;i++){
            sum+=nums[i];
            if(sum<nums[i]){
                sum=nums[i];
            }
            max=Math.max(max,sum);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}

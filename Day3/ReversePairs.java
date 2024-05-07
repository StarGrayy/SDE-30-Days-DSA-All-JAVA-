package Day3;

public class ReversePairs{
        static int val=0;
        public static int reversePairs(int[] nums) {
            mergeSort(nums,0,nums.length-1);
            return val;
        }
    
        public static void mergeSort(int[] nums,int low,int high){
            if(low>=high) return;
            int mid=low+(high-low)/2;
            mergeSort(nums,low,mid);
            mergeSort(nums,mid+1,high);
            merge(nums,low,mid,high);
        }
    
        private static void merge(int[] nums,int low,int mid,int high){
            int[] temp = new int[high - low + 1];
            int left=low;
            int right=mid+1;
            int count=0;
            int k=0;
    
            while(left<=mid && right<=high){
                if((long)nums[left]>2*(long)nums[right]){
                   count+=mid-left+1;
                   right++;
                }else{
                    left++;
                }
            }
    
            left=low;
            right=mid+1;
    
            while(left<=mid && right<=high){
                if(nums[left]<nums[right]){
                   temp[k++]=nums[left++];
                }else{
                   temp[k++]=nums[right++];
                }
            }
            while(left<=mid){
               temp[k++]=nums[left++];
            }
            while(right<=high){
                temp[k++]=nums[right++];
            }
            for (int i = 0; i < temp.length; i++) {
                nums[low + i] = temp[i];
            }
            val+=count;
        }   
        public static void main(String[] args) {
            int[] nums={1,3,2,3,1};
            System.out.println(reversePairs(nums));
        } 
}

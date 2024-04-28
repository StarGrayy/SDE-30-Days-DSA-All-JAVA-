public class CountInversion{
    static long cnt=0;
    public static long getInversions(long nums[], int n) {
        mergeSort(0,nums.length-1,nums);
        return cnt;
    }
   public static void merge(int low, int mid, int high, long[] nums) {
    long[] temp = new long[high - low + 1];
    int i = low;
    int j = mid + 1;
    int k = 0;

    while (i <= mid && j <= high) {
        if (nums[i] <= nums[j]) {
            temp[k++] = nums[i++];
        } else {
            temp[k++] = nums[j++];
            cnt += mid - i + 1;
        }
    }
    while (i <= mid) {
        temp[k++] = nums[i++];
    }
    while (j <= high) {
        temp[k++] = nums[j++];
    }

    for (int t = low; t <= high; t++) {
        nums[t] = temp[t - low];
    }
}
    public static void mergeSort(int low,int high,long[] nums){
        if(low>=high) return;
        int mid=low+(high-low)/2;
        mergeSort(low,mid,nums);
        mergeSort(mid+1,high,nums);
        merge(low,mid,high,nums);
    }
    public static void main(String[] args) {
        int n =3;
        long[] nums = {3, 2, 1};
        System.out.println(getInversions(nums, n));
    }
}

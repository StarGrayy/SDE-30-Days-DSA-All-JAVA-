package Day7;

public class TrappingRainWater {
    public static int trap(int[] height) {
        int n = height.length;
        int[] left = new int[n];
        int[] right = new int[n];
        //left max
        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,height[i]);
            left[i]=max;
        }
        //right max
        max=0;
        for(int i=n-1;i>=0;i--){
            max=Math.max(max,height[i]);
            right[i]=max;
        }
        //trapped water area
        int area=0;
        for(int i =0;i<n;i++){
            if(height[i]<left[i] && height[i]<right[i]){
                int heightOfWater=Math.min(left[i],right[i]);
                area+=heightOfWater-height[i];
            }
        }
        return area;
    }

    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height)); // Output should be 6
    }
}


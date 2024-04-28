import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIterval {
    public static int[][] merge(int[][] intervals) {

        if(intervals.length<=1)
            return intervals;

        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]> result=new ArrayList<>();
        int[] interval=intervals[0];
        result.add(interval);

        for(int[] newInterval:intervals){
            if(interval[1]>=newInterval[0]){
                interval[1]=Math.max(interval[1],newInterval[1]);
            }else{
                interval=newInterval;
                result.add(interval);
            }
        }

        return result.toArray(new int[result.size()][]);
    }
    public static void main(String[] args) {
        int[][] intervals={{1,3},{2,6},{8,10},{15,18}};
        int[][] ans= merge(intervals);
        
        for(int[] a :ans){
            for(int x:a){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}

import java.util.Arrays;
import java.util.HashSet;

public class MissandRep {
    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int a =0;
        int b =0;
        HashSet<Integer> set = new HashSet<>();
        for(int i =0;i<n;i++){
            for(int j=0;j<grid[0].length;j++){
                if(set.contains(grid[i][j])){
                    a=grid[i][j];
                }else{
                    set.add(grid[i][j]);
                }
            }
        }
        for(int i =1;i<=n*n;i++){
            if(!set.contains(i)){
                b=i;
                break;
            }
        }
        return new int[] {a,b};
    }
    public static void main(String[] args) {
        int[][] grid = {{1,3},{2,2}};
        int[] a = findMissingAndRepeatedValues(grid);
        System.out.println(Arrays.toString(a));
    }
}

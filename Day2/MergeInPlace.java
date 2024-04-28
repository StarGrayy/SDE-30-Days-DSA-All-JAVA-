import java.util.Arrays;

public class MergeInPlace {
    public static void mergeTwoSortedArraysWithoutExtraSpace(long []a, long []b){
        int i=0;   
        int j=0;
        while(i<a.length && j<b.length){
            while(a[i]<=b[j]) i++;
            if(a[i]>b[j]){
                swap(a,b,i,j);
                i++;
            }
        }   
    }
    private static void swap(long []a, long []b,int x,int y){
        long temp=a[x];
        a[x]=b[y];
        b[y]=temp;
        Arrays.sort(b);
    }
    public static void main(String[] args) {
        long[] a = {1,8,8};
        long[] b = {2,3,4,5};
        System.out.println(Arrays.toString(a)+" "+Arrays.toString(b));
        mergeTwoSortedArraysWithoutExtraSpace(a,b);
        System.out.println(Arrays.toString(a)+" "+Arrays.toString(b));
    }
}

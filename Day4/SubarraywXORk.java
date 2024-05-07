package Day4;

import java.util.HashMap;

public class SubarraywXORk {
    public static int subarraysWithSumK(int []a, int b) {
        int cnt=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        int sum=0;
        int xor=0;
        for(int i =0;i<a.length;i++){
            xor^=a[i];
            
            if(map.containsKey(xor^b)){
                cnt+=map.get(xor^b);
            }
           
           map.compute(xor,(key,value)->(value==null)?1:value+1); 
        //    map.put(xor, map.getOrDefault(xor, 0) + 1);
        }
        return cnt;
    }
    public static void main(String[] args) {
        int[] a={1, 2, 3, 2};
        int b =2;
        System.out.println(subarraysWithSumK(a, b));
    }
}

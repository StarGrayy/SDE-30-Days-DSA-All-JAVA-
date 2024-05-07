package Day3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityEle2 {
    public static List<Integer> majorityElement(int[] nums) {
      int n=nums.length;
      int k = n/3;
      HashMap<Integer,Integer> map = new HashMap<>();
      for(int i=0;i<n;i++){
          map.compute(nums[i],(key,value)->(value==null)? 1:value+1);
      } 
      ArrayList<Integer> arr = new ArrayList<>();
      for(Map.Entry<Integer,Integer> entry : map.entrySet()){
          if(entry.getValue()>k){
              arr.add(entry.getKey());
          }
      }
      return arr;
    }
    public static void main(String[] args) {
        int[] nums={3,2,3};
        System.out.println(majorityElement(nums));
    }
}

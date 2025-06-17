import java.util.*;
public class MajorityElement {

    public static void main(String[] args) {
        int[] nums={1,2,2,3,2,2};
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
       int n=nums.length;
       HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
       for(int i=0;i< n;i++){
        hm.put(nums[i],hm.getOrDefault(nums[i],0) +1);
       }

       n=n/2;
       for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
        if(entry.getValue() > n){
            return entry.getKey();
        }
       }
       return 0;

    }
}
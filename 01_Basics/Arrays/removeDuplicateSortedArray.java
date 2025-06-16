public class removeDuplicateSortedArray {
    public static void main(String[] args) {
        int[] nums={1,1,2,2,3,3,4,4};
        
        System.out.println(removeduplicate1(nums));
    }
    public static int removeduplicate1(int[] nums){
        int count=0;
        for(int i=0 ;i <nums.length ;i++){
            if(i < nums.length-1 && nums[i] == nums[i+1]){
                continue;
            }else{
                nums[count]=nums[i];
                count++;
            }
        }


        return count;
    }
}

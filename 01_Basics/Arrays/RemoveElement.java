public class RemoveElement {
    public static void main(String[] args) {
       int[] nums={1,2,2,3,4,3,5};
       int k=2;
       System.out.println(removeElement(nums, k)); 
    }
     public static int removeElement(int[] nums, int val) {
        int k=0; //to store non-val
        for(int i=0;i < nums.length ;i++){
            if(nums[i] != val){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
}

public class Jump {
    public static void main(String[] args) {
            int[] nums={1,2,3,4};
            System.out.println(canJump(nums));
    }
     public static boolean canJump(int[] nums) {
        int last_pos=nums.length-1;
        for(int i=nums.length-2;i>=0;i--){
            if(i+nums[i] >= last_pos){
                last_pos=i;
            }
        }
        return last_pos==0;
    }
}

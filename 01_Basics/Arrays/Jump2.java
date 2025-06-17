public class Jump2 {
    public static void main(String[] args) {
        int[] nums={2,3,1,1,4};
        System.out.println(jump(nums));
    }
    public static int jump(int[] nums) {
        int jump=0;
        int currentVal=0;
        int fartest=0;
        for(int i=0;i < nums.length-1;i++){
            fartest=Math.max(fartest,i+nums[i]);
            if(i == currentVal){
                jump++;
                currentVal = fartest;
            }
        }
        return jump;
    }
}

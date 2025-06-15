public class CheckBalancedString {
    public static void main(String[] args) {
        String num = "123456";
        System.out.println(isBalanced(num));
    }
     public static boolean isBalanced(String num) {
        int evenSum=0;
        int oddSum=0;
        for(int i=0;i<num.length();i++){
            if(i%2 == 0){
                evenSum += num.charAt(i)-'0';
            }else{
                oddSum += num.charAt(i)-'0';
            }
        }
        return evenSum==oddSum;
    }
}

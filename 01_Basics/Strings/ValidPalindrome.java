public class ValidPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("a man n a m :a"));
    }
     public static boolean isPalindrome(String s) {
        String s1=s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
        int i=0;
        int j=s1.length()-1;
        while(i<=j){
            if(s1.charAt(i)!= s1.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
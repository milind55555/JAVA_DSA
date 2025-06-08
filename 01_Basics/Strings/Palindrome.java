public class Palindrome {

    public static void main(String[] ar){
            System.out.println(isPalindrome("Rotor"));
    }
    static boolean isPalindrome(String s){
        String str=s.toLowerCase().trim();
            String rev="";
            for(int i=str.length()-1;i>=0;i--){
                rev = rev+str.charAt(i);
            }
            if(str.equals(rev)){
                return true;
            }else{
                 return false;
            }
           
    }
}
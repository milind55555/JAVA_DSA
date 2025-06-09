public class ReverseVowelOfString {

    public static void main(String[] args) {
        System.out.println(reverseVowels("leetcode"));
    }
    
      public static String reverseVowels(String s) {
        char[] chars=s.toCharArray();
        int start=0;
        int end=s.length()-1;
        while(start<end){
            if(!isVowel(chars[start])){
                start++;
            }else if(!isVowel(chars[end])){
                end--;
            }else{
                char temp=chars[start];
                chars[start]=chars[end];
                chars[end]=temp;
                start++;
                end--;
            }
        }
        return String.valueOf(chars);
    }
    public static boolean isVowel(char c){
        if(c == 'a'|| c=='e' || c=='i'|| c=='o' || c== 'u' || c == 'A' || c == 'I' || c== 'O' || c == 'E' || c == 'U' || c== 'O'){
            return true;
        }else{
            return false;
        }
    }
}

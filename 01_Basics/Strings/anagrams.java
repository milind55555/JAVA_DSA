import java.util.Arrays;

public class anagrams {
//anagrams are strings having same character with same frequency  eg keep and peek
    public static void main(String[] args) {
        System.out.println(isAnagram("keep", "peek"));
    }
    static boolean isAnagram(String s1,String s2){
        if(s1.length() != s2.length()){
            return false;
        }else{
            char[] ch1=s1.toCharArray();
            char[] ch2=s2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);

            if(Arrays.equals(ch1, ch2)){
                return true;
            }else{
                return false;
            }
        }
    }
}
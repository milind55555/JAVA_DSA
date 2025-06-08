import java.util.*;
public class LengthOfLongestSubString {

    public static void main(String[] args) {
        System.out.println(lengthmaxsubstring("abcdabcb"));
    }
    static int lengthmaxsubstring(String s){
       int start=0;
       int end=0;
       int max_length=0;
       List<Character> list=new ArrayList<Character>();
       while(end<s.length()){
            if(!list.contains(s.charAt(end))){
                list.add(s.charAt(end));
                end++;
                max_length = Math.max(list.size(), max_length);
            }else{
                list.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
       }
       return max_length;
    }
}
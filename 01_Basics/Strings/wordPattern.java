import java.util.*;
public class wordPattern {

    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "cat dog dog cat"));
    }
    public static boolean wordPattern(String pattern, String s) {
        String[] arr=s.split(" ");
        
        if(pattern.length() != arr.length){
            return false;
        }

        HashMap<Character,String> hm=new HashMap<Character,String>();

        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            String word=arr[i];

            if(hm.containsKey(ch)){
                if(!hm.get(ch).equals(arr[i])){
                    return false;
                }
            }else{
                if(hm.containsValue(word)){
                    return false; // already present in hashmap
                }
                hm.put(ch,arr[i]);
            }
            
        }
        return true;
        }
}
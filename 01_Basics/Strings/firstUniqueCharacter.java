public class firstUniqueCharacter {

    public static void main(String[] args) {
        System.out.println(firstUniqueCharacter("leetcode"));
    }
     static  int firstUniqueCharacter(String s) {
       int[] freq=new int[26];
       char[] chars=s.toCharArray();
       for(char c:chars){
        freq[c-'a']++;//eg leetcode  l assigned to 1 e assigned to 2
       }
       for(int i=0;i<chars.length;i++){
        if(freq[chars[i]-'a'] == 1){
            return i;
        }
       }


       return -1;
    }
}
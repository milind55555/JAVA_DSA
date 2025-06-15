public class RansomNote {
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";
        System.out.println(canConstruct(ransomNote, magazine)); // Output: true
    }
     public static boolean canConstruct(String ransomNote, String magazine) {
        int[] count=new int[26];
        for(char c:magazine.toCharArray()){
            count[c-'a']++;
        }
        for(char c:ransomNote.toCharArray()){
            if(count[c-'a'] == 0){
                return false;
            }
            count[c-'a']--;
        }
        return true;
    }
}

public class MergeStringeAlternately {
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(mergeAlternately(word1, word2)); // Output: "apbqcr"
        
        String word3 = "ab";
        String word4 = "pqrs";
        System.out.println(mergeAlternately(word3, word4)); // Output: "apbqrs"
        
        String word5 = "abcd";
        String word6 = "pq";
        System.out.println(mergeAlternately(word5, word6)); // Output: "apbqcd"
    }
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i<word1.length() || i<word2.length()){
            if(i<word1.length()){
                sb.append(word1.charAt(i));
            }
             if(i<word2.length()){
                sb.append(word2.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }
}

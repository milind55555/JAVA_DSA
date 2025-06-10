public class findTheDifference {

    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd", "abcde"));
    }
     public static char findTheDifference(String s, String t) {
        int total=0;
        for(int i=0;i<=t.length()-1;i++){
            total = total + t.charAt(i);
        }
        for(int i=0;i<s.length();i++){
            total=total-s.charAt(i);
        }
        return (char)total;
    }
}
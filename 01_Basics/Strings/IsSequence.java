public class IsSequence {
    public static void main(String[] args) {
      String s1="abc";
        String s2="ahbgdc";
        System.out.println(isSubsequence(s1, s2));  
    }
    static boolean isSubsequence(String s, String t) {
        if(s.length() == 0){
            return true;
        }
        int i=0;
        int j=0;
        while(i<s.length() && j <t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }
            else{
                j++;
            }
        }

        if(i == s.length()){
            return true;
        }
        return false;
        
    }
}

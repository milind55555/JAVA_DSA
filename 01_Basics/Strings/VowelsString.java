public class VowelsString {
    public static void main(String[] args) {
        System.out.println(vowelStrings(new String[]{"aba","bcb","ece","aa","e"}, 0, 2));
    }
     public  static int vowelStrings(String[] words, int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++){
            char s=words[i].charAt(0);
            char e=words[i].charAt(words[i].length()-1);
            if(s == 'a' || s=='i'||s=='e'|| s=='o'|| s=='u'){
                if(e=='a'||e=='i'||e=='e'||e=='o'||e=='u'){
                    count++;
                }
            }
        }
        return count;
        
    }
}

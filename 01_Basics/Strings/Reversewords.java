public class Reversewords {
    public static void main(String[] args) {
        System.out.println(revword("Hii There Is Some Emergency Are Firing"));
    }
    static String revword(String s){
        String[] words=s.split(" +");
        StringBuilder sb=new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}

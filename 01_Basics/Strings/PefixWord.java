public class PefixWord {
    public static void main(String[] args) {
        System.out.println(isPrefixOfWord("i love eating burger", "burg"));
    }
     public static int isPrefixOfWord(String sentence, String searchWord) {
        String[] sentences=sentence.split(" "); //convert to array based on space
        for(int i=0;i<sentences.length;i++){
            if(sentences[i].startsWith(searchWord)){
                return i+1;
            }
        }
        return -1;
    }
}

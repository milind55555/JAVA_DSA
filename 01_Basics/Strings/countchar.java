public class countchar {

    public static void main(String[] args) {
        System.out.println(countcharString("Hello  World"));
    }
    static int countcharString(String s){
        int count=0;
        for(int i=0;i<=s.length()-1;i++){
            if(s.charAt(i) != ' '){
                count++;
            }
        }
        return count;
    }
}
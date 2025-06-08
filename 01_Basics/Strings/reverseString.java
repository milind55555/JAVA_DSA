public class reverseString {

    public static void main(String[] args) {
        System.out.println(revString1("INTERVIEW"));
        System.out.println(revString2("MILIND"));
    }
    static StringBuilder revString1(String s){
        StringBuilder sb=new StringBuilder();
        char[] ch=s.toCharArray();
        for(int i=ch.length-1;i>=0;i--){
            sb.append(ch[i]);
        }
        return sb;
         }

   static  StringBuffer revString2(String s){
    StringBuffer sb=new StringBuffer(s);
    return sb.reverse();
   }      
}
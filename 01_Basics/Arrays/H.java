import java.util.Arrays;

public class H {
        public static void main(String[] ar){
             int[]   citations = {3,0,6,1,5};
             System.out.println(hIndex(citations));


        }
         public static int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n=citations.length;
        int h=0;
        for(int i=0;i < n;i++){
            int researchPaper = n-i;
            if(citations[i] >= researchPaper){
                h=researchPaper;
                break;
            }
        }
        return h;
    }
}



public class FreqOfEachElement {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,5,5};
        int[] freq=new int[arr.length];
        int visited=-1;

        for(int i=0;i<arr.length;i++){
            int count=1;
            for(int j=i+1;j< arr.length ;j++){
                if(arr[i] == arr[j]){
                    count++;
                    freq[j]=visited;
                }
                if(arr[i] != visited){
                    freq[i]=count;
                }
            }

            
        }
        for(int i=0;i<freq.length;i++)
        {
            if(freq[i] != visited){
                System.out.println("Element || Frequency ");
                System.out.println(arr[i]+ "   ||   "+freq[i]);
            }
                
            }
    }
}

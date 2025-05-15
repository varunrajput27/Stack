import java.util.Arrays;
import java.util.Stack;

public class nextsmallest {
    public static void main(String[] args) {
        

        int arr[]={2,1,4,3};
        int result[]=new int[arr.length];


         Stack<Integer> sb= new Stack<>();

         sb.push(-1);

         for(int i=arr.length-1;i>=0;i--){
            int curr=arr[i];
            while(sb.peek()>curr){
                sb.pop();
            }
            result[i]=sb.peek();
            sb.push(curr);


            
         }
         System.out.println("values : "+Arrays.toString(arr));
             System.out.print("values : "+Arrays.toString(result));
    }
}

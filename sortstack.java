import java.util.Stack;

public class sortstack {

    public static  void pushing(Stack<Integer> sb,int top){
        if(sb.isEmpty()){
            sb.push(top);
            return;
        }
        int ok=sb.pop();
        pushing(sb, top);
        sb.push(ok);


    }
    public static void sort(Stack<Integer> sb){
        if(sb.isEmpty()){
            return;
        }
        int top=sb.pop();
        sort(sb);
        pushing(sb,top);
    }
    public static void main(String[] args) {
        Stack<Integer> sb = new Stack<>();

        sb.push(1);
        sb.push(2);
        sb.push(3);
        sb.push(4);
        sb.push(5);
        sb.push(6);
    
        System.out.println("before sorting "+ sb);
          sort(sb);
        System.out.println(" after sorting "+sb);
    }
}

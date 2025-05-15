import java.util.Stack;

public class reversestack {

    public  static void pushatbottom(int data,Stack<Integer> sb){
        if(sb.isEmpty()){
           

        }
       int top= sb.pop();
        pushatbottom(data, sb);
        sb.push(top);
       
    }

    public  static void reversestack(Stack<Integer> sb){
if(sb.isEmpty()){
    return;
}
        int top=sb.pop();
        reversestack(sb);
        pushatbottom(top, sb);



    }
    public static void main(String[] args) {
        Stack<Integer> sb = new Stack<>();
        sb.push(1);
        sb.push(2);
        sb.push(3);

        reversestack(sb);

        while (!sb.isEmpty()) {
            System.out.print(sb.peek() + " ");
            sb.pop();
        }

    }
}

import java.util.Stack;

public class pushatbottom {
    public  static void pushatbottom(int data,Stack<Integer> sb){
        if(sb.isEmpty()){
            sb.push(data);
            return;

        }
       int top= sb.pop();
        pushatbottom(data, sb);
        sb.push(top);
       
    }

    public static void main(String[] args) {
        Stack<Integer> sb = new Stack<>();
        sb.push(1);
        sb.push(2);
        sb.push(3);

        pushatbottom(4, sb);

        while (!sb.isEmpty()) {
            System.out.print(sb.peek() + " ");
            sb.pop();
        }

    }
}

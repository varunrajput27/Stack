import java.util.Stack;

public class deleteelement {

    public static void delelement(Stack<Integer> sb, int idx, int i) {

        if (i == idx) {
            sb.pop();
            return;
        }

        int top=sb.pop();
        delelement(sb, idx, i=i+1);
        sb.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> sb = new Stack<>();

        sb.push(1);
        sb.push(2);
        sb.push(3);
        sb.push(4);
        sb.push(5);

        int idx = sb.size()/ 2;
        int i = 0;

        System.out.println("before deletion "+sb);

        delelement(sb, idx, i);

         System.out.println("after deletion "+sb);

    }
}

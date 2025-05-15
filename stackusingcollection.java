import java.util.Stack;

public class stackusingcollection {
    public static void main(String[] args) {
        Stack<Integer> sb= new Stack<>();
        sb.push(1);
        sb.push(2);
        sb.push(3);
        sb.push(4);    
        while(!sb.isEmpty()){
            System.out.println(sb.peek());
            sb.pop();
        }   
    }
}

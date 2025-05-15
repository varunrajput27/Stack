import java.util.Stack;

public class validparanthesis {

    public static boolean checkValidParentheses(String str) {

        Stack<Character> sb = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == '{' || c == '[' || c == '(' || c == '<') {
                sb.push(c);
            }
             else 
             {
                char top=sb.peek();
               if(c=='}' && top=='{' || c==']' && top=='['|| c==')' && top=='('|| c=='>' && top=='<'){
                sb.pop();
               }
               else{
                 return false;
               }
            }
        }

        return sb.isEmpty();

    }

    public static void main(String[] args) {
        String str = "{([<>])}";

        if(checkValidParentheses(str)){
            System.out.println("palindrome");
           
        }
         else

            {
               System.out.println(" not palindrome"); 
            }

    }
}

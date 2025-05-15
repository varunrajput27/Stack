import java.util.Stack;

public class reversestring {

    public static  void inseertatbottom( Stack<Character> sb, char ch){

        if(sb.isEmpty()){
            sb.push(ch);
            return;

        }
        char cha=sb.pop();
        inseertatbottom(sb, ch);
        sb.push(cha);

    }



    public   static void  reversestr(Stack<Character> sb){
        if(sb.isEmpty()){
            return;
        } 
        
         char ch=sb.pop();
         reversestr(sb);
         inseertatbottom( sb, ch);

 }
    public static void main(String[] args) {

        String str="varun";
        Stack<Character> sb= new  Stack<>();

       for(int i=0;i<str.length();i++){
        sb.push(str.charAt(i));
       }

       reversestr(sb);

       while(!sb.isEmpty()){
        System.out.print(sb.peek());
        sb.pop();
       }


        
    }
}

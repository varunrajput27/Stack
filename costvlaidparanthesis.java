public class costvlaidparanthesis {

    public static int costvalid(String str) {
       
        int cost = 0, balance = 0;

        for (char ch : str.toCharArray()) {
            if (ch == '{' || ch == '[' || ch == '(' || ch == '<') {

                balance++;
            } else if (ch == '}' || ch == ']' || ch == ')' || ch == '>') {
                balance--;
                if(balance<0){
                    cost++;
                    balance=0;
                }
            }
         
        }
        cost=cost+balance;
        return cost;
    }

    public static void main(String[] args) {
        String str = "([{<>}])";

        System.out.println(" to make it vlaid cost is "+costvalid(str));

    }

}

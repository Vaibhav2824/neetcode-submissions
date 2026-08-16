class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> calc=new Stack<>();
        int b,a;
        for(String token: tokens){
            if(token.equals("+")|| token.equals("-")|| token.equals("*")|| token.equals("/")){
                b=calc.pop();
                a=calc.pop();
                if(token.equals("+")){
                    calc.push(a+b);
                }
                else if(token.equals("-")){
                    calc.push(a-b);
                }
                else if(token.equals("*")){
                    calc.push(a*b);
                }
                else{
                    calc.push(a/b);
                }
            }
            else
            calc.push(Integer.parseInt(token));
        }
        return calc.pop();  
    }
}

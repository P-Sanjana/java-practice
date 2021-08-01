import java.util.*;
class Infix{
    public static int fun(String s){
        Stack<Integer> a=new Stack<>();
        Stack<Character> o=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isDigit(c)){
                int num=0;
                while(Character.isDigit(c)){
                    num=num*10+(c-'0');
                    i++;
                    if(i<s.length())
                    c=s.charAt(i);
                    else
                    break;
                }
                a.push(num);
                i--;   
            }
            else if(c=='(')
            o.push(c);
            else if(c==')'){
                while(o.peek()!='('){
                int res=perform(a,o);
                a.push(res);}
                o.pop();
            }
            else if(isoperator(c)){
                while(!o.isEmpty() && precedence(c)<precedence(o.peek())){
                int res=perform(a,o);
                    a.push(res);
            }
            o.push(c);
            }
        }
        while(!o.isEmpty()){
            a.push(perform(a,o));
        }
        return a.pop();
    }
    public static boolean isoperator(char c){
        return (c=='+'|| c=='-' || c=='/' || c=='*' || c=='^');
    }
    public static int precedence(char c){
        switch(c){
            case '+':
            case '-':return 1;
            case '*':
            case '/':return 2;
            case '^':return 3;
        }
        return -1;
    }
    public static int perform(Stack<Integer>a,Stack<Character>o){
        int x=a.pop();
        int y=a.pop();
        char c=o.pop();
        switch(c){
            case '+':
            return x+y;
            case '-':return y-x;
            case '*':return x*y;
            case '/':if(x==0)
            throw new UnsupportedOperationException("cannot divide by zero");
            return y/x;
        }
        return 0;
    }
    public static void main(String args[]){
        String s=new Scanner(System.in).next();
        System.out.println(fun(s));
    }
}
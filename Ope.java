import java.util.*;
import java.lang.*;
class Ope{
    static ArrayList<Integer>arr=new ArrayList<>();
   static String s2="";
   static  int max=0,z=0;
    public static void fun(String s,int k,String s1){
           if(k>=s.length()-1){
               System.out.println(s1);int sum=0;
               if(s1.charAt(0)=='-')
                sum=0-(s.charAt(0)-'0');
                else
                sum=s.charAt(0)-'0';
            for(int i=1;i<s.length();i++){
                if(s1.charAt(i)=='+')
                sum+=s.charAt(i)-'0';
                else if(s1.charAt(i)=='-')
                sum-=s.charAt(i)-'0';
                else
                sum*=s.charAt(i)-'0';
            }
           arr.add(sum);}
        if(k+1<s.length()){
        s1+='+';
        fun(s,k+1,s1);
        s1=s1.substring(0,s1.length()-1);
    }
        if(k+1<s.length()){
        s1+='-';
        fun(s,k+1,s1);
    s1=s1.substring(0,s1.length()-1);}
     if(k+1<s.length()){
        s1+='*';
        fun(s,k+1,s1);
        s1=s1.substring(0,s1.length()-1);
    }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        String s=""+Integer.toString(a)+Integer.toString(b)+Integer.toString(c);
        fun(s,-1,"");
       /* if(s2.length()!=0)
    System.out.println(s2);
    else
    System.out.println("not possible");*/
    Collections.sort(arr);
    System.out.println(arr.get(0));
    }
}
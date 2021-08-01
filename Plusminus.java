import java.util.*;
import java.lang.*;
class Plusminus{
   static String s2="";
   static  int max=0,z=0;
    public static boolean fun(String s,int k,String s1){
        if(k>=s.length()-1){
        if(z>Math.pow(2,s.length()-1)){
         return false;
        }
        else{
            z++;
            int sum=s.charAt(0)-'0';
            for(int i=1;i<s.length();i++){
                if(s1.charAt(i-1)=='+')
                sum+=s.charAt(i)-'0';
                else
                sum-=s.charAt(i)-'0';
            }
            if(sum==0){
                int c=0;
                for(int i=0;i<s1.length();i++){
                    if(s1.charAt(i)=='+')
                    c++;
                }
                if(c>max){
                    max=c;
            s2=s1;}}
        }}
        if(k+1<s.length()){
        s1+='+';
        fun(s,k+1,s1);
        s1=s1.substring(0,s1.length()-1);
    }
        if(k+1<s.length()){
        s1+='-';
        fun(s,k+1,s1);
    s1=s1.substring(0,s1.length()-1);}
    
return true;}
    public static void main(String args[]){
        String s=new Scanner(System.in).next();
        fun(s,0,"");
        if(s2.length()!=0)
    System.out.println(s2);
    else
    System.out.println("not possible");
    }
}
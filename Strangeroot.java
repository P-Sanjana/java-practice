import java.util.*;
class Strangeroot{
    public static void main(String args[]){
        int n=new Scanner(System.in).nextInt();
        int a=(n*n);
        System.out.println(a);
        int flag=0;
        float b=(float)Math.sqrt(n);
        System.out.println(b);
           String s1=" "+a;
           String s2=" "+b;
           int x=s1.length();
           int y=s2.length();
           int i;
           for(i=0;i<x;i++){
               for(int j=0;j<y;j++){
               if(s1.charAt(i)==s2.charAt(j)){
                   flag++;
               }}
               

           }
           if(flag!=0){
               System.out.println("Strangeroot");
           }
           else{
               System.out.println("not");
           }
    }
}
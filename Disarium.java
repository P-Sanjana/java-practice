import java.util.*;
class Disarium{
    public static void main(String args[]){
        int n=new Scanner(System.in).nextInt();
       int count=0;
       double s=0;
       for(int i=n;i>0;i=i/10){
           count++;
       }
       for(int i=n;i>0;i=i/10){
int a=i%10;
s=s+Math.pow(a,count);
count--;
       }
       if(s==n){
           System.out.println("Disarium");
       }
       else{
          System.out.println("not"); 
       }

            }
}
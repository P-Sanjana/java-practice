import java.util.*;
class Voodoo{
    public static void main(String args[]){
        double n;
        int flag=0,count=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextDouble();
        for(double i=1;i<=n;i++){
            if(n%i==0){
                 count++;
            }
        }
    if(count==2){
                if(String.valueOf(1/n).contains(String.valueOf((int)n)))
                 flag++;
        
        if(flag>0)
            System.out.println("voodoo");
        
        else
            System.out.println("not Voodoo");
    }
     else{
            System.out.println((int)n+" not a prime number");
        }
        
    }
}

        
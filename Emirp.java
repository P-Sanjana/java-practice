import java.util.*;
class Emirp{
    public static void main(String args[]){
        int n,i,count=0,r=0,count1=0,b=1,count2=0;
        n=new Scanner(System.in).nextInt();
        for(i=n;i!=0;i--){
             b=b*i;
        }
        for(i=b;i>0;i=i/10){
            int c=i%10;
            if(c==0){
                count2++;
            }
        }
        System.out.println("Trailing zeroes "+count2);
        for(i=1;i<=n;i++){
          if(n%i==0){
              count++;
          }
        }
        if(count==2){
            for(i=n;i>0;i=i/10){
                int a=i%10;
                if(i>=10){
                    r=r+a*10;
                }
                else{
                    r=r+a;
                }
            }
             for(i=1;i<=r;i++){
          if(r%i==0){
              count1++;
          }
        }
        if(count1==2){
            System.out.println("Emrip");
        }
        else{
            System.out.println("not");
        }
        }
        else{
            System.out.println("Invalid");
        }
    }
}
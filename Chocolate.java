import java.util.*;
class Chocolate{
 public static void main(String[] args) {
        int n,i,j,count=0,count1=0,count2=0,s=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }  
        int x=a.length;
        while(x!=1){      
        j=sc.nextInt();
        s++;
        for(i=1;i<=j;i++){
            if(j%i==0){
                count2++;
            }
        }
        if(count2==2){
        for(i=0;i<n;i++){
            if(j==a[i]){
                a[i]=a[i]+1;
                int d=i;
                int b=a[i-1];
                int c=a[i+1];
                for(i=1;i<=b;i++){
                    if(b%i==0){
                        count++;
                    }
                }
                for(i=1;i<=c;i++){
                    if(c%i==0){
                        count1++;
                    }
                }
                if(count==2){
                   for(i=d;i<n;i++){
                       a[i-1]=a[i+1];
                       x=x-2;
                   } 
                }
                if(count1==2){
                    for(i=d+1;i<n;i++){
                        a[i-1]=a[i+1];
                        x=x-2;
                    } 
                 }
            }
        }
    }
    }
    System.out.println(s);
    }
}
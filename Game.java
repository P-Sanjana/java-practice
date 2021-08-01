import java.util.*;
class Game{
    public static void main(String args[]){
        int n,i,min,b,count=0;
        int m;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter "+n+" elements");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        while(a[1]){
        for(i=0;i<n;i++){
            a[i]=a[i]-1;
        }
        for(i=0;i<n;i++){
            if(a[i]<=0){
                b=i;
                count++;
            for(i=b+1;i<a.length;i++){
                a[i-1]=a[i];
            }
        }
        }
        }
        if(a[0]>0){
            System.out.println("wins "+count);
        }
        else{
            System.out.println("lose");
        }
    }
}
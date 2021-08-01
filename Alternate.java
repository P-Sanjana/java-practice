import java.util.*;
class Alternate{
    public static void main(String args[]){
        int n,i,temp;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
            if(a[i]>a[j]){
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }}
        
        for(i=0;i<n/2;i++){
            System.out.print((a[n-i-1])+" ");
            System.out.print((a[i])+" ");
        }
        System.out.print(a[(n/2)]);
    }
}
import java.util.*;
class Denomination{
    public static int fun(int a[],int m,int n){
        int k[]=new int[n+1];
        k[0]=1;
        for(int i=0;i<m;i++){
            for(int j=a[i];j<=n;j++){
                k[j]+=k[j-a[i]];
            }
        }
        for(int i=0;i<=n;i++)
        System.out.println(k[i]+" ");
    return k[n];
}
    public static void main(String []args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]={3,5,10};
        System.out.println(fun(a,a.length,n));
    }
}
import java.util.*;
class quick{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        quicks(a,0,n-1);
        for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");
    }
    public static void quicks(int a[],int l,int h){
        int ind=part(a,l,h);
        if(l<ind-1)
        quicks(a,l,ind-1);
        if(h>ind)
        quicks(a,ind,h);
    }
    public static int part(int a[],int l,int h){
        int i=l,j=h,p=a[l];
        while(i<=j){
            while(a[i]<p)
            i++;
            while(p<a[j])
            j--;
            if(i<=j){
                int t=a[i];
                a[i]=a[j];
                a[j]=t;
                i++;
                j--;
            }
        }
        return i;
    }
/*public static void quicks(int[] a,int l,int h){
    if(l<h){
    int ind=part(a,l,h);
    quicks(a,l,ind-1);
    quicks(a,ind+1,h);}
}
public static int part(int a[],int l,int h){
    int p=a[h];
    int i=l-1;
    for(int j=l;j<h;j++){
        if(a[j]<=p){
            i++;
            int t=a[i];
            a[i]=a[j];
            a[j]=t;
        }}
        int t=a[i+1];
        a[i+1]=a[h];
        a[h]=t;
        return i+1;
}*/
}
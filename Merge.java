import java.util.*;
class Merge{
    public static void merges(int a[],int l,int h){
        if(l<h){
            int m=(l+h)/2;
            merges(a,l,m);
            merges(a,m+1,h);
            mergesort(a,l,m,h);
        }
    }
    public static void mergesort(int a[],int l,int m,int h){
        int n1=m-l+1;
        int n2=h-m;
        int le[]=new int[n1];
        int r[]=new int[n2];
        for(int i=0;i<n1;i++)
        le[i]=a[l+i];
        for(int i=0;i<n2;i++)
        r[i]=a[m+1+i];
        int i=0,j=0,k=l;
        while(i<n1 && j<n2){
            if(le[i]<=r[j]){
                a[k]=le[i];
                i++;
            }
            else{
                a[k]=r[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            a[k]=le[i];
            k++;
            i++;
        }
        while(j<n2){
            a[k]=r[j];
            k++;
            j++;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        merges(a,0,n-1);
        for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");
    }
}
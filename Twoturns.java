/*import java.util.*;
class Twoturns{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        for(int i=0;i<r;i++)
        for(int j=0;j<c;j++)
        a[i][j]=sc.nextInt();
       int curr=0,curr1=0;
       if(c>3){
           for(int k=0;k<=c-3;k++){
            int c1=a[0][c-1]+a[2+k][c-1];
            System.out.println(c1);
       for(int i=k;i<3+k;i++){
           curr1+=a[i][c-1];
       }
       for(int i=c-2;i>=0;i--){
           int s=0;
           for(int j=k;j<3+k;j++)
           s+=a[j][i];
           s+=c1;
           if(s>curr1)
           curr1=s;
           c1+=a[0][i]+a[2+k][i];
           System.out.println(curr);
       }
           curr=Math.max(curr,curr1);    
           }}
       else{
        int c1=a[0][c-1]+a[r-1][c-1];
          for(int i=0;i<r;i++){
           curr+=a[i][c-1];
       }
       for(int i=c-2;i>=0;i--){
           int s=0;
           for(int j=0;j<r;j++)
           s+=a[j][i];
           s+=c1;
           if(s>curr)
           curr=s;
           c1+=a[0][i]+a[r-1][i];
       } 
       }
          System.out.println(curr);
    }
}*/


import java.util.*;
class Twoturns{
    static int res;
    static void fun(int a[]){
        int l[]=new int[a.length];
        int l1[]=new int[a.length];
        int r[]=new int[a.length];
        int r1[]=new int[a.length];
        int o=0,e=0;
        for(int i=0;i<a.length;i++){
            l[i]=o;
            l1[i]=e;
            if(i%2==0)
            e+=a[i];
            else 
            o+=a[i];
        }
        o=0;
        e=0;
        for(int i=a.length-1;i>=0;i--){
            r[i]=o;
            r1[i]=e;
            if(i%2==0) 
            e+=a[i];
            else 
            o+=a[i];
        }
        for(int i=0;i<a.length;i++){
            if(l[i]+r1[i]==l1[i]+r[i]){
                res++;
            }
        }
    }
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        fun(a);
        System.out.println(res);
    }
    
}
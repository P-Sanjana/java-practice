import java.util.*;
class Islandsfs{
    static int fun(int a[][]){
        int count=0;
        int v[][]=new int[a.length][a[0].length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(a[i][j]==1 && v[i][j]!=1){
                fun1(a,v,i,j);
                count++;}
            }
        }
        return count;
    }
    static void fun1(int a[][],int v[][],int x,int y){
        if(x<0 || x>=a.length || y<0 || y>=a[0].length || v[x][y]==1 || a[x][y]!=1)
        return;
        v[x][y]=1;
        fun1(a,v,x-1,y);
        fun1(a,v,x+1,y);
        fun1(a,v,x,y-1);
        fun1(a,v,x,y+1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int p=sc.nextInt();
        int a[][]=new int[m][n];
        String s="";
        for(int i=0;i<p;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            a[x][y]=1;
            s+=fun(a);
            s+=" ";
        }
        System.out.println(s);
    }
}
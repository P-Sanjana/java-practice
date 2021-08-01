import java.util.*;
class diagonalprint{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        for(int i=0;i<r;i++)
        for(int j=0;j<c;j++)
        a[i][j]=sc.nextInt();
        int f=0,f1=0,c1=0;
        for(int i=0;i<c;i++){
            if(f==0){
                int i1=i,k=;
                while(i1>=0 && k<=i){
                    System.out.println(a[k][i1]+" ");
                    i1--;
                    k++;
                }
                f=1;
            }
            else{
                int i1=i,k=0;
                while(i1>=0 && k<=i){
                    System.out.println(a[k][i1]+" ");
                    k++;
                    i1--;
                }
                f=0;
            }
        }
        if(c%2==0)
         f1=0;
        else
         f1=1;
        if(r%2==0 && c%2==0)
         c1=1;
         else if(r%2==0 || c%2==0)
         c1=2;
        else
         c1=1;
        for(int i=1;i<r;i++){
            if(f1==0){
                int i1=r-1,k=c1;
                while(i1>=i && k<r){
                    System.out.println(a[i1][k]+" ");
                    i1--;k++;
                }
                f1=1;c1++;
            }
            else{
                int i1=c-1,k=i;
                while(i1>=c1 && k<r){
                    System.out.println(a[k][i1]+" ");
                    k++;i1--;
                }
                f1=0;c1++;
            }
        }
    }
}
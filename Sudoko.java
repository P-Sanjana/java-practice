import java.util.*;
class Sudoko{
    static int n=9;
    public static boolean fun(int [][]b,int col){
        if(col>=n)
        return true;
        for(int i=0;i<n;i++){
            if(b[i][col]==0){
            for(int j=1;j<=n;j++){
            if(isSafe(b,i,col,j)){
                b[i][col]=j;
            if(fun(b,col+1))
            return true;
            else
            b[i][col]=0;
            }
            }
        }}
        return false;
    }
    public static boolean isSafe(int b[][],int row,int col,int num){
        for(int i=0;i<col;i++)
        if(b[row][i]==num)
        return false;
        for(int i=0;i<row;i++)
        if(b[i][col]==num)
        return false;
        int sqrt=(int)Math.sqrt(n);
        int rs=row-row%sqrt;
        int cs=col-col%sqrt;
        for(int i=rs;i<rs+sqrt;i++){
            for(int j=cs;j<cs+sqrt;j++){
                if(b[i][j]==num)
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int b[][]={{3,0,6,5,0,8,4,0,0},
                   {5,2,0,0,0,0,0,0,0},
                   {0,8,7,0,0,0,0,3,1},
                   {0,0,3,0,1,0,0,8,0},
                   {9,0,0,8,6,3,0,0,5},
                   {0,5,0,0,9,0,6,0,0},
                   {1,3,0,0,0,0,2,5,0},
                   {0,0,0,0,0,0,0,7,4},
                   {0,0,5,2,0,6,3,0,0}};
        if(!(fun(b,0)))
        System.out.println("No solution");
        else{
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(b[i][j]+" ");
                }
                System.out.println();
            }
        }

    }
}
import java.util.*;
class Knight{
    public static void fun(){
        int b[][]=new int[8][8];
        for(int i=0;i<8;i++)
            for(int j=0;j<8;j++)
                b[i][j]=-1;
            
        b[0][0]=0;
        int x[]={2,1,-1,-2,-2,-1,1,2};
        int y[]={1,2,2,1,-1,-2,-2,-1};
        if(!(fun1(0,0,1,x,y,b))){
           System.out.println("No solution");
        return;
        }
        else{
                for(int i=0;i<8;i++){
                for(int j=0;j<8;j++){
                    System.out.print(b[i][j]+" ");}
                System.out.println();}
        return;
        }
        
    }
    public static boolean fun1(int a,int c,int move,int x[],int y[],int b[][]){
        if(move==64)
        return true;
        int n_x,n_y;
        for(int i=0;i<8;i++){
            n_x=a+x[i];
            n_y=c+y[i];
            if(isSafe(n_x,n_y,b)){
            b[n_x][n_y]=move;
            if(fun1(n_x,n_y,move+1,x,y,b))
            return true;
            b[n_x][n_y]=-1;
            }
        }
        return false;
    }
    public static boolean isSafe(int a,int c,int b[][]){
    return (a>=0 && a<8 && c>=0 && c<8 && b[a][c]==-1);}   
    public static void main(String[] args){
        fun();
    }
}
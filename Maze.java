import java.util.*;
class Maze{
    public static void fun(int [][]b){
       int s[][]=new int[4][4];
       if(!(fun1(b,0,0,s))){
           System.out.println("No solution");
           return;
       }
        else{
            for(int i=0;i<4;i++){
                for(int j=0;j<4;j++){
                    System.out.print(s[i][j]+" ");}
                System.out.println();}
        return;
        }
    }
    public static boolean fun1(int b[][],int x,int y,int [][]s){
        if(x==3 && y==3){
            s[x][y]=1;
        return true;}
        if(isSafe(b,x,y)){
        s[x][y]=1;
        if(fun1(b,x+1,y,s))
        return true;
        if(fun1(b,x,y+1,s))
        return true;
        s[x][y]=0;
        return false;
        }
        return false;
    }
    public static boolean isSafe(int [][]b,int x,int y){
        return (x>=0 && x<4 && y>=0 && y<4 && b[x][y]==1);
    }
    public static void main(String[] args){
        int b[][]={{1,0,0,0},{1,1,0,1},{0,1,0,0},{1,1,1,1}};
        fun(b);
    }
}
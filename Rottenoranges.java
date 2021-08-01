import java.util.*;
class Rottenoranges{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        for(int i=0;i<r;i++)
        for(int j=0;j<c;j++)
        a[i][j]=sc.nextInt();
        int m=0,count=0,f=0;
        while(true){
            count=0;
            Queue<Integer> q=new LinkedList<Integer>();
            for(int i=0;i<r;i++){                           
                for(int j=0;j<c;j++){
                    if(a[i][j]==2){
                        if(i-1>=0 && a[i-1][j]==1){
                            count++;
                            q.add(i-1);
                            q.add(j);
                        }
                        if(i+1<r && a[i+1][j]==1){
                            count++;
                            q.add(i+1);
                            q.add(j);
                        }
                        if(j-1>=0 && a[i][j-1]==1){
                            count++;
                            q.add(i);
                            q.add(j-1);
                        }
                        if(j+1<c && a[i][j+1]==1){
                            count++;
                            q.add(i);
                            q.add(j+1);
                        }
                    }
                }}
            if(count==0)
            break;
            m++;
            while(q.size()!=0)
                a[q.poll()][q.poll()]=2;
            }
        for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
        if(a[i][j]==1){
            f=1;
            System.out.println(-1);
            break;}}
        if(f==1)
    break;}
        if(f==0)
        System.out.println(m);
    }
}
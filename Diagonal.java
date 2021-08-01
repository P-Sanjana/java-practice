import java.util.*;
class Diagonal{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    int a[][]=new int[x][y];
    for(int i=0;i<x;i++)
    for(int j=0;j<y;j++)
    a[i][j]=sc.nextInt();
    System.out.println();
    int r=a.length;
        int c=a[0].length;
        int k=0;
        if(c%2==0)
        k=c;
        else
        k=c-1;
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=0;i<c;i++){
            int ind=0,i1=i;
            for(int j=0;j<r;j++){
                if(i1<c){
                    arr.add(a[j][i1++]);
                 ind=j;}
            }
            i1--;
            Collections.sort(arr,Collections.reverseOrder());
            for(int j:arr)
                a[ind--][i1--]=j;
            arr.clear();
        }
        
        for(int i=1;i<r;i++){
            int ind=0,i1=i;
            for(int j=0;j<k;j++){
                if(i1<r){
                    arr.add(a[i1++][j]);
                    ind=j;
                }
            }
            i1--;
            Collections.sort(arr,Collections.reverseOrder());
            for(int j:arr)
            a[i1--][ind--]=j;
            arr.clear();
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++)
                System.out.print(a[i][j]+" ");
            System.out.println();
        }
    }
}
/*int k=0;
        if(r%2==0)
        k=c-1;
        else
        k=c-2;
        ArrayList<Integer>arr=new ArrayList<>();
        int ind=0,i1=0;
        for(int i=0;i<c;i++){
            ind=0;i1=i;
            while(ind<r && i1<c){
                    arr.add(a[ind][i1]);
                ++ind;
                ++i1;
                }
            Collections.sort(arr);
        int i2=arr.size();
            while(i2>0 && i1>i && ind>0){
                --i1;
            --ind;
                --i2;
                a[ind][i1]=arr.get(i2);
            }
            arr.clear();}
        
        for(int i=1;i<r;i++){
            ind=0;i1=i;
            while(ind<c && i1<r){
                    arr.add(a[i1][ind]);
                    ++i1;
                ++ind;
            }
           int i2=arr.size();
            Collections.sort(arr);
        while(i2>0 && ind>0 && i1>i){
            --ind;
            --i1;
            --i2;
            a[i1][ind]=arr.get(i2);
        }
            arr.clear();}*/
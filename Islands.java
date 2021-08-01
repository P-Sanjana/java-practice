import java.util.*;
class Islands{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int p=sc.nextInt();
        String s="";
        int a[][]=new int[m][n];
        DSets ds=new DSets(m*n);
        for(int k=0;k<p;k++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            a[x][y]=1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]==1){
                    if(i-1>=0 && a[i-1][j]==1)
                    ds.union(i*n+j,(i-1)*n+j);
                    if(i+1<m && a[i+1][j]==1)
                    ds.union(i*n+j,(i+1)*n+j);
                    if(j-1>=0 && a[i][j-1]==1)
                    ds.union(i*n+j,i*n+j-1);
                    if(j+1<n && a[i][j+1]==1)
                    ds.union(i*n+j,i*n+j+1);
                }
            }
        }
        int count=0;
        int f[]=new int[n*m];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]==1){
                    int z=ds.find(i*n+j);
                    if(f[z]==0){
                        count++;
                        f[z]++;
                    }
                    else
                    f[z]++;
                }
            }
        }
        s+=(char)(count+'0');
        s+=" ";
    }
    System.out.println(s);
}}
class DSets{
   static int n;
   static int [] r,p;
    DSets(int n){
        this.n=n;
        r=new int[n];
        p=new int[n];
        make();
    }
    static void make(){
        for(int i=0;i<n;i++)
        p[i]=i;
    }
    static int find(int x){
        if(p[x]!=x)
        return find(p[x]);
        return x;
    }
    static void union(int x,int y){
        int xp=find(x);
        int yp=find(y);
        if(xp==yp)
        return;
        if(r[xp]<r[yp])
        p[xp]=yp;
        else if(r[yp]<r[xp])
        p[yp]=xp;
        else{
            p[xp]=yp;
            r[xp]++;
        }
    }
}

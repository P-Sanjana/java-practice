import java.util.*;
class CFG{
    public static int fun(int dp,int lf,int d,int c,int n){
        if(dp==n)
        return Math.min(d,c);
        if(dp<n && dp+lf<n)
        d=fun(dp+lf,2*lf,d,c+1,n);
        if(dp<n && lf<0)
        d=fun(dp,1,d,c+1,n);
        if(dp<n && lf>0)
        d=fun(dp,-1,d,c+1,n);
        return d;
    }
    public static void main (String[] args) {
        int n=new Scanner(System.in).nextInt();
        int dp=0,lf=1,c=0;
        System.out.println(fun(dp,lf,Integer.MAX_VALUE,c,n));
        /*String s="";
        while(lf<n&&dp<n && dp!=n && lf!=n){
            s+='L';
            dp+=lf;
            lf=2*lf;
        }
        if(dp==n){
            
        System.out.println(s.length());
        }
        else{
            int k=0;
            while(true){
                if(k==0){
                    s+='D';
                    if(dp>0)
                    lf=-1;
                    else
                    lf=1;
                    k=1;
                }
                else if(k==1){
                    s+='L';
                    dp+=lf;
                    if(lf==-1)
                    lf=1;
                    else
                    lf*=2;
                    k=0;
                }
                if(dp==n)
                break;
            }
        
        System.out.println(s.length());}*/
    }
}
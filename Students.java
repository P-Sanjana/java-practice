/*import java.util.*;
class Stu implements Comparable<Stu>{
    int roll;
    String name;
    Stu(int roll,String name){
        this.roll=roll;
        this.name=name;
    }
    @Override
    public int compareTo(Stu s){
    return this.name.compareTo(s.name);}
}
class Students{
    public static void main(String[] args){
        Stu s[];
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        s=new Stu[n];
        for(int i=0;i<n;i++){
            int roll=sc.nextInt();
            String name=sc.next();
            s[i]=new Stu(roll,name);
        }
        Arrays.sort(s);
        for(int i=0;i<n;i++)
        System.out.println(s[i].roll+" "+s[i].name);
    }
}*/
import java.util.*;
class Students{
    public static int Subsequence(int a[],int k,int start,int curr,boolean []visit,int res1){
        if(curr==k){
            int b[]=new int[k];
            int m=0;
            for(int i=0;i<a.length;i++){
                if(visit[i]==true){
                b[m]=a[i];
                m++;
            }}
            Arrays.sort(b);
            int res=0;
            for(int i=0;i<k-1;i++){
                res+=b[k-1]-b[i];
            }
            if(res<=res1)
            res1=res;
        return res1;
        }
        if(start==a.length)
        return  res1;
        visit[start]=true;
        res1=Subsequence(a,k,start+1,curr+1,visit,res1);
        visit[start]=false;
        res1=Subsequence(a,k,start+1,curr,visit,res1);
        return res1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int p=sc.nextInt();
            int a[]=new int[n];
            for(int j=0;j<n;j++)
            a[j]=sc.nextInt();
            boolean v[]=new boolean[n];
            System.out.println(Subsequence(a,p,0,0,v,Integer.MAX_VALUE));
        }
    }
}
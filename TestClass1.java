/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.*;
class TestClass1 {
    static int v,count=0,n;
    static int max=Integer.MIN_VALUE,c=0;
   // static int visit[]=new int[n+1];
   static LinkedList<Integer>l[];
    TestClass1(int v){
        this.v=v;
        l=new LinkedList[v+1];
        for(int i=0;i<=v;i++)
        l[i]=new LinkedList<Integer>();
    }
   static  void addE(int x,int y){
        l[x].add(y);
        l[y].add(x);
    }
    static void print(){
        for(int i=1;i<=v;i++){
            System.out.print(i+"->");
            for(int j:l[i])
            System.out.print(j);
            System.out.println();
        }
    } 
   static void  dfs(int a,int visit[]){
        visit[a]=1;
        count++;
        
        for(int i:l[a]){
          
            if(visit[i]==0){
            dfs(i,visit);
        }}
    }
    public static void main(String args[] ) throws Exception {
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    int m=sc.nextInt();
    TestClass1 t=new TestClass1(n);
    for(int i=0;i<m;i++){
        int x=sc.nextInt();
        int y=sc.nextInt();
        addE(x,y);
    }
    t.print();
    int visit[]=new int[n+1];
         for(int i=1;i<=n;i++){
             //System.out.println(i);
            if(visit[i]==0){
                count=0;
                dfs(i,visit);
                c++;
                if(max<count)
                max=count;
            }
        }
    System.out.println(c+" "+max);
    }
}

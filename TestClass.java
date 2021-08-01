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
class TestClass {
    static int v,count=0;
    static int max=Integer.MIN_VALUE,c=0;
   static LinkedList<Integer>l[];
    TestClass(int v){
        this.v=v;
        l=new LinkedList[v];
        for(int i=0;i<v;i++)
        l[i]=new LinkedList<Integer>();
    }
   static  void addE(int x,int y){
        l[x].add(y);
        l[y].add(x);
    }
   static void connect(){
        boolean visit[]=new boolean[v];
        for(int i=0;i<v;i++){
            if(!visit[i]){
                count=1;
                count=dfs(visit,i,count);
                c++;
                if(max<count)
                max=count;
            }
        }
    }
   static int dfs(boolean visit[],int a,int count){
        visit[a]=true;
        for(int i:l[a]){
            if(!visit[i]){
                count++;
            return dfs(visit,i,count);
        }}
        return count;
    }
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input
        
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    TestClass t=new TestClass(n);
    for(int i=0;i<m;i++){
        int x=sc.nextInt();
        int y=sc.nextInt();
        addE(x-1,y-1);
    }
    t.connect();
    System.out.println(c+" "+max);
    }
}

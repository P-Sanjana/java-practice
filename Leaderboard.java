import java.util.*;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer>a=new ArrayList<>();
        for(int i=0;i<n;i++){
        a.add(sc.nextInt());
       // System.out.println(a);
        //if(i!=0 && a.get(i-1)==a.get(i))
        //a.remove(i);
        }
        for(int i=1;i<a.size();i++){
            if(a.get(i-1)==a.get(i))
           // System.out.println(a);
            a.remove(i);
        }
        //System.out.println(a);
        int m=sc.nextInt();
        ArrayList<Integer>b=new ArrayList<>();
        for(int i=0;i<m;i++)
        b.add(sc.nextInt());
        for(int i=0;i<m;i++){
            if(!a.contains(b.get(i))){
            a.add(b.get(i));
            Collections.sort(a,Collections.reverseOrder());
            System.out.println(a.indexOf(b.get(i)));
            a.remove(a.indexOf(b.get(i)));
            }
            else
            System.out.println(a.indexOf(b.get(i)));
        }
        
            }
}
import java.util.*;
class Transaction{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<Integer,Integer>h=new HashMap<>();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            if(!h.containsKey(x))
            h.put(x,z);
            else
            h.put(x,h.get(x)+z);
            if(!h.containsKey(y))
            h.put(y,-z);
            else
            h.put(y,h.get(y)-z);
        }
        int c=0;
        for(int i:h.values()){
            if(i<0)
            c++;
        }
        System.out.println(c);
    }
}
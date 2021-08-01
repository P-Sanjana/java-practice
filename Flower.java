import java.util.*;
class Flower{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1[]=s.split(" ");
        int a[]=new int[s1.length];
        for(int i=0;i<a.length;i++)
        a[i]=Integer.parseInt(s1[i]);
        ArrayList<Integer>arr=new ArrayList<>();
        int k=Integer.MIN_VALUE;
        int count=1,j=1;
        while(a[0]==a[j]){
            count++;j++;
        }
        for(int i=j;i<a.length;i++){
            int c=1;
            while(i+1<a.length && a[i]==a[i+1]){
                i++;c++;
            }
            if(c>1)
            i--;
            if(a[i]!=k){
               arr.add(count+c);
               k=a[i-c];
               count=c; 
            }
            else{
                int a1=arr.get(arr.size()-1);
                arr.remove(arr.size()-1);
                arr.add(a1+count);
                k=a[i-c];
                count=c;
            }
        }
        System.out.println(arr);
    }
}
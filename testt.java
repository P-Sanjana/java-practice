import java.util.*;
class Slot{
    int start,end;
    Slot(int start,int end){
        this.start=start;
        this.end=end;
    }
}
class Testtt{
    public static void main (String[] args) {
        /*Scanner sc=new Scanner(System.in);
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
               k=a[i-count];
               count=c; 
            }
            else{
                int a1=arr.get(arr.size()-1);
                arr.remove(arr.size()-1);
                arr.add(a1+count);
            }
        }
        System.out.println(arr);*/
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       List<Slot>l=new ArrayList<>();
       for(int i=0;i<n;i++)
       l.add(new Slot(sc.nextInt(),sc.nextInt()));
       Collections.sort(l,new Comparator<Slot>(){
           public int compare(Slot s1,Slot s2){
           if(s1.start<s2.start || (s1.start==s2.start && s1.end<s2.end))
           return 0;
           else
           return 1;
           }
       });
       for(Slot s:l)
       System.out.println(s.start+" "+s.end);
       int last=0;
       for(int i=0;i<n-1;i++){
           last=Math.max(last,l.get(i).end);
           if(last<l.get(i+1).start)
           System.out.println(last+" "+l.get(i+1).start);
       }
    }
}
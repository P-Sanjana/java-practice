import java.util.*;
class Series{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=2;int l=0;
        while(n!=1){
            ArrayList<Integer>b=new ArrayList<>();
            for(int j=2;j<=i;j++){
                int c=0;
                if(i%j==0){
                    for(int k=1;k<=j;k++){
                        if(j%k==0)
                        c++;
                    }
                }
                if(c==2)
                b.add(j);
            }int f=1;
            for(int j:b){
                if(j!=2 && j!=3 && j!=5){
                    f=0;
                    break;
                }
            }
            if(f==1){
            n--;l=i;
            i++;}
            else
            i++;
            //System.out.println(i+" "+n);
        }
        System.out.println(l);
    }
}
import java.util.*;
class CFG{
    public static String fun(int a[]){
        for(int i=0;i<6;i++){
            if(i<3 && a[i]<1 && a[i]>60)
            return "-1";
            if(i>3 && a[i]<1 && a[i]>100)
            return "-1";
        }
        for(int i=0;i<2;i++){
            if((a[i+1]>a[i] && a[i+4]<a[i+3]) || (a[i+1]<a[i] && a[i+4]>a[i+3]))
            return "Not Correct";
        }
        return "Correct";
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int j=0;j<n;j++){
            int a[]=new int[6];
            for(int i=0;i<6;i++){
        a[i]=sc.nextInt();}
        System.out.println(fun(a));
        }
    }
}
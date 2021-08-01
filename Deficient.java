import java.util.*;
class Deficient{
    public static void main(String[] args) {
        int n,i,s=0;
        n=new Scanner(System.in).nextInt();
        for(i=1;i<=n;i++){
            if(n%i==0){
                s=s+i;
            }
        }
        if(s<2*n){
            System.out.println("Deficient");
        }
        else{
            System.out.println("not deficient");
        }
        String str;
        str=new Scanner(System.in).nextLine();
        for(i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                continue;
            }
            else{
                System.out.print(str.charAt(i));
            }
        }
        int a=new Scanner(System.in).nextInt();
        int b=1;
        for(i=0;i<a;i++){
            for(int j=0;j<=i;j++){
                System.out.print(b*b+" ");
                b++;
            }
            System.out.println();
        }
    }
}

import java.util.*;
class Fisher{
    public static void main(String args[]){
        int n,i,p=1;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            if(n%i==0){
                p=p*i;
            }
        }
        if((n*n*n)==p){
            System.out.println("Fisher");
        }
        else{
            System.out.println("not fisher");
        }
    }
}
import java.util.*;
class Mersenne{
public static void main(String args[]){
    int n,i,a=0,flag=0;
    System.out.println("Enter the number");
    n=new Scanner(System.in).nextInt();
    for(i=1;i<=n;i++){
        if(n%i==0){
            a++;
        }
    }
    if(a==2){
        i=1;
        while(i<=n){
         if(n==(Math.pow(2,i)-1)){
            flag=1;
            break;
         }
         i++;
        }
    }
    if(flag==1){
        System.out.println("Mersenne");
    }
    else{
        System.out.println("not");
    }
}
}
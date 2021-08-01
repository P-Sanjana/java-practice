import java.util.*;
class Maxright{
public static void main(String args[]){
int n,i,j,max;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int []a=new int[n];
for(i=0;i<n;i++){
    a[i]=sc.nextInt();
}
for(i=0;i<n-1;i++){
    for(j=1;j<n-i;j++){
    if(a[i+j]>a[i+j+1]){
a[i]=a[i+j];
    }
    else{
        a[i]=a[i+j+1];
    }
}}
for(i=0;i<n;i++){
    System.out.println(a[i]);
}
}
}
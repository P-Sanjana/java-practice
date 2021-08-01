import java.util.Scanner;
class ATM{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
int a[]=new int[t];
int b[]=new int[t];
for(int i=0;i<t;i++)
a[i]=sc.nextInt();
for(int i=0;i<t;i++)
b[i]=1;
for(int i=0;i<t;i++){
while(a[i]!=0){
b[i]=b[i]*a[i];
a[i]--;
}
}
for(int i=0;i<t;i++)
System.out.println(b[i]);
}
}
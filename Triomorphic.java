import java.util.*;
class Triomorphic{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int c=0;
int flag=0;
int a=n*n*n;
String s=""+a;
String s1=""+n;

for(int i=n;i>0;i=i/10){
    c++;
}
for(int i=0;i<c;i++){
    if(s1.charAt(s1.length()-i-1)==s.charAt(s.length()-i-1)){
        flag++;
}
}    
    

if(flag!=0){
    System.out.println("Triomorphic");
}
else{
    System.out.println("not"); 
}
}
}
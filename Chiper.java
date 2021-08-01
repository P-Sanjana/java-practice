import java.util.*;
class Chiper{
    public static void main(String[] args) {
        String str;
        int d;
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                System.out.print(" "); 
            }
            else{
         char a=str.charAt(i);
         
         a++;
         System.out.print((char)(a));
        }
    }
     
    }
}
import java.util.*;
class Stringsort{
    public static void main(String[] args) {
        String str;
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        int a[]=new int[26];
        int b[]=new int[10];
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>=97&&str.charAt(i)<=123){
                a[str.charAt(i)-'a']++;
            }
            else if(str.charAt(i)>=48&&str.charAt(i)<=58){
                b[str.charAt(i)-'0']++;
            }
                else{
                    System.out.print(str.charAt(i));
                }
            
        }
        for(int i=0;i<10;i++){
            for(int j=1;j<=b[i];j++){
                if(b[i]==0){
                    continue;
                }
                else{
                System.out.print((char)(i+'0'));
                }
            }
        }
        for(int i=0;i<26;i++){
            for(int j=1;j<=a[i];j++){
                if(a[i]==0){
                    continue;
                }
                else{
                System.out.print((char)(i+'a'));
                }
            }
        }
   }
}
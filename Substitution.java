import java.util.*;
public class Substitution{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the message");
        String message=sc.next();
        String a="abcdefghijklmnopqrstuvwxyz";
        String b="zyxwvutsrqponmlkjihgfedcba";
        String encrypt="";
        String decrypt="";
        for(int i=0;i<message.length();i++){
            int ind=a.indexOf(message.charAt(i));
            encrypt+=b.charAt(ind);
        }
        System.out.println("Encrypted message : "+encrypt);
        for(int i=0;i<encrypt.length();i++){
            int ind=a.indexOf(encrypt.charAt(i));
            decrypt+=b.charAt(ind);
        }
        System.out.println("Decrypted message : "+decrypt);
    }
}
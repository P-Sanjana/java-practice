import java.util.*;
class Scrabble{
    public static void main(String[] args) {
        String str;
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        String a[]=str.split(" ");
        int s[]=new int[a.length];
        int i,j;
        for(i=0;i<a.length;i++){
            for(j=0;j<a[i].length();j++){
            if(a[i].charAt(j)=='e'||a[i].charAt(j)=='i'||a[i].charAt(j)=='a'||a[i].charAt(j)=='r'||a[i].charAt(j)=='n'||a[i].charAt(j)=='o'||a[i].charAt(j)=='t'||a[i].charAt(j)=='l'||a[i].charAt(j)=='s'||a[i].charAt(j)=='u'){
                s[i]+=1;
            }
            else if(a[i].charAt(j)=='d'||a[i].charAt(j)=='g'){
                s[i]+=2;
            }
            else if(a[i].charAt(j)=='p'||a[i].charAt(j)=='m'||a[i].charAt(j)=='c'||a[i].charAt(j)=='b'){
                s[i]+=3;
            }
            else if(a[i].charAt(j)=='y'||a[i].charAt(j)=='w'||a[i].charAt(j)=='v'||a[i].charAt(j)=='h'||a[i].charAt(j)=='f'){
                s[i]+=4;
            }
            else if(a[i].charAt(j)=='k'){
                s[i]+=5;
            }
                else if(a[i].charAt(j)=='j'||a[i].charAt(j)=='x'){
                    s[i]+=8;
                }
                else if(a[i].charAt(j)=='q'||a[i].charAt(j)=='z'){
                    s[i]+=10;
                }
            
            }
        }
        int max;
        max=s[0];
        int b=0;
        for(i=0;i<a.length;i++){
           if(s[i]>max){
               max=s[i];
               b=i;
           }
        }
    System.out.println(a[b]);
  }
}
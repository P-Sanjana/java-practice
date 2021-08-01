import java.util.*;
class DistinctSubstring{
    public static void main(String[] args){
        String s=new Scanner(System.in).next();
        int len=0,f=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String s1=s.substring(i,j);
                f=0;
                for(int k=0;k<s1.length();k++){
                    char a=s1.charAt(k);
                    for(int l=k+1;l<s1.length();l++){
                        if(a==s1.charAt(l)){
                            f=1;
                        break;
                        }
                    }
                    if(f==1)
                    break;
                }
                if(f==0)
                    len=Math.max(len,s1.length());
            }
        }
        System.out.println(len);
    }
}
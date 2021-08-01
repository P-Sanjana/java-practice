import java.util.*;
class AsBs{
    public static void main(String[] args){
        String s=new Scanner(System.in).next();
        
        if((s.matches("^[C-Z]")))
        System.out.println(-1);
        else{
            int count=0;
            for(int i=0;i<s.length();i++){
                for(int j=i+1;j<=s.length();j++){
                    String s1=s.substring(i,j);
                    if(s1.length()%2==0){
                    int f=0;
                    if(s1.charAt(0)=='A'){
                        for(int k=0;k<s1.length()/2;k++){
                            if(s1.charAt(k)=='B'){
                                f=1;
                                break;
                            }
                        }
                        if(f==0){
                            for(int k=s1.length()/2;k<s1.length();k++){
                                if(s1.charAt(k)=='A'){
                                    f=1;
                                    break;
                                }
                            }
                        }
                    }
                    else{
                    if(f==0){
                   
                        for(int k=0;k<s1.length()/2;k++){
                            if(s1.charAt(k)=='A'){
                                f=1;
                                break;
                            }
                        }
                        if(f==0){
                            for(int k=s1.length()/2;k<s1.length();k++){
                                if(s1.charAt(k)=='B'){
                                    f=1;
                                    break;
                                }
                            }
                        }
                    }}
                   
                    if(f==0){
                    count++;
                    System.out.println(s1);}
                    }}
                }
                System.out.println(count);
            }
        }
    }
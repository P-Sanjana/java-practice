import java.util.*;
class Arrow{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String secret=sc.next();
        String guess=sc.next();
        int arrow=0;
        int bow=0;
        int arr1[]=new int[10];
        int arr2[]=new int[10];
        for(int i=0;i<secret.length();i++){
            arr1[i]=(secret.charAt(i)-'0');
        }
        for(int i=0;i<secret.length();i++){
            arr2[i]=(guess.charAt(i)-'0');
        }
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    arrow++;
                }
                else{
                    bow++;
                }
            }
        }
        System.out.print(arrow+"A"+bow+"B");
    }
}
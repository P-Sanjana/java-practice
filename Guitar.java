import java.util.*;
class Guitar{
    public static void main(String args[]){
        int i,k,temp=0,g;
        System.out.println("Enter size of zarray");
        int n=new Scanner(System.in).nextInt();
        int[] arr=new int[n];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements in array");
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter g value");
        g=sc.nextInt();
        for(i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;i++){
                if(arr[j]>arr[j+1]){
                    k=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=k;
                }
            }
        }
            for(i=0;i<n;i++){
                temp+=arr[i];
                if(temp==g){
                    System.out.println("giutar");
                    break;
                }
                else if(temp<g){
                    continue;
                }
                else if(temp>g){
                    temp-=arr[i];  
                 }
            }
           if(i==n){
              System.out.println("not");
            }
            
    }
}
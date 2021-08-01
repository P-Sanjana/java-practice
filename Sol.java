import java.util.*;
class Sol{
    public static void main(String args[]){
        int a[]={3,2,1,0,-1,0,1,2,3,4,5};
       // {5,2,-3,6,4,-20,-2,8,1,-1,5,-30,4}
       int key=1;
       for(int i=0;i<a.length;i++){
           if(key==a[i]){
               System.out.println("found");
               System.exit(0);
           }
           else{
               int d=Math.abs(a[i]-key);
               int jumpElement=a[i+d];
               if(jumpElement==key){
                System.out.println("found");
                System.exit(0);
               }
               else{
                int ind=i;
                   if(jumpElement<a[i]){
                       i=i+d;
                       continue;
                   }
                   else if(jumpElement==a[i] || jumpElement>key){
                       
                       while(ind-1>=0 && a[ind]!=key && a[ind]>a[ind-1]){
                           ind--;
                       }
                   }
                   else{
                       i=i+d;
                       continue;
                   }
               }
           }
       }
       System.out.println("not found");
    }
}
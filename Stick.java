import java.util.*;

class Stick
{
    public static void main(String args[])
    {
  
     int i,j,n,count=0,temp;
  
    Scanner sc=new Scanner(System.in);
   
    n=sc.nextInt();   
 int  a[]=new int[n];
       
     
  for(i=0;i<n;i++)
       {
        
 a[i]=sc.nextInt();  
       }
      
 for(i=0;i<n;i++)
       {
  
for(j=i+1;j<n;j++){
 
        if(a[i]>a[j])
    
       {
              
 temp=a[i];
    
           a[i]=a[j];
      
         a[j]=temp;
              
 count++;
   }}
      }
       System.out.println(count);
  
      
    }
}
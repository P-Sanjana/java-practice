import java.util.*;
class Scientific{
    public static void main(String[] args) {
        double n,i;
        int count=0,count2=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextDouble();
        int a=(int)n/10;
        if(a!=0){
            for(i=n;i>=10;i=i/10){                                
               //int b=(int)i%10;                    //for(;n>=10||n<=1;){
                if(i>=10){                                //if(n>=10){*/
                    count++;                                  //n=n/10;
                }                                               //count++};
        }                                                      //else{n=n*10;count--;}
        System.out.println((int)i+"*10^"+count);              
        }
        else{ 
            int d=(int)n/10;
            for(i=n;d==0;i=i*10){
                int c=(int)i*10;
                if(c==0){
                    count2++;
                } 
                else{
                    count++;
                    break;
                }
                d=(int)i*10/10;
            }
            System.out.println((float)i+"*10^-"+count2);
        }
    }
}
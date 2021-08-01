import java.util.*;
class Pattern{
    public static void main(String args[]) {
        int n,i,j;
        System.out.println("Enter n value");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();                                
       /* for(i=0;i<n;i++){                            *
            for(j=0;j<=i;j++){                         **
                System.out.print("*");                 ***
            }                                          ****
            System.out.println();
        }
    }*/
    /*for(i=0;i<n;i++){                                 1
        int k=1;                                        12
        for(j=0;j<=i;j++){                              123
           System.out.print(k);                         1234
           k++;
        }
        System.out.println();
    }*/
    /*char a='A';                                       A
    for(i=0;i<n;i++){                                   BB
        for(j=0;j<=i;j++){                              CCC
            System.out.print((char)a);                  DDDD
        }
        a++;
        System.out.println();
    }*/
    /*for(i=0;i<n;i++){                                ****
        for(j=n;j>i;j--){                              ***
            System.out.print("*");                     **
        }                                              *
        System.out.println();
    }*/
    /*for(i=0;i<n;i++){                               1234
        int k=1;                                      123
        for(j=n;j>i;j--){                             12 
            System.out.print(k);                      1
            k++;
        }
        System.out.println();
    }*/
   /*for(i=0;i<n;i++){
    for(int k=0;k<=((2*n)-1-(2*i))/2;k++){                               *
        System.out.print(" ");                                          ***
    }                                                                  *****
     for(j=0;j<=(((2*n)-1)-(2*(((2*n)-1)-(2*i))/2));j++){             *******
            
            System.out.print("*");
        }
        System.out.println();
    }*/
    //int l,a;
    /*for(i=0;i<n;i++){
        for(int k=0;k<=((2*n)-1-(2*i))/2;k++){                              
            System.out.print(" ");                               1
    }                                                           232
    int count=0,b=0;                                           34543
    for(j=0;j<=(((2*n)-1)-(2*(((2*n)-1)-(2*i))/2));j++){      4567654
        count++;
    }
    l=i+1; 
    for(j=0;j<=(((2*n)-1)-(2*(((2*n)-1)-(2*i))/2));j++){ 
             a=count/2;
        if(b<a){
        System.out.print(l);
        l++;b++;
    }
    else{
        System.out.print(l);
        l--;b++;
    }
}
System.out.println();
}*/
/*int k;
for(i=0;i<n;i++){                                           *****
    for(k=0;k<i;k++){                                        ***
        System.out.print(" ");                                *
    }
    for(j=(2*n)-1-(2*i);j>=1;j--){
        System.out.print("*");
    }
    System.out.println();
}*/
/*int k=1;                                                  1
for(i=0;i<n;i++){                                           23
    for(j=0;j<=i;j++){                                      456
        System.out.print(k);                                78910
        k++;
    }
    System.out.println();
}*/
/*int c=1;
for(i=0;i<n;i++){                                           1
    for(int k=0;k<n-i;k++){                               1   1
        System.out.print("  ");                         1   2   1
    }                                                 1   3   3   1
    for(j=0;j<=i;j++){
        if(j==0||i==0){
            c=1;
        }
        else{
            c=c*(i-j+1)/j;
        }
        System.out.printf("%4d",c);
    }
    System.out.println();
}*/
/*for(i=0;i<n;i++){                                         *
    for(int k=0;k<n-i;k++){                                **
        System.out.print(" ");                            ***
    }                                                    ****
    for(j=0;j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
}*/
/*for(i=0;i<n;i++){
    for(int k=0;k<=((2*n)-1-(2*i))/2;k++){                               
        System.out.print(" ");                                         
        }                                                                       *      
     for(j=0;j<=(((2*n)-1)-(2*(((2*n)-1)-(2*i))/2));j++)                       ***
            System.out.print("*");                                            *****
        System.out.println();                                                  ***
    }                                                                           *
        for(i=0;i<n-1;i++){ 
            System.out.print("  ");                                          
            for(int k=0;k<i;k++){                                        
                System.out.print(" ");                                
            }
            for(j=(2*(n-1)-1-(2*i));j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }*/

        
        int a = sc.nextInt();
        Double d=sc.nextDouble();
        sc.next();
       String s=sc.next();
        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + a);
    

}}

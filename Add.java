import java.util.*;
public class Add{
   public static void main(String args[]){
    Redmi r=new Mobile();
    r.Camera();
    r.messaging(3);
    r.printColor();
    //System.out.println(r.model);
   }
    
   }
   public class Mobile{
      private int model;
       String color="white";
       int type;
       int size;

    void Camera(){
        System.out.println("Mobile Camera");
    }
   
    void messaging(String txt){
        System.out.println("Mobile"+txt);
    }
   }
   public class Redmi extends Mobile{
       void Camera(){
           System.out.println("Redmi Camera");
       }
       String color="red";
       void printColor(){
           System.out.println(color);
       }
       void messaging(int n){
           System.out.println("Redmi"+n);
       }
   }

/*arr=[3,2,1,0,-1,0,1,2,3,4,5]
key=5;*/
//select name from employee where sal=max(sal) and  not in (select max(sal) from employee);


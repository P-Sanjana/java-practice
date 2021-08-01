import java.util.*;
interface A{
   
    
} 
interface B extends A{
 public void d1();
    public void d2();
}
interface C extends A{
     public void d3();
    public void d4();}

class D implements C,B{
   public void d1(){
       System.out.println("d1");
   }
    public void d3(){
       System.out.println("d3 ");
   }
    public void d2(){
       System.out.println("d2");
   }
    public void d4(){
       System.out.println("d4");
   }
     
}
class Multiple{
    public static void main(String args[]){
D c=new D();
c.d1();
c.d3();
    }
}


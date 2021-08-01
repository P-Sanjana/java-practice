class A{
    A(){
      System.out.println("Constructor A");  
    }
    void m1(){
        System.out.println("m1 of class A");
    }
}
class B extends A{
    B(){
        System.out.println("Constructor B");
    }
    void m2(){
        System.out.println("m1 of class B");
    }
}
class Q{
public static void main(String args[]){
    B  b= new B();
    b.m1();
    b.m2();
}
}
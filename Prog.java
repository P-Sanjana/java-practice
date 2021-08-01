import java.util.*;
import java.rmi.activation.UnknownGroupException;
import java.time.LocalDate;
interface UGC{
    public static int getAdmission(){
        Scanner sc=new Scanner(System.in);
            int admissionno=sc.nextInt();
                int percentage=sc.nextInt();
                if(percentage>=60){
                    return (int)Math.random();
                }
                return 0;
    }
    abstract  String payFee();
}
interface AICTE{
    public static int getAdmission(){
        System.out.println("Join the counselling after 5 days");
        LocalDate date =  LocalDate.now().plusDays(5);
        System.out.println("Date of counselling: "+date);
        return (int)Math.random();
    }
    abstract  String payFee();
}
class University implements UGC , AICTE{
    int duefee=20000;
    public int getAdmission(){
        Scanner sc=new Scanner(System.in);
        int percentage=sc.nextInt();
        boolean direct=true;
    if(direct)
    return UGC.getAdmission();
    
        return AICTE.getAdmission();
    }
    public  String payFee(){
        return "";
    }
}
class LPU extends University{
   public  String payFee(){
        Scanner sc=new Scanner(System.in);
        int fee=sc.nextInt();
            super.duefee-=fee;
        System.out.println("deposited fee: "+fee);
        System.out.println("Due fee: "+super.duefee);
        int receipt=(int)Math.random();
        return Integer.toString(receipt);
    }
}
class Prog{
    public static void main(String args[]){
        LPU l=new LPU();
        System.out.println(l.payFee());
        University u=new University();
        System.out.println(u.getAdmission());
    }
}

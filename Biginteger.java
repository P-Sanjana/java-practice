import java.util.*;
import java.math.BigInteger;
class Biginteger{
    public static void main(String args[]){
        BigInteger a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextBigInteger();
        b=sc.nextBigInteger();
        System.out.println(a.add(b));
    }
}
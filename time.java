import java.time.*;
class time
{
    public static void main(String args[])
    {
        LocalDate d1=LocalDate.now();
        LocalDate d2=LocalDate.of(2017,Month.FEBRUARY,20);
        d1=d1.plusDays(2);
        d2=d2.plusDays(2);
        if(d1 instanceof LocalDate)
        System.out.println(d1);
        if(d1 instanceof LocalDate) 
        System.out.println(d2);

    }
}
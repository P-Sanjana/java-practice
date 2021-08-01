import java.util.*;
class Planets{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char planets[]=s.split(" ");
        int hours=sc.nextInt();
        int k=1;
        while(true){
        for(int i=0;i<planets.length;i++){
            if((planets.charAt(i))-'0')-k<=0)
            hours--;
            else{
                while(k-(planets.charAt(i))-'0')>0){
                    hours--;
                    (planets.charAt(i))-'0')-=k;
                }
                hours--;
            }
        }
        if(hours==0){
        System.out.println(k);
        break;}
        else
        k++;
        }
    }
}
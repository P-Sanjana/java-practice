import java.util.*;
import java.io.*;
class Employee{
    int id;
    String name;
    float sal;
Employee(String s[]){
    id=Integer.parseInt(s[0]);
    name=s[1];
    sal=Float.parseFloat(s[2]);
}
}
class place2{
    public static void main(String[] args){
        Employee[] e1=new Employee[3];
        Employee[] e2=new Employee[3];
        Employee[] e3=new Employee[3];
        Employee[] e4=new Employee[e1.length+e2.length+e3.length];
        String str;
        int i;
        Scanner sc;
        try{
            sc=new Scanner(new FileReader("emp1.txt"));
            i=0;
            while(sc.hasNext()){
                str=sc.nextLine();
                e1[i++]=new Employee(str.split(","));
            }
            sc=new Scanner(new FileReader("emp2.txt"));
            i=0;
            while(sc.hasNext()){
                str=sc.nextLine();
                e2[i++]=new Employee(str.split(","));
            }
            sc=new Scanner(new FileReader("emp3.txt"));
            i=0;
            while(sc.hasNext()){
                str=sc.nextLine();
                e3[i++]=new Employee(str.split(","));
            }
        }
        catch(IOException ie){
        ie.printStackTrace();}
        e4=merge(e1,e2);
        e4=merge(e3,e4);
        for(i=0;i<e4.length;i++)
        System.out.println(e4[i].id+" "+e4[i].name+" "+e4[i].sal);
    }
    public static Employee[] merge(Employee e1[],Employee e2[]){
        Employee[] e=new Employee[e1.length+e2.length];
        int j=0,k=0,l=0;
        while(j<e1.length && k<e2.length){
            if(e1[j].id<=e2[k].id){
                e[l]=e1[j];
                j++;
            }
            else{
                e[l]=e2[k];
                k++;
            }
            l++;
        }
        while(j<e1.length){
            e[l]=e1[j];
            l++;j++;
        }
        while(k<e2.length){
            e[l]=e2[k];
            k++;l++;
        }
        return e;
    }
}
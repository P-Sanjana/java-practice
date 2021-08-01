class Access{
public int x;
private int y;
void cal(int a,int b){
x=a+1;
y=b;
}
void print(){
System.out.println(" "+y);
}
}

class Access_Specifier{
public static void main(String args[]){
Access obj=new Access();
obj.cal(2,3);
System.out.println(obj.x);
obj.print();
}
}

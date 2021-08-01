import java.util.*;
import java.lang.*;
class Node{
    
    public int data;
    public Node next,prev;
    Node(int n){
        data=n;
        next=null;
        prev=null;
    }
}
class List{
    public Node first,last;
    public int size;
    List(){
        first=null;
        last=null;
        size=0;
    }
    void create(int n){
        if(first==null){
            first=new Node(n);
            last=first;
            System.out.println(n+" added");
            size++;
        }
        else{
            Node temp=new Node(n);
            last.next=temp;
            temp.prev=last;
            last=temp;
            System.out.println(n+" added");
            size++;
        }
    }
    void del(int n){
        if(first.data==n){
            Node temp=first;
            first=first.next;
            first.prev=null;
            temp=null;
            System.out.println(n+" deleted");
            size--;
        }
        else{
            Node temp=first;
            while(temp.next!=null && temp.next.data!=n){
                temp=temp.next;
            }
            if(temp.next==null){
                System.out.println(n+" is not found");
            }
            else{
                Node t=temp.next;
                temp.next=t.next;
                if(temp.next!=null)
                t.next.prev=temp;
                else
                last=temp;
                t=null;
                System.out.println(n+" deleted");
                size--;
            }
        }
    }
    void display(){
        Node t;
        for(t=first;t!=null;t=t.next){
            System.out.print(t.data+"->");
        }
    }
    void checkempty(){
        if(size==0){
            System.out.println("empty list");
        }
        else
        System.out.println("not empty");
    }
    int getSize(){
        return size;
    }
}
class DLL{
    public static void main(String args[]){
    List l=new List();
    int n,ch;
    while(true){
    System.out.println("1.Create 2.Delete 3.Display 4.Check empty 5. getsize 6.exit");
    System.out.println("Enter your choice");
    ch=new Scanner(System.in).nextInt();
    
    switch(ch){
        case 1:System.out.println("Enter the number");
                n=new Scanner(System.in).nextInt();
               l.create(n);
               break;
         case 2:System.out.println("Enter the number");
         n=new Scanner(System.in).nextInt();
        l.del(n);
        break;
        case 3:
       l.display();
       break;
       case 4:l.checkempty();
       break;
       case 5:
    System.out.println(l.getSize());
    break;
       case 6:System.exit(0);
       default:System.out.println("Wrong input");  
    }
}
}
}
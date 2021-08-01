import java.util.*;
class Node{

public int data;
public Node next,prev;
public Node(int d){
data=d;
next=null;
prev=null;
}
}
class List{

public Node first,last;
List(){
first=null;
last=null;
}
void create(int n){
if(first==null){
Node temp=new Node(n);
first=temp;
last=first;
}
else{
Node temp=new Node(n);
last.next=temp;
temp.prev=last;
last=temp;
}
}
void del(int n){
if(first.data==n){
Node t=first;
first=first.next;
first.prev=null;
t=null;
}
else{
Node temp=first;
while(temp.next!=null&&temp.next.data!=n){
temp=temp.next;
}
if(temp.next==null){
System.out.println("not found");
}
else{
Node t=temp.next;
temp.next=temp.next.next;
if(t.next!=null){
t.next.prev=temp;
}
else{
last=temp;
}
t=null;
}
}
}
void display(){
Node temp;
for(temp=first;temp!=null;temp=temp.next){
System.out.println(temp.data+" ");
}
}
}
class Main{
public static void main(String args[]){
List l=new List();
l.create(2);
l.create(3);
l.create(4);
l.display();
l.del(3);
l.display();
}
}


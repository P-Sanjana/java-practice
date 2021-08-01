class Llist{
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
        }
    }
    public  void print(){
        Node n=head;
        while(n!=null){
            System.out.println(n.data);
            n=n.next;
        }
    }
    public static void main(String args[]){
        Llist l=new Llist();
        l.head=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);
        l.head.next=second;
        second.next=third;
        l.print();
       
    }
}
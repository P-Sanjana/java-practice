import java.util.*;
class Node{
    int key;
    Node left,right;
    Node(int key){
        this.key=key;
        this.left=null;
        this.right=null;
    }
}
class Tree{
    static Node root;
    static Node temp=root;
static void inorder(Node root){
    if(root==null)
    return;
    inorder(root.left);
    System.out.print(root.key+" ");
    inorder(root.right);
}
static void insert(Node root,int key){
    if(root==null)
    return;
    Queue<Node>q=new LinkedList<>();
    q.add(root);
    while(!q.isEmpty()){
        Node node=q.remove();
        if(node.left==null){
            node.left=new Node(key);
            break;
        }
        else
        q.add(node.left);
        if(node.right==null){
            node.right=new Node(key);
            break;
        }
        else
        q.add(node.right);
    }
}
static Node search(Node root,int key){
    if(root==null)
    return null;
    Queue<Node>q=new LinkedList<>();
    q.add(root);
    Node node=null;
    while(!q.isEmpty()){
        node=q.remove();
        if(node.key==key){
            return node;
        }
        if(node.left!=null)
        q.add(node.left);
        if(node.right!=null)
        q.add(node.right);
    }
    return null;
}
static void delete(Node root,int key){
    Node keyNode=null,node2=null;
    keyNode=search(root,key);
    Queue<Node>q1=new LinkedList<>();
    q1.add(root);
    while(!q1.isEmpty()){
        node2=q1.remove();
        if(node2.right!=null)
        q1.add(node2.right);
        else{
            if(node2.left!=null)
            q1.add(node2.left);
        }
    }
    if(keyNode!=null){
    keyNode.key=node2.key;
    Queue<Node>q=new LinkedList<>();
    q.add(root);
    while(!q.isEmpty()){
        Node node=q.remove();
        if(node==node2){
            node=null;
            break;
        }
        if(node.right!=null){
            if(node.right==node2){
                node.right=null;
                break;
            }
            else
            q.add(node.right);
        }
        if(node.left!=null){
            if(node.left==node2){
                node.left=null;
                break;
            }
            else
            q.add(node.left);
        }
    }
    }
}
static String s[]=new String[10];
static void root(String key){
    s[0]=key;
}
static void setLeft(String key,int root){
    if(s[root]==null)
    System.out.println("Cannot set child at left,no parent found");
    else
    s[2*root+1]=key;
}
static void setRight(String key,int root){
    if(s[root]==null)
    System.out.println("Cannot set child at right,no parent found");
    else
    s[2*root+2]=key;
}
static void printArray(){
    for(int i=0;i<s.length;i++){
        if(s[i]==null)
        System.out.print("-"+" ");
        else
        System.out.print(s[i]+" ");
    }
}
static void buildTreeFromParentArray(int parents[],int n){
    Node created[]=new Node[n];
    for(int i=0;i<n;i++)
        buildTreeFromParentArray(parents,i,created);
}
static void buildTreeFromParentArray(int parents[],int i,Node created[]){
    if(created[i]!=null)
    return;
    created[i]=new Node(i);
    if(parents[i]==-1){
        root=new Node(i);
        return;
    }
    if(created[parents[i]]==null)
    buildTreeFromParentArray(parents,parents[i],created);
    Node parent=created[parents[i]];
    if(parent.left==null)
    parent.left=created[i];
    else
    parent.right=created[i];
}
static boolean continuousTree(Node root){
    if(root==null)
    return true;
    if(root.left!=null){
        if(Math.abs(root.key-root.left.key)==1)
            return continuousTree(root.left);
        else
            return false;
    }
    if(root.right!=null){
        if(Math.abs(root.key-root.right.key)==1)
        return continuousTree(root.right);
        else
        return false;
    }
    return true;
}
static int distBetweenKeys(Node root,int a,int b){
    Node lca=LowestCommonAncestor(root,a,b);
    return findLevel(lca,a,0)+findLevel(lca,b,0);
}
static Node LowestCommonAncestor(Node root,int a,int b){
    if(root==null)
    return null;
    if(root.key==a || root.key==b)
    return root;
    Node temp_left=LowestCommonAncestor(root.left,a,b);
    Node temp_right=LowestCommonAncestor(root.right,a,b);
    if(temp_left!=null && temp_right!=null)
    return root;
    if(temp_left!=null && temp_right==null)
    return LowestCommonAncestor(root.left,a,b);
    return LowestCommonAncestor(root.right,a,b);
}
static int findLevel(Node root,int key,int level){
    if(root==null)
    return -1;
    if(root.key==key)
    return level;
    int left_level=findLevel(root.left,key,level+1);
    if(left_level==-1)
    return findLevel(root.right,key,level+1);
    return left_level;
}
static void zigzagTraversal(Node root){
    if(root==null)
    return;
    Boolean f=false;
    Stack<Node>curr=new Stack<>();
    Stack<Node>next=new Stack<>();
    curr.add(root);
    System.out.print(root.key+" ");
    f=!f;
    while(!curr.isEmpty()){
        if(f==true){
        Node temp=curr.pop();
        if(temp.right!=null){
        next.add(temp.right);
        System.out.print(temp.right.key+" ");
        }
        if(temp.left!=null){
        next.add(temp.left);
        System.out.print(temp.left.key+" ");
        }
        }
        else{
        Node temp=curr.pop();
        if(temp.left!=null){
        next.add(temp.left);
        System.out.print(temp.left.key+" ");
        }
        if(temp.right!=null){
        next.add(temp.right);
        System.out.print(temp.right.key+" ");
        }
        }
        if(curr.isEmpty()){
        f=!f;
        Stack<Node>s2=new Stack<>();
        s2=curr;
        curr=next;
        next=s2;
        }
        
    }
}
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        root = new Node(1); 
        root.left = new Node(2); 
        root.right = new Node(3); 
        root.left.left = new Node(4); 
        root.left.right = new Node(5); 
        root.right.left = new Node(6); 
        root.right.right = new Node(7);
        root.left.left.left=new Node(8);
        root.left.left.right=new Node(9);
        root.left.right.left=new Node(10);
        root.left.right.right=new Node(11);
        root.right.left.left=new Node(12);
        root.right.left.right=new Node(13);
        root.right.right.left=new Node(14);
        root.right.right.right=new Node(15); 
        /*inorder(root);
        System.out.println("Enter key to insert");
        int key=sc.nextInt();
        insert(root,key);
        System.out.println();
        inorder(root);
        System.out.println();
        System.out.println("Enter key to delete");
        int key1=sc.nextInt();
        if(root==null){
        System.out.println("Root is null");
        }
        else if(root.left==null && root.right==null){
        if(root.key==key1)
            root=null;
        }
        else
       delete(root,key1);
        inorder(root);
        root("A");          //Constructing array representation of binary tree
        setRight("C",0);
        setLeft("D",1);
        setRight("E",1);
        setLeft("F",2);
        printArray();
        System.out.println("Enter the size of the parent array to build binary tree");
        int n=sc.nextInt();
        int rootValue=0;
        int parents[]=new int[n];
        for(int i=0;i<n;i++){
        parents[i]=sc.nextInt();
        }
        buildTreeFromParentArray(parents,n);
        inorder(root);
        if(continuousTree(root))
        System.out.println("Continuous Tree");
        else
        System.out.println("Not a Continuous Tree");
        System.out.println("Enter two key values to find difference between them");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(distBetweenKeys(root,a,b));
        zigzagTraversal(root);*/
    }
}
import java.util.*;
import java.io.*;
class Trie{
static class TrieNode{
    Map<Character,TrieNode>m;
    boolean end;
   // String meaning;
   // int dupli;
    TrieNode(){
        m=new HashMap<>();
        end=false;
       // meaning="";
       // dupli=0;
    }
};
static TrieNode root;
static int min=Integer.MAX_VALUE,wordcount;
static String s1="";
public static void insert(TrieNode root,String s,/*String meaning,*/int index){ //remove comment for meaning to insert with meaning
    if(index==s.length()){
        root.end=true;
        //root.meaning=meaning;
        return;
    }
    TrieNode node=root.m.get(s.charAt(index));
    if(node==null){
         node=new TrieNode();
        root.m.put(s.charAt(index),node);
        
    }
  
    insert(node,s,/*meaning,*/index+1);
}
public static void insertForUsernames(TrieNode root,String s,/*String meaning,*/int flag,int index){ //remove comment for meaning to insert with meaning
    if(index==s.length()){
        if(flag==0){
            for(int i=0;i<Integer.MAX_VALUE;i++){
                if(root.m.get(String.valueOf(i).charAt(0))==null){
                   TrieNode node=new TrieNode();
                   root.m.put(String.valueOf(i).charAt(0),node);
                   node.end=true;
                   break;
                }
            }
        }
        else
        root.end=true;
        //root.meaning=meaning;
        return;
    }
    TrieNode node=root.m.get(s.charAt(index));
    if(node==null){
         node=new TrieNode();
         flag=1;
        root.m.put(s.charAt(index),node);    
    }
  
    insertForUsernames(node,s,/*meaning,*/flag,index+1);
}
/*public static void insertWithDuplicates(TrieNode root,String s,String meaning,int index){
    if(index==s.length()){
        root.end=true;
      //  root.meaning=meaning;
        root.dupli+=1;
        return;
    }
    TrieNode node=root.m.get(s.charAt(index));
    if(node==null){
        node=new TrieNode();
        root.m.put(s.charAt(index),node);
    }
    insertWithDuplicates(node,s,meaning,index+1);
}*/
public static boolean searchPrefix(TrieNode root,String s,int index){
    if(index==s.length()){
        return true;
    }
    TrieNode node=root.m.get(s.charAt(index));
    if(node==null)
        return false;
  
    return search(node,s,index+1);
}
public static boolean search(TrieNode root,String s,int index){
    if(index==s.length()){
        return root.end;
    }
    TrieNode node=root.m.get(s.charAt(index));
    if(node==null)
        return false;
  
    return search(node,s,index+1);
}
public static boolean delete(TrieNode root,String s,int index){
    if(index==s.length()){
        if(root.end!=true)
        return false;
        
            root.end=false;
           // root.meaning="";
        return root.m.size()==0;
    }
    TrieNode node=root.m.get(s.charAt(index));
   // System.out.println(node.m);
    if(node==null){
        return false;
    }
   boolean dele=delete(node,s,index+1) && !node.end;
   if(dele){
   root.m.remove(s.charAt(index));
   return root.m.size()==0;
   }
   return false;
}
public static void print(TrieNode root,String s){
    if(root==null)
    return;
    for(Map.Entry<Character,TrieNode>h:root.m.entrySet()){
        s+=h.getKey();
        int l=s.length()-1;
        if(h.getValue().end==true){
            System.out.println(s);
           // System.out.println(h.getValue().meaning);
        }
        print(h.getValue(),s);
        if(l==0)
        s="";
        if(l>0)
        s=s.substring(0,l);
    }
}
public static void wordWithPrefix(TrieNode root,String s){
    if(search(root,s,0)!=true){
        System.out.println("No words found with given prefix");
    return;
    }
    else{
        for(int i=0;i<s.length();i++){
            TrieNode node=root.m.get(s.charAt(i));
            root=node;
        }
        print(root,""+s);
    }
}
/*public static void wordFindMeaning(TrieNode root,String s,int index){
    if(index==s.length()){
        if(root.end!=true)
        System.out.println("No word Found");
        else
        System.out.println(root.meaning);
        return;
    }
    TrieNode node=root.m.get(s.charAt(index));
    if(node==null)
    return;
    wordFindMeaning(node,s,index+1);
}*/
public static void possibleCombinations(TrieNode root,String s,int n,String r){
    for(int i=1;i<=n;i++){
        String p=s.substring(0,i);    
        if(search(root,p,0)){
            if(i==n){
                r+=p;
                System.out.print(" "+r+"\n");
            }
            possibleCombinations(root,s.substring(i),n-i,r+p+" ");
        }
    }
}
public static void printReverse(TrieNode root,char a[],String s){
    if(root.end==true){
        System.out.println(s);
        return;
    }
    for(int i=25;i>=0;i--){
        TrieNode node=root.m.get(a[i]);
        if(node!=null){
            printReverse(node,a,s+a[i]);
        }
    }
}
public static void joints(TrieNode root){
    if(root==null)
    return;
    for(Map.Entry<Character,TrieNode>h:root.m.entrySet()){
        char c=h.getKey();
        TrieNode node=root.m.get(c);
        
        joints(node);
        if(node!=null){
            if(node.m.size()>1)
            System.out.println(c);
        }
    }
}
public static boolean sort(TrieNode root,String s){
    if(root.end==true){
        //for(int i=0;i<root.dupli;i++)
    System.out.println(s);
    }
    ArrayList<Character> sortedKeys=new ArrayList<>(root.m.keySet()); 
     Collections.sort(sortedKeys);  
    for(char c:sortedKeys){
        TrieNode node=root.m.get(c);
        if(node==null)
        return false;
        sort(node,s+c);
    }
    return true;
}
public static void MinimumBreak(TrieNode root,String s,String s1,int index,int c){
    if(s1.length()==0){
        min=Math.min(min,c);
        return;
    }
    for(int i=0;i<s1.length();i++){
    if(search(root,s1.substring(0,i+1),0))
    MinimumBreak(root,s,s1.substring(i+1),i+1,c+1);
    }
}
public static boolean wordBreak(TrieNode root,String s,int index){
    if(index==s.length()){
        return true;
    }
    for(int i=index;i<s.length();i++){
        if(search(root,s.substring(index,i+1),0))
        return wordBreak(root,s,i+1);
    }
    return false;
}
public static void longestPrefix(TrieNode root,String s,int index){
    if(index==s.length()){
        return ;
    }
    for(int i=index;i<s.length();i++){
        if(search(root,s.substring(index,i+1),0)){
            if(s1.length()<s.substring(index,i+1).length())
            s1=s.substring(index,i+1);
        longestPrefix(root,s,i+1);
        }
    }
   
}
public static void patternPosition(TrieNode root,String s){
    int k=0,flag=0;
    char c='0';
    while(root!=null){
    for(Map.Entry<Character,TrieNode>h:root.m.entrySet()){
        c=h.getKey();
        if(h.getKey()==s.charAt(0)){
            TrieNode node=h.getValue();
            int f=0;
            for(int i=1;i<s.length();i++){
                if(node.m.get(s.charAt(i))!=null)
                node=node.m.get(s.charAt(i));
                else{
                    f=1;
                    break;
                }
            }
            if(f==0){
                flag=1;
            System.out.println(k);
            }
        }
    }
    k++;
    root=root.m.get(c);
    }
    if(flag==0)
    System.out.println("Not found");
}
public static void boggleWords(TrieNode root,char boggle[][],int row,int col){
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            if(root.m.get(boggle[i][j])!=null){
               // System.out.println(boggle[i][j]+"fjwkr");
                int v[][]=new int[row][col];
            boggleDFS(root.m.get(boggle[i][j]),boggle,i,j,v,row,col,""+boggle[i][j]);
        }
        }
    }
}
public static void boggleDFS(TrieNode root,char boggle[][],int i,int j,int v[][],int row,int col,String s){
    //System.out.println(s);
    if(root==null){
    return;
    }
    if(root.end==true)
    System.out.println(s);
    v[i][j]=1;
    if(i-1>=0 && v[i-1][j]==0){
    boggleDFS(root.m.get(boggle[i-1][j]),boggle,i-1,j,v,row,col,s+boggle[i-1][j]);
    }
    if(j+1<col && v[i][j+1]==0){
    boggleDFS(root.m.get(boggle[i][j+1]),boggle,i,j+1,v,row,col,s+boggle[i][j+1]);
    }
    if(i+1<row && v[i+1][j]==0){
    boggleDFS(root.m.get(boggle[i+1][j]),boggle,i+1,j,v,row,col,s+boggle[i+1][j]);
    }
    if(j-1>=0 && v[i][j-1]==0){
    boggleDFS(root.m.get(boggle[i][j-1]),boggle,i,j-1,v,row,col,s+boggle[i][j-1]);
    }
    if(i-1>=0 && j-1>=0 && v[i-1][j-1]==0){
    boggleDFS(root.m.get(boggle[i-1][j-1]),boggle,i-1,j-1,v,row,col,s+boggle[i-1][j-1]);
    }
    if(i-1>=0 && j+1<col && v[i-1][j+1]==0){
    boggleDFS(root.m.get(boggle[i-1][j+1]),boggle,i-1,j+1,v,row,col,s+boggle[i-1][j+1]);
    }
    if(i+1<row && j+1<col && v[i+1][j+1]==0){
    boggleDFS(root.m.get(boggle[i+1][j+1]),boggle,i+1,j+1,v,row,col,s+boggle[i+1][j+1]);
    }
    if(i+1<row && j-1>=0 && v[i+1][j-1]==0){
    boggleDFS(root.m.get(boggle[i+1][j-1]),boggle,i+1,j-1,v,row,col,s+boggle[i+1][j-1]);
    }
    v[i][j]=0;
}
public static void printBottomUp(TrieNode root,char a[]){
    if(root==null)
    return;
    char c='0';
    for(int i=0;i<26;i++){
        if(root.m.get(a[i])!=null){
            c=a[i];
            printBottomUp(root.m.get(a[i]),a);
        System.out.print(c+" ");
        }
    }
    
}
public static int longestCommonPrefix(TrieNode root,int c,String s){
    if(root.m.size()>1){
    System.out.println(s);
    return c;
    }
    for(Map.Entry<Character,TrieNode>h:root.m.entrySet()){
        return longestCommonPrefix(root.m.get(h.getKey()),c+1,s+h.getKey());
    }
    return c;
}
public static void totalWords(TrieNode root){
    if(root.end==true){
        wordcount++;
    }
    for(Map.Entry<Character,TrieNode>h:root.m.entrySet()){
        totalWords(root.m.get(h.getKey()));
    }
}
public static int DistinctSubstringCount(TrieNode root,ArrayList<String>arr,int count,int a[]){
    if(root==null)
    return 0;
    for(Map.Entry<Character,TrieNode>h:root.m.entrySet()){
        for(int i=0;i<arr.size();i++)
        arr.set(i,arr.get(i)+(h.getKey().toString()));
        if(a[h.getKey()-'a']==0){
        arr.add(h.getKey().toString());
            a[h.getKey()-'a']++;
        }
        return DistinctSubstringCount(h.getValue(),arr,count+arr.size(),a);
    }
    return count;
}
    public static void main(String[] args) throws IOException {
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(sc.readLine());
         root=new TrieNode();
        for(int i=0;i<n;i++){
            /*String s[]=sc.readLine().split(" ");
            insert(root,s[0],s[1],0);*/ //remove comment to insert with meaning
            String s=sc.readLine();
            //insert(root,s,0);
            insertForUsernames(root,s,0,0);
        //insertWithDuplicates(root,s[0],s[1],0);
        }
    /*System.out.println("Enter string to search");
        String r=sc.readLine();
        System.out.println(search(root,r,0));
        System.out.println("Enter string to delete");
        String r1=sc.readLine();
        delete(root,r1,0);
        System.out.println("Enter prefix to search");
        String r2=sc.readLine();
        System.out.println(searchPrefix(root,r2,0));
        print(root,"");
       System.out.println("Enter prefix to find all the words start with prefix");
        String r3=sc.readLine();
        wordWithPrefix(root,r3);
        System.out.println("Enter word to find meaning");
        String r4=sc.readLine();
        wordFindMeaning(root,r4,0);
        System.out.println("Enter word to find all the possible combinations");
        String r5=sc.readLine();
        possibleCombinations(root,r5,r5.length(),"");
        char a[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        printReverse(root,a,"");
        joints(root);
        sort(root,"");//sorts the string (for duplicates string remove comments for dupli and insertWithDupliates method)
        System.out.println("Enter word to find minimum word break");
        String r6=sc.readLine();
        MinimumBreak(root,r6,r6,0,0);
        System.out.println(min-1);
        System.out.println("Enter word to find it is formed by given words");
        String r7=sc.readLine();
        if(wordBreak(root,r7,0))
        System.out.println("Yes");
        else
        System.out.println("No");
        System.out.println("Enter word to find the length of longest prefix");
        String r8=sc.readLine();
        longestPrefix(root,r8,0);
        System.out.println(s1);
        System.out.println("Enter word to find position of pattern");//commment insert method and reading input of string
        String r9[]=sc.readLine().split(" ");
        insert(root,r9[0],r9[1],0);
        System.out.println("Enter pattern to search in above word");
        String r10=sc.readLine();
        patternPosition(root,r10);
        System.out.println("Enter rows,cloumns and grid(boggle)");
        int row=Integer.parseInt(sc.readLine());
        int col=Integer.parseInt(sc.readLine());
        char boggle[][]=new char[row][col];
        for(int i=0;i<row;i++){
                String r11[]=sc.readLine().split(" ");
                for(int k=0;k<col;k++)
                boggle[i][k]=r11[k].charAt(0);
        }
        boggleWords(root,boggle,row,col);
        char a[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        printBottomUp(root,a);
        System.out.println(longestCommonPrefix(root,0,""));
        totalWords(root);
        System.out.println(wordcount);
       System.out.println(DistinctSubstringCount(root,new ArrayList<String>(),0,new int[26])+1);*/
       print(root,"");
    }
}
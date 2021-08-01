import java.util.*;

class TrieNode{
	TrieNode parent=null;
	int occurence=0;
	TrieNode children[]=new TrieNode[26];
}

class TrieTree{
	public void insert(TrieNode root,String word){
		TrieNode current = root;
		for(int i=0;i<word.length();i++)
		{
			if(current.children[word.charAt(i) - 'a']==null){
				current.children[word.charAt(i)- 'a'] = new TrieNode();
				current.children[word.charAt(i)- 'a'].parent=current;
				
			}
			current=current.children[word.charAt(i)- 'a'];
		}
		++current.occurence;
	}
	
	public void insertWords(TrieNode root,String[] words){
			for (String word : words) {
				insert(root,word);
			}			
		}
	
	public void printTrieTree(TrieNode root, Stack<Character> word)
	{
		if(root.occurence>0){
			int length=0;
			for (char ch:word) {
				System.out.print(ch);
				length++;
			}
			//word.forEach(ch -> System.out.print(ch));
			System.out.print(" - "+root.occurence);
			System.out.println(" - "+length);
		}
		for (int i = 0; i < 26; i++) {
			if(root.children[i] !=null)
			{
				word.push((char)('a'+ i));
				printTrieTree(root.children[i], word);
				word.pop();
			}
		}
	}
	
}


class TrieDemo {
	public static void main(String[] args) {
		String a[]={"a", "banana", "app", "appl", "ap", "apply", "apple"};
		TrieTree t=new TrieTree();
		TrieNode root=new TrieNode();
		t.insertWords(root, a);
		t.printTrieTree(root,new Stack<Character>());
		//System.out.println(t.dfs(root, a) );
	}
}
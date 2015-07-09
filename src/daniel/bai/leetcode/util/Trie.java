package daniel.bai.leetcode.util;

public class Trie {
	public TrieNode root;
	public Trie(){
		root = new TrieNode();
	}
	
	public void insert(String word){
		TrieNode node = root;
		for(char c : word.toCharArray()){
			if(node.children[c - 97] == null){
				node.children[c - 97] = new TrieNode();
			}
			node = node.children[c-97];
		}
		node.val = word;
	}
	
	public boolean search(String word){
		TrieNode node = root;
		for(char c : word.toCharArray()){
			if(node.children[c-97] == null)
				return false;
			node = node.children[c-97];
		}
		return node.val.equals(word);
	}
	
	public boolean startsWith(String prefix){
		TrieNode node = root;
		for(char c : prefix.toCharArray()){
			if(node.children[c-97] == null)
				return false;
			node = node.children[c-97];
		}
		return true;
	}
}

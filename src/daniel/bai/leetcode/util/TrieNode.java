package daniel.bai.leetcode.util;

public class TrieNode {
	public TrieNode[] children;
	public String val;
	
	TrieNode(){
		this.children = new TrieNode[26];
		this.val = "";
	}
}

package daniel.bai.leetcode;

public class ImplementTrie {
	/*
	 *  LeetCode No. 208
	 *  Implement Trie (Prefix Trie)
	 *  @author Daniel Bai
	 */
	
    private TrieNode root;

    public ImplementTrie() {
        root = new TrieNode(' ');        
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        if(word.length() < 1){
        	return;
        }
        insert(word.toCharArray(), 0, root);
    }
    
    public void insert(char[] word, int current, TrieNode root){
    	if(current > word.length){
    		return;
    	}
    	int c;
    	if(current == word.length){
    		c = 26;
    		if(root.suffix[26] == null)
    			root.suffix[26] = new TrieNode((char)47);
    	} else {
    		c = word[current]-97;
    		if(root.suffix[c] == null)
    			root.suffix[c] = new TrieNode(word[current]);
    	}
    	insert(word, current + 1, root.suffix[c]);
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        if(word.length() < 1)
        	return true;
        return search(word.toCharArray(), 0, root);
    }
    
    public boolean search(char[] word, int current, TrieNode root){
    	if(current > word.length)
    		return true;
    	int c;
    	if(current == word.length){
    		c = 26;
    	} else {
    		c = word[current] - 97;
    	}
    	if(root.suffix[c] == null)
    		return false;
    	return search(word, current + 1, root.suffix[c]);
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        if(prefix.length() < 1)
        	return true;
        return startsWith(prefix.toCharArray(), 0, root);
    }
    
    public boolean startsWith(char[] prefix, int current, TrieNode root){
    	if(current >= prefix.length)
    		return true;
    	int c = prefix[current] - 97;
    	if(root.suffix[c] == null)
    		return false;
    	return startsWith(prefix, current+1, root.suffix[c]);
    }
}

class TrieNode{
	char val;
	TrieNode[] suffix;
	TrieNode(char c){
		this.val = c;
		suffix = new TrieNode[27];
	}
}

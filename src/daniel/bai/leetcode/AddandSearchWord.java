package daniel.bai.leetcode;

import java.util.HashMap;
import java.util.Map;

public class AddandSearchWord {
	/*
	 * LeetCode No. 211
	 * Add and Search Word - Data Structure Design
	 * @author Daniel Bai
	 */
	
	Node root;

	// Adds a word into the data structure.
	public void addWord(String word) {
		if (word.length() == 0)
			return;
		addWord(word.toCharArray(), 0, root);
	}

	public void addWord(char[] word, int current, Node start) {
		if (current > word.length) {
			return;
		}
        char c;
        if(current == word.length){
            c = '/';
        } else {
            c = word[current];
        }
		if (!start.suffix.containsKey(c)) {

			Node node = new Node(c);
			start.suffix.put(c, node);

		}
		addWord(word, current + 1, start.suffix.get(c));
	}

	// Returns if the word is in the data structure. A word could
	// contain the dot character '.' to represent any one letter.
	public boolean search(String word) {
		if(word.length() < 1)
			return true;
		return search(word.toCharArray(), 0, root);
	}
	
	public boolean search(char[] word, int current, Node start){
		if(current > word.length){
			return true;
		}
		if(current == word.length){
		    if(start.suffix.containsKey('/'))
		        return true;
		    return false;
		}
		if(word[current] == '.'){
			boolean result = false;
			for(int i = 97; i < 123; i ++){
				if(!start.suffix.containsKey((char)i)){
					continue;
				} else {
					result = search(word, current+1, start.suffix.get((char)i));
					if(result == true)
						return result;
				}
			}
			return result;
		} else if(start.suffix.containsKey(word[current])){
			return search(word, current+1, start.suffix.get(word[current]));
		} else {
			return false;
		}
	}

	public AddandSearchWord() {
		root = new Node(' ');
	}

	class Node {
		char val;
		Map<Character, Node> suffix;

		Node(char c) {
			this.val = c;
			suffix = new HashMap<Character, Node>();
		}
	}
}

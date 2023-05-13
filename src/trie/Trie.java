package trie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Trie {

    static class TrieNode {
        Map<Character, TrieNode> children = new HashMap<>();
    }

    TrieNode root = new TrieNode();
    char endSymbol = '*';

    public Trie(String str) {
        populateSuffixTrie(str);
    }

    public void populateSuffixTrie(String str) {
        for (int i = 0; i < str.length(); i++) {
            insertSubstringStartingAt(i, str);
        }
    }

    public void insertSubstringStartingAt(int index, String str) {
        TrieNode node = root;
        for (int i = index; i< str.length(); i++) {
            char letter = str.charAt(i);
            if (!node.children.containsKey(letter)) {
                TrieNode newNode = new TrieNode();
                node.children.put(letter, newNode);
            }
            node = node.children.get(letter);
        }
        node.children.put(endSymbol, null);

    }

//    public List<String> suggest(String str) {
//        List<String> list  = new ArrayList<>();
//        return suggestHelper(str, list)
//    }
//
//    private List<String> suggestHelper(String str, List<String> list) {
//        TrieNode node = root;
//
//        if (contains(str)) {
//            root.
//        }
//    }

    public boolean contains(String str) {
        TrieNode node = root;
        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            if (!node.children.containsKey(letter)) {
                return false;
            }
            node = node.children.get(letter);
        }
        return node.children.containsKey(endSymbol);
    }

    public static void main(String[] args) {

        Trie trie = new Trie("mannan");
        System.out.println(trie.contains("nan"));
    }
}

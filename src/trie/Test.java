package trie;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Test {

    static class TrieNode {

        Map<Character, TrieNode> children = new HashMap<>();

        char data;

        boolean isEnd = false;

        public TrieNode(char c) {
            this.data = c;
        }
    }

    static class Trie {

        TrieNode root = new TrieNode(' ');

        void insert(String word) {
            TrieNode node = root;
            for (char c: word.toCharArray()) {
                if (!node.children.containsKey(c))
                    node.children.put(c, new TrieNode(c));
                node = node.children.get(c);
            }

            node.isEnd = true;
        }

        List<String> autocomplete(String prefix) {
            List<String> res = new LinkedList<>();
            TrieNode node = root;

            for (char c: prefix.toCharArray()) {
                if (node.children.containsKey(c)) {
                    node = node.children.get(c);
                } else
                    return res;
            }
            helper(node, res, prefix.substring(0, prefix.length() - 1));
            return res;
        }

        private void helper(TrieNode node, List<String> res, String prefix) {
            if (node.isEnd)
                res.add(prefix + node.data);
            for (char c: node.children.keySet()) {
                helper(node.children.get(c), res, prefix + node.data);
            }
        }
    }

    public static void main(String[] args) {
        Trie trie = new Trie();

        trie.insert("Hiii");
        trie.insert("Hi");
        trie.insert("Heyy");
        trie.insert("Hoooy");

        System.out.println(trie.autocomplete("Hi"));
    }
}

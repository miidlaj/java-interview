package trie;

import trie.Test;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

// A class to store a Triee node
class Triee
{
    private char data;
    private boolean isLeaf = false;
    private Map<Character, Triee> children;

    // Constructor
    Triee(char c)
    {
        data = c;
        isLeaf = false;
        children = new HashMap<>();
    }

    // Iterative function to insert a string into a Triee
    public void insert(String key)
    {
        System.out.println("Inserting \"" + key + "\"");

        // start from the root node
        Triee curr = this;

        // do for each character of the key
        for (char c: key.toCharArray())
        {
            // create a new node if the path doesn't exist
            curr.children.putIfAbsent(c, new Triee(c));

            // go to the next node
            curr = curr.children.get(c);
        }

        // mark the current node as a leaf
        curr.isLeaf = true;
    }

    // Iterative function to search a key in a Triee. It returns true
    // if the key is found in the Triee; otherwise, it returns false
    public boolean search(String key)
    {
        System.out.print("Searching \"" + key + "\" : ");

        Triee curr = this;

        // do for each character of the key
        for (char c: key.toCharArray())
        {
            // go to the next node
            curr = curr.children.get(c);

            // if the string is invalid (reached end of a path in the Triee)
            if (curr == null) {
                return false;
            }
        }

        // return true if the current node is a leaf node and the
        // end of the string is reached
        return curr.isLeaf;
    }

    public List<String> autocomplete(String prefix) {
        List<String> res = new LinkedList<>();
        Triee curr = this;

        for (char c:  prefix.toCharArray()) {
            if (curr.children.containsKey(c)){
                curr = curr.children.get(c);
            } else
                return res;
        }
        helper(curr, res, prefix.substring(0, prefix.length() - 1));
        return res;
    }

    private void helper(Triee curr, List<String> res, String prefix) {
        if (curr.isLeaf)
            res.add(prefix + curr.data);
        for (char c: curr.children.keySet()) {
            helper(curr.children.get(c), res, prefix + curr.data);
        }
    }
}

class Inserting
{
    public static void main (String[] args)
    {
        // construct a new Triee node
        Triee head = new Triee(' ');

        head.insert("techie");
        head.insert("techi");
        head.insert("tech");

        System.out.println(head.search("tech"));            // true

        head.insert("terminal");
        head.insert("terminator");
        head.insert("timberland");


        System.out.println(head.autocomplete("tim"));
    }
}
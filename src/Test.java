import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.Hashtable;

public class Test {
    public static void find(String str) {

        HashMap<Character, Integer> map = new HashMap();
        for (char c: str.toCharArray()) {
            int count = 1;
            if (!map.containsKey(c))
                map.put(c, count);
            else {
                int co = map.get(c++);
                map.put(c, co);
            }
        }

        map.forEach((character, count) -> {
            System.out.print(character + "=" + count + " ");
        });
    }

    public static void main(String[] args) {

      String str = "abcdABCDabcd";

      find(str);


    }


    // Semefer

}


/**
 *
 *
 * JOIN table1
 * IN table
 */
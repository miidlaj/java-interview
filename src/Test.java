import java.util.HashMap;

public class Test {

    // a=2, A=1, b=2, B=1, c=2, C=1, d=2, D=1

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
package java8.lambda;

interface Addable {

    int addition(int a, int b);
}

class AddableImpl implements Addable{

    @Override
    public int addition(int a, int b) {
        return a + b;
    }
}
public class LambdaParameters {

    public static void main(String[] args) {

        /**
         * Traditional way of implementing
         */
        Addable addable = new AddableImpl();
        System.out.println(addable.addition(5, 6));

        /**
         * using lambda
         * We don't need to make a class, implement method, instantiate...
         */
        Addable addable1 = (a, b) ->  a + b;
        System.out.println(addable1.addition(5, 9));

        /**
         * Also we can write multiple line of codes using curly braces and return statement
         */
        Addable addable2 = (a, b) ->  {

            int result = a + b;
            System.out.println(result);
            return result;
        };
        System.out.println(addable1.addition(5, 15));
    }


}

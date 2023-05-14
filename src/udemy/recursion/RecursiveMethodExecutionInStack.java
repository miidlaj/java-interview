package udemy.recursion;

public class RecursiveMethodExecutionInStack {

    /**
     * @param n
     * Its recursive method that accepts the parameter n
     * The base condition to avoid infinite loop is checking whether the n is less than 1
     * If condition is satisfied method will get returned
     * And using the stack memory it's completes the remaining program with particular parameters
     *
     * Stack :- [ recursiveMethod(10) - ]
     * Stack :- [ recursiveMethod(10) - recursiveMethod(9) - ]
     * Stack :- [ recursiveMethod(10) - recursiveMethod(9) - recursiveMethod(8) - ... - recursiveMethod(1) ]
     *
     * When the n become 0 the base condition will be satisfied, and it will return;
     * After that it will pop the methods stored in stack memory
     *
     * Stack :- [ recursiveMethod(10) - recursiveMethod(9) - recursiveMethod(8) - ... - recursiveMethod(2) ] => recursiveMethod(1) completed the remaining execution
     * Stack :- [ recursiveMethod(10) - recursiveMethod(9) - recursiveMethod(8) - ... - recursiveMethod(3) ] => recursiveMethod(2)
     * Stack :- [ recursiveMethod(10) - ] => recursiveMethod(9)
     * Stack :- [ ] => recursiveMethod(10)
     * So the execution of this recursive calls complete here
     *
     */
    static void recursiveMethod(int n) {

        if (n < 1)
            return;

        recursiveMethod(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {

        recursiveMethod(10);
    }
}

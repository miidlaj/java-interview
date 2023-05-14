package udemy.recursion;

/**
 *
 */
public class MethodExecutionInStackMemory {

    /**
     * When we call firstMethod this method will start execution
     * This is calling the second method before printing
     * So the first method will be store in a stack memory for coming back and execute remaining
     *
     * Stack Memory -: [firstMethod() - ]
     */
    static void firstMethod() {
        secondMethod();
        System.out.println("First Method");
    }

    /**
     * Similarly the second method will be stored in stack above the firstMethod
     * In stack the last inserted one will be the first one to get out of that memory
     * That's why we place second above first because secondMethod(); should be called before firstMethod();
     *
     * Stack Memory -: [firstMethod() - secondMethod() - ]
     */
    static void secondMethod() {
        thirdMethod();
        System.out.println("Second Method");
    }

    /**
     * Similarly thirdMethod(); will be pushed to stack
     *
     * Stack Memory -: [firstMethod() - secondMethod() - thirdMethod() - ]
     */
    static void thirdMethod() {
        fourthMethod();
        System.out.println("Third Method");
    }

    /**
     * In this we are not calling any other methods
     * So it will execute completely and will call the partially completed method that we stored in stack before
     *
     * Stack Memory -: [firstMethod() - secondMethod() - thirdMethod() - ]
     *
     * firstly it pop out the thirdMethod() then secondMethod() then firstMethod().
     * Stack Memory -: [firstMethod() - secondMethod() - ] => thirdMethod()
     * Stack Memory -: [firstMethod() -  ] => secondMethod()
     * Stack Memory -: [] => firstMethod
     *
     * That's why it use stack memory for storing this.
     * It uses the principle Last In First Out - LIFO
     *
     */
    static void fourthMethod() {
        System.out.println("Fourth Method");
    }


    public static void main(String[] args) {
        firstMethod();
    }
}

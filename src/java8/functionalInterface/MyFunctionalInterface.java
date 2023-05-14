package java8.functionalInterface;

/**
 * Functional Interface is an interface that only contain exact one abstract method
 * @FunctionalInterface annotation helps to identify this interface as Functional Interface.
 * If we know this will be a Functional Interface then it's not needed.
 * It helps to give compile time error if we added another abstract method.
 */
@FunctionalInterface
public interface MyFunctionalInterface {

    void print(String msg);


    /**
     * Can hold any number of default and static methods
     */
    default void defaultMethod() {
        System.out.println("default method");
    }

    static void staticMethod() {
        System.out.println("static method");
    }
}

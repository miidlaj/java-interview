package java8.functionalInterface;

@FunctionalInterface
interface Shape {

    void draw();

}

/**
 * Traditional way of im
 */
class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("rectangle draw method");
    }

}
public class LambdaExample {

    public static void main(String[] args) {

        /**
         * It's a traditional way implementing functional interface.
         * By implementing into another class and instantiating an object for the class and calling the method.
         */
        Rectangle rectangle = new Rectangle();
        rectangle.draw();

        /**
         * Also we can use lambda expression for giving particular method implementation
         * Here we implemented the draw method using lambda and got a reference.
         * With that we can call the draw method.
         */
        Shape circle = () -> System.out.println("circle draw method");
        circle.draw();
    }

}

package java8.lambda;

/**
 * It's functional interface that only contain exact one abstract method.
 */
interface Shape {
    void draw();
}

/**
 * Traditional way of implementation of Shape Interface
 */
class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle class: draw() method");
    }
}

class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square class: draw() method");
    }
}

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle class: draw() method");
    }
}

public class LambdaExpression {

    public static void main(String[] args) {

        /**
         * We implemented draw method using lambda expression without creating new class and implement there.
         */
        Shape triangle = () -> System.out.println("Triangle class: draw() method");
        triangle.draw();

        /**
         * Implementation of rectangle using lambda
         */
        Shape rectangle = () -> System.out.println("Rectangle class: draw() method");
        //rectangle.draw();

        /**
         * We can pass this lambda expression as parameter
         */
        print(rectangle);

        /**
         * Or we can directly pass the lambda expression without creating a reference
         */
        print(() -> System.out.println("Circle class: draw() method"));
    }


    private static void print(Shape shape) {
        shape.draw();
    }
}

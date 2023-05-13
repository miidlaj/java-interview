package java8;

public interface DefaultAndStaticInterface2 {

    void method2();

    default void log(String str){
        System.out.println("I2 logging::"+str);
    }
}

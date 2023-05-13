package java8;

public class DefaultAndStaticUsage implements DefaultAndStaticInterface, DefaultAndStaticInterface2{
    @Override
    public void method1(String str) {
        System.out.println(str);
    }

    @Override
    public void method2() {
        System.out.println("test");
    }

    //MyClass won't compile without having it's own log() implementation
    @Override
    public void log(String str){
        System.out.println("MyClass logging::"+str);
        DefaultAndStaticInterface.print("abc");
    }

    public static void main(String[] args) {

        DefaultAndStaticUsage obj = new DefaultAndStaticUsage();
        obj.log("Hi");
        obj.method1("n");
        obj.method2();
    }
}

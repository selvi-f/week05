package week05.Inheritance;

interface A {
    void methodA();
}

interface B {
    void methodB();
}

class MyClass implements A, B {
    public void methodA() {
        System.out.println("Method A");
    }

    public void methodB() {
        System.out.println("Method B");
    }
}

public class Main2 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.methodA(); //defined by Interface A
        obj.methodB(); //defined by Interface B
    }
}

//Multiple inheritance type

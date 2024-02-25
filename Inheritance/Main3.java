package week05.Inheritance;

interface A {
    void methodA();
}

class B {
    void methodB() {
        System.out.println("Method B");
    }
}

class C extends B implements A {
    public void methodA() {
        System.out.println("Method A");
    }
} //class C inheriting from both A and B

public class Main3 {
    public static void main(String[] args) {
        C obj = new C();
        obj.methodA(); 
        obj.methodB(); 
    }
}

//Hybrid inheritance type 



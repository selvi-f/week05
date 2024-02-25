package week05;

class A {
    static {System.out.println("In static init block of A");}
 
    public A() {System.out.println("In constructor A.");    }
 
    {System.out.println("In instance init block of A");}
 }
 
class B extends A {
    static {System.out.println("In static init block of B");    }
 
    public B() {System.out.println("In constructor B.");    }
 
    {System.out.println("In instance init block of B");    }
 }
 
public class Main2 {
    public static void main(String[] args) {
        B b = new B();
 
    }
}

//In static init block of A
//In static init block of B
//In instance init block of A
//In constructor A.
//In instance init block of B
//In constructor B.

//will be printed. The static init blocks of class A and class B are executed first, in the order of 
//inheritance hierarchy.Then init block of class A is executed, followed by the constructor of class A.
//Then, the instance init block of class B is executed, followed by the constructor of class B.

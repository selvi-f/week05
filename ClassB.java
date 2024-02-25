package week05;

class ClassA {
    public void methodOne(int i) {} //hidden
    public void methodTwo(int i) { } //overhidden
    public static void methodThree(int i) {} //none
    public static void methodFour(int i) {} //hidden
    }
    class ClassB extends ClassA {
    public static void methodOne(int i) { } //hidden
    public void methodTwo(int i) {} //overhidden
    public void methodThree(int i) {} //none
    public static void methodFour(int i) {} //hidden
    }
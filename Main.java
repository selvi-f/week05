package week05;

class X {
    public X() {
        System.out.println("In constructor X.");
    }
 }
 
class Y extends X {
    public Y() {
        System.out.println("In constructor Y.");
    }
 }
 
public class Main {
    public static void main(String[] args) {
        Y y = new Y();
    }
 }

// In constructor X.
// In constructor Y.

// will be the output. Firstly, new Y() class is creating. Then Y class extends the X class and X class prints the first.


package week05;

public class OverrideDemo {
    public static void main(String[] args) {
      Child child = new Child();
      System.out.println(child.calcValue(5));
      System.out.println(child.calcValue(5, 10));
    }
   }
   class Parent {
    public int calcValue(int a) {
      System.out.println("Super");
      return a * 2;
    }
   }
   class Child extends Parent {
    public int calcValue(int a, int b) {
      System.out.println("Subclass");
      return (a + b) * 2;
    }
   }

//Super
//10
//Subclass
//30

//will be printed. CalcValue(5) refers to class Parent which is also belongs to class Child. 
//CalcValue(5, 10) directly refers to class Child
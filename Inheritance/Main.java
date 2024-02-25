
package week05.Inheritance;

class Human {
    public void walk() {
        System.out.println("Human is walking");
    }
}

class Woman extends Human {
    public void talk() {
        System.out.println("Woman is talking");
    }
}

class Girl extends Woman {
    public void play() {
        System.out.println("Girl is playing");
    }
}

public class Main {
    public static void main(String[] args) {
        Girl girl = new Girl();
        girl.walk(); //form class Human
        girl.talk(); //from class Woman
        girl.play(); //from class Girl
    }
}

package week05.Inheritance;

public class Person {
    private String name;
    private String surname;
    private String gender;

    public Person() {
        this.name = "John";
        this.surname = "Doe";
        this.gender = "m";
    }

   public Person(String name, String surname, String gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }
}

//Single inheritance type

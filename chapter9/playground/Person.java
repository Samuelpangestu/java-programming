package chapter9.playground;

public class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter untuk name
    public String getName() {
        return name;
    }

    // Setter untuk name
    public void setName(String name) {
        this.name = name;
    }

    // Getter untuk age
    public int getAge() {
        return age;
    }

    // Setter untuk age
    public void setAge(int age) {
        this.age = age;
    }

    // Metode untuk menampilkan informasi
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}


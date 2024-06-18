package PracticeSamuel;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Person
        PersonEncapsulation person = new PersonEncapsulation("John Doe", 30);
        person.displayInfo();

        // Membuat objek Student
        StudentInheritence student = new StudentInheritence("Jane Smith", 20, "S12345");
        student.displayInfo();

        // Polimorfisme: menggunakan referensi superclass untuk objek subclass
        PersonEncapsulation polyPerson = new StudentInheritence("Alice Brown", 22, "S67890");
        polyPerson.displayInfo(); // Memanggil metode displayInfo dari Student
    }
}

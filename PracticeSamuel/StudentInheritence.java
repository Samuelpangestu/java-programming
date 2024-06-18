package PracticeSamuel;
/*
Pewarisan: Kelas Student mewarisi atribut dan metode
dari kelas Person menggunakan kata kunci extends.
 */
public class StudentInheritence extends PersonEncapsulation {
    private String studentId;

    // Constructor
    public StudentInheritence(String name, int age, String studentId) {
        super(name, age); // Memanggil constructor superclass (Person)
        this.studentId = studentId;
    }

    // Getter untuk studentId
    public String getStudentId() {
        return studentId;
    }

    // Setter untuk studentId
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    // Overriding metode displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo(); // Memanggil metode displayInfo dari superclass (Person)
        System.out.println("Student ID: " + studentId);
    }
}

import java.util.ArrayList;
import java.util.List;



public class StudentManager {
    private List<Student> students; // List to store students

    // Constructor
    public StudentManager() {
        students = new ArrayList<>(); // Initialize the list
    }

    // Add a new student
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully!");
    }

    // View all students
    public void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
        } else {
            System.out.println("Student List:");
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    // Search a student by ID
    public Student searchStudentById(String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    // Delete a student by ID
    public boolean deleteStudentById(String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                students.remove(student);
                return true;
            }
        }
        return false;
    }
}

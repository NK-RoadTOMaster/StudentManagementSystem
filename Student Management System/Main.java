import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager(); // Create StudentManager object
        Scanner scanner = new Scanner(System.in); // Scanner for user input
        int choice;

        do {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Delete Student by ID");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character
                    System.out.print("Enter Course: ");
                    String course = scanner.nextLine();

                    Student student = new Student(id, name, age, course);
                    manager.addStudent(student);
                }
                case 2 -> manager.viewAllStudents();
                case 3 -> {
                    System.out.print("Enter Student ID to search: ");
                    String id = scanner.nextLine();
                    Student student = manager.searchStudentById(id);
                    if (student != null) {
                        System.out.println("Student Found: " + student);
                    } else {
                        System.out.println("Student not found.");
                    }
                }
                case 4 -> {
                    System.out.print("Enter Student ID to delete: ");
                    String id = scanner.nextLine();
                    if (manager.deleteStudentById(id)) {
                        System.out.println("Student deleted successfully.");
                    } else {
                        System.out.println("Student not found.");
                    }
                }
                case 5 -> System.out.println("Exiting the program. Goodbye!");
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}

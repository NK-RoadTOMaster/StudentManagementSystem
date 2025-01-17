public class Student {
    private String id;
    private String name;
    private int age;
    private String course;

    // Constructor
    public Student(String id, String name, int age, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    // Display student details
    @Override
    public String toString() {
        return "Student{" +
               "ID='" + id + '\'' +
               ", Name='" + name + '\'' +
               ", Age=" + age +
               ", Course='" + course + '\'' +
               '}';
    }
}

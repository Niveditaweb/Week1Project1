import java.util.ArrayList;

public class StudentService {

    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
    for (Student s : students) {
        if (s.getStudentId() == student.getStudentId()) {
            System.out.println(" Student ID already exists! Cannot add duplicate.");
            return;
        }
    }

    student.calculateGrade();
    students.add(student);
    System.out.println(" Student added successfully!");
}

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student s : students) {
            s.displayDetails();
        }
    }

    public Student searchStudentById(int id) {
        for (Student s : students) {
            if (s.getStudentId() == id) {
                return s;
            }
        }
        return null;
    }

    public void updateMarks(int id, double newMarks) {
        Student s = searchStudentById(id);

        if (s != null) {
            s.setMarks(newMarks);
            s.calculateGrade();
            System.out.println("Marks updated successfully!");
        } else {
            System.out.println("Student not found.");
        }
    }

    public void findTopper() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        Student topper = students.get(0);

        for (Student s : students) {
            if (s.getMarks() > topper.getMarks()) {
                topper = s;
            }
        }

        System.out.println(" Top Performer:");
        topper.displayDetails();
    }
}
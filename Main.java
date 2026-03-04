import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();

        int choice;

        while (true) {

            System.out.println("===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Marks");
            System.out.println("5. Find Topper");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    sc.nextLine(); 

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    System.out.println("Select Type: 1.Regular  2.Scholarship");
                    int type = sc.nextInt();

                    Student student;

                    if (type == 1)
                        student = new RegularStudent(id, name, marks);
                    else
                        student = new ScholarshipStudent(id, name, marks);

                    service.addStudent(student);
                    break;

                case 2:
                    service.displayAllStudents();
                    break;

                case 3:
                    System.out.print("Enter ID to search: ");
                    int searchId = sc.nextInt();
                    Student found = service.searchStudentById(searchId);

                    if (found != null)
                        found.displayDetails();
                    else
                        System.out.println("Student not found.");
                    break;

                case 4:
                    System.out.print("Enter ID to update: ");
                    int updateId = sc.nextInt();

                    System.out.print("Enter new marks: ");
                    double newMarks = sc.nextDouble();

                    service.updateMarks(updateId, newMarks);
                    break;

                case 5:
                    service.findTopper();
                    break;

                case 6:
                    System.out.println("Exiting system...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
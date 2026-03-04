public abstract class Student {
    private int studentId;
    private String name;
    private double marks;
    private char grade;
    private String studentType;
    public Student(int studentId, String name, double marks,String studentType) {
        this.studentId = studentId;
        this.name = name;
        this.marks = marks;
        this.studentType = studentType;
    }
    public int getStudentId() {
        return studentId;
    }
    public String getName() {
        return name;
    }
    public double getMarks() {
        return marks;
    }
    public void setMarks(double marks) {
        this.marks = marks;
    }
    public char getGrade() {
        return grade;
    }
    public void setGrade(char grade) {
        this.grade = grade;
    }
    public String getStudentType() {
        return studentType;
    }
    public abstract void calculateGrade();
    public void displayDetails() {
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
        System.out.println("Type: " + studentType); 
        System.out.println("----------------------");
    }
}
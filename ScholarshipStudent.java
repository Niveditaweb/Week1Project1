public class ScholarshipStudent extends Student {

    public ScholarshipStudent(int id, String name, double marks) {
        super(id, name, marks, "Scholarship");
    }

    @Override
    public void calculateGrade() {
        double m = getMarks() + 5;

        if (m >= 90)
            setGrade('A');
        else if (m >= 75)
            setGrade('B');
        else if (m >= 60)
            setGrade('C');
        else
            setGrade('F');
    }
}
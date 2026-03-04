public class RegularStudent extends Student {

    public RegularStudent(int id, String name, double marks) {
        super(id, name, marks, "Regular");
    }

    @Override
    public void calculateGrade() {
        double m = getMarks();

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
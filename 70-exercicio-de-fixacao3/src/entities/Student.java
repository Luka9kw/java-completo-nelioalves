package entities;

public class Student {

    public String name;
    public double grade1;
    public double grade2, grade3;

    public double finalGradeCalc() {
        return grade1 + grade2 + grade3;
    }

    public double missingPoints() {
        if (finalGradeCalc() < 60) {
            return 60 - finalGradeCalc();
        }
        else {
            return 0;
        }
    }

}

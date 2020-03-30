package Assessment1;

import java.util.Arrays;

public class AssessmentTester {
    public static void main(String[] args) {


        Student BillyTheKiDD = new Student("William ", "Brown");
        Scores Grades = new Scores();



        System.out.print(BillyTheKiDD.getFirstName());
        System.out.print(BillyTheKiDD.getLastName());
        System.out.println(Arrays.toString(Grades.getScores()));
        System.out.println(Grades.calculateGradeAverage(67.0,77.9,89.0));
        System.out.println(Grades.totalScores(67.0,77.9,89.0));



    }
}

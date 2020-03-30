package Assessment1;

import java.util.Arrays;

public class AssessmentTester {
    public static void main(String[] args) {


        Student BillyTheKiDD = new Student("William ", "Brown");



        System.out.print(BillyTheKiDD.getFirstName());
        System.out.print(BillyTheKiDD.getLastName());
        System.out.println(Arrays.toString(BillyTheKiDD.getScores()));
        System.out.println(Arrays.toString(BillyTheKiDD.getScores()));
        System.out.println(BillyTheKiDD.calculateGradeAverage(67.0,77.9,89.0));
        System.out.println(BillyTheKiDD.totalScores(67.0,77.9,89.0));






    }
}

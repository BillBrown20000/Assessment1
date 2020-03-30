package Assessment1;

import java.util.Arrays;

public class AssessmentTester {
    public static void main(String[] args) {


        Student BillyTheKiDD = new Student("William ", "Brown", new double[]{90.0, 85.2, 73.4});



        System.out.print(BillyTheKiDD.getFirstName());
        System.out.print(BillyTheKiDD.getLastName());
        System.out.println(Arrays.toString(BillyTheKiDD.getScores()));
        System.out.println(Arrays.toString(BillyTheKiDD.getScores()));
        System.out.println(BillyTheKiDD.calculateGradeAverage());
        System.out.println(BillyTheKiDD.totalScores());






    }
}

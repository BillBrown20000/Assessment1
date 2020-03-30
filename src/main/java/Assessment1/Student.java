package Assessment1;

import java.util.Arrays;

public class Student {
    private String firstName;
    private String lastName;
   private double scores[];

    public Student(String firstName, String lastName, double scores[]) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.scores = scores;
    }

    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public double[] getScores() {
        return scores;
    }

    public double calculateGradeAverage(){
        int sum = 0;
        for (int x = 0; x < scores.length; x++)
            sum += scores[x];
        double i = sum / scores.length;
        return i;
    }
    public double totalScores() {
        double total = 0;
        for (int x = 0; x < scores.length; x++){
            total = total + scores[x];
        }

        return total;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", scores=" + Arrays.toString(scores) +
                '}';
    }
}


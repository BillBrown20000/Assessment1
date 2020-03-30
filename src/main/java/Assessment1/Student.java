package Assessment1;

public class Student {
    private String firstName;
    private String lastName;
   private double scores[] = {67.0, 77.9, 89.0};

    public Student(){

    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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

    public double calculateGradeAverage(double average, double v, double Average) {
        int sum = 0;
        for (int x = 0; x < scores.length; x++)
            sum += scores[x];
        Average = sum / scores.length;
        return Average;
    }
    public double totalScores(double sum1, double v, double sum){
        sum = 0;
        for (int x = 0; x < scores.length; x++)
            sum += scores[x];
        return sum;
    }
}



package Assessment1;

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

    public double[] calculateGradeAverage(){
        int sum = 0;
        for (int x = 0; x < scores.length; x++)
            sum += scores[x];
        double i = sum / scores.length;
        return new double[]{i};
    }
    public double[] totalScores(){
        double total = 0;
        for (int x = 0; x < scores.length; x++)
            total = scores[x];
        return new double[]{total};
    }
}



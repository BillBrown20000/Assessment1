package Assessment1;

public class Scores {

    private Double Scores[] = {67.0,77.9,89.0};

    public Scores(Double Scores[]) {
        for (int x = 0; x < Scores.length; x++)
            return;

    }

    public void setScores(Double[] scores) {
        Scores = scores;
    }

    public Double[] getScores() {
        return Scores;
    }

    public Scores() {

    }

    public double calculateGradeAverage(double average, double v, double Average){
        int sum = 0;
        for (int x = 0; x < Scores.length; x++)
            sum += Scores[x];
        Average = sum / Scores.length;
        return Average;
    }
    public double totalScores(double sum1, double v, double sum){
        sum = 0;
        for (int x = 0; x < Scores.length; x++)
            sum += Scores[x];
        return sum;
        }

    public void setScores(double v, double v1, double v2) {
    }
}
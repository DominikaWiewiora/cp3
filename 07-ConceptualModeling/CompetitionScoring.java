import java.util.Arrays;

public class CompetitionScoring {
    private int[] scores;

    public CompetitionScoring(int[] scores) {
        if (scores.length != 5) {
            throw new IllegalArgumentException("There must be exactly 5 scores.");
        }
        this.scores = scores;
    }

    public double calculateFinalResult() {
       
        Arrays.sort(scores);

      
        int sum = 0;
        for (int i = 1; i < scores.length - 1; i++) {
            sum += scores[i];
        }

    
        return sum / 3.0;
    }

    public static void main(String[] args) {
     
        int[] scores1 = {5, 3, 4, 2, 5};
        int[] scores2 = {4, 4, 3, 5, 5};
        int[] scores3 = {2, 3, 3, 4, 5};


        System.out.println("Player 1 Final Score: " + new CompetitionScoring(scores1).calculateFinalResult());
        System.out.println("Player 2 Final Score: " + new CompetitionScoring(scores2).calculateFinalResult());
        System.out.println("Player 3 Final Score: " + new CompetitionScoring(scores3).calculateFinalResult());
    }
}

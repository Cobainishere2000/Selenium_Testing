import java.util.*;

public class RockPaperScissors {
    static int userScore = 0;
    static int computerScore = 0;
    static String player1Name,player2Name;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] choices = { "Rock", "Paper", "Scissors" };

        System.out.print("Enter Player 1's name: ");
        player1Name = sc.nextLine();
        System.out.print("Enter Player 2's name: ");
        player2Name = sc.nextLine();

        Random random = new Random();
        int firstPlayerIndex = random.nextInt(2); // Randomly decide who goes first

        System.out.println("\n" + choices[firstPlayerIndex] + " will go first!");

        for (int round = 1; round <= 3; round++) {
            System.out.println("\nRound " + round);
            System.out.print(player1Name + ", enter your choice (Rock/Paper/Scissors): ");
            String player1Choice = sc.nextLine();
            int player1Index = Arrays.asList(choices).indexOf(player1Choice);

            System.out.print(player2Name + ", enter your choice (Rock/Paper/Scissors): ");
            String player2Choice = sc.nextLine();
            int player2Index = Arrays.asList(choices).indexOf(player2Choice);

            getRoundResult(player1Index, player2Index);
        }

        printGameResult();
    }

    public static void getRoundResult(int choice1, int choice2) {
        if (choice1 == choice2) {
            System.out.println("Tie!");
        } else {
            switch (choice1) {
                case 0:
                    if (choice2 == 2) {
                        userScore++;
                    } else {
                        computerScore++;
                    }
                    break;
                case 1:
                    if (choice2 == 0) {
                        userScore++;
                    } else {
                        computerScore++;
                    }
                    break;
                case 2:
                    if (choice2 == 1) {
                        userScore++;
                    } else {
                        computerScore++;
                    }
                    break;
            }
        }
    }

    public static void printGameResult() {
        System.out.println("\nGame Over!");
        System.out.println("Final Score:");
        System.out.println("Player 1 (" + userScore + ") vs. Player 2 (" + computerScore + ")");

        if (userScore > computerScore) {
            System.out.println("Congratulations, " + player1Name + "! You win!");
        } else if (computerScore > userScore) {
            System.out.println("Sorry, " + player2Name + ". You lose!");
        } else {
            System.out.println("It's a tie!");
        }
    }
}

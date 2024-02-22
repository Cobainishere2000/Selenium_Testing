import java.io.Console;
import java.util.*;

public class RockPaperScissors_ {
    static int player1Score = 0;
    static int player2Score = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] choices = { "Rock", "Paper", "Scissors" };

        System.out.print("Enter Player 1's name: ");
        String player1Name = sc.nextLine();
        System.out.print("Enter Player 2's name: ");
        String player2Name = sc.nextLine();

        Random random = new Random();
        int firstPlayerIndex = random.nextInt(2); // Randomly decide who goes first

        System.out.println("\n" + choices[firstPlayerIndex] + " will go first!");

        for (int round = 1; round <= 3; round++) {
            System.out.println("\nRound " + round);
            System.out.print(player1Name + ", enter your choice (Rock/Paper/Scissors): ");
            String player1Choice = readPassword(); // Masked input
            int player1Index = Arrays.asList(choices).indexOf(player1Choice);

            System.out.print(player2Name + ", enter your choice (Rock/Paper/Scissors): ");
            String player2Choice = readPassword(); // Masked input
            int player2Index = Arrays.asList(choices).indexOf(player2Choice);

            getRoundResult(player1Index, player2Index);
        }

        printGameResult(player1Name, player2Name);
    }

    public static void getRoundResult(int choice1, int choice2) {
        if (choice1 == choice2) {
            System.out.println("Tie!");
        } else {
            switch (choice1) {
                case 0:
                    if (choice2 == 2) {
                        player1Score++;
                    } else {
                        player2Score++;
                    }
                    break;
                case 1:
                    if (choice2 == 0) {
                        player1Score++;
                    } else {
                        player2Score++;
                    }
                    break;
                case 2:
                    if (choice2 == 1) {
                        player1Score++;
                    } else {
                        player2Score++;
                    }
                    break;
            }
        }
    }

    public static void printGameResult(String player1, String player2) {
        System.out.println("\nGame Over!");
        System.out.println(player1 + " (" + player1Score + ") vs. " + player2 + " (" + player2Score + ")");

        if (player1Score > player2Score) {
            System.out.println(player1 + " wins!");
        } else if (player2Score > player1Score) {
            System.out.println(player2 + " wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }

    // Helper method to read input as a password (masked)
    public static String readPassword() {
        Console console = System.console();
        if (console != null) {
            char[] password = console.readPassword();
            return new String(password);
        } else {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextLine(); // Fallback for IDEs without console support
        }
    }
}

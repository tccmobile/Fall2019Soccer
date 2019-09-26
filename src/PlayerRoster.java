import java.util.Scanner;

public class PlayerRoster {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int NUM_PLAYERS = 5;
        int[] jerseyNums = new int[NUM_PLAYERS];
        int[] ratingNums = new int[NUM_PLAYERS];
        int i;
        int j;
        int playerJersy;
        int playerRating;
        char menuOp;


        // Get user defined jersey numbers and ratings
        for (i = 0; i < NUM_PLAYERS; ++i) {
            System.out.println("Enter player " + (i + 1) + "'s jersey number:");
            jerseyNums[i] = scnr.nextInt();

            System.out.println("Enter player " + (i + 1) + "'s rating:");
            ratingNums[i] = scnr.nextInt();

            System.out.println("");
        }

        // Print roster
        System.out.println("ROSTER");
        for (i = 0; i < NUM_PLAYERS; ++i) {
            System.out.println("Player " + (i + 1) + " -- Jersey number: " + jerseyNums[i] + ", Rating: " + ratingNums[i]);
        }
    }
}
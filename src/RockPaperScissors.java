import java.util.Scanner;
import java.util.Random;
/**
 * The Rock Paper Scissors program implements the
 * rock paper scissors game which allows the user to
 * play with the computer.It displays the Winner along with
 * the game's stats
 *
 * @author  Pavithraa Paramasivarasa
 * @version 1.0
 * @since   13-02-2023
 */
public class RockPaperScissors {

    public static final int ROCK = 1;
    public static final int PAPER = 2;
    public static final int SCISSORS = 3;
    public static final String COMPUTERCHOICESCISSORS="The Computer has chosen Scissors";

    public static final String COMPUTERCHOICEPAPER="The Computer has chosen Paper";

    public static final String COMPUTERCHOICEROCK="The Computer has chosen Rock";


    public static int userWins = 0;
    public static int computerWins = 0;
    public static int draws = 0;

    /**
     *This method is used to retrieve the
     * computer's choice between rock,paper and scissors.
     * If and else if statements are used to display to the user
     * the computer's choice.
     * @return int returns the computer's choice.
     */
    public static int getComputerChoice() {
        Random randomInt = new Random();
        int computerInt = 1 + randomInt.nextInt(4 - 1);
        if (computerInt==1){
            System.out.println(COMPUTERCHOICEROCK);
        }else if(computerInt==2){
            System.out.println(COMPUTERCHOICEPAPER);
        }else if(computerInt==3){
            System.out.println(COMPUTERCHOICESCISSORS);
        }
        return computerInt;

    }

    /**
     *This method is used to retrieve the
     * player's choice between rock,paper and scissors.
     *
     * @return int returns the user's choice.
     */

    public static int getPlayerChoice() {
        System.out.println("Please enter you move! Select 1 for ROCK,2 for PAPER,3 for SCISSORS");
        Scanner userInput = new Scanner(System.in);
        int playerChoice = userInput.nextInt();
        return playerChoice;
    }

    /**
     * This method implements the logic of the rock paper
     * scissors game.The user is asked how many rounds they would
     * like to play.
     * Depending on the number rounds the user would play,the game is iterated.
     * Depending on the winning stragety, the scores are added to the user or computer.
     * Once the round is complete,the winner of the overall is determined and displayed.
     */
    public static void rockPaperScissorsGame() {
        Scanner readingRounds = new Scanner(System.in);


        System.out.println("Please enter the number of Rounds you will like to play: ");
        int noOfRounds = readingRounds.nextInt();
        if (noOfRounds > 10) {
            System.out.println("EXIT Game");
            System.exit(0);
        } else if (noOfRounds < 1) {
            System.out.print("EXIT GAME");
            System.exit(0);

        } else {
            for (int i = 1; i <= noOfRounds; i++) {

                int userChoice = getPlayerChoice();
                int computerChoice = getComputerChoice();
                if (userChoice == ROCK & computerChoice == SCISSORS) {
                    userWins = userWins + 1;

                } else if (userChoice == SCISSORS & computerChoice == PAPER) {

                    userWins = userWins + 1;

                } else if (userChoice == ROCK & computerChoice == PAPER) {
                    userWins = userWins + 1;

                } else if (userChoice == ROCK & computerChoice == ROCK) {
                    draws = draws + 1;

                } else if (userChoice == PAPER & computerChoice == PAPER) {
                    draws = draws + 1;

                } else if (userChoice == SCISSORS & computerChoice == SCISSORS) {
                    draws = draws + 1;

                } else {

                    computerWins = computerWins + 1;

                }


            }
            int[] gameStats = {userWins, computerWins, draws};
            System.out.println("The number of wins for the Player: " + userWins);
            System.out.println("The number of wins for the Computer: " + computerWins);
            System.out.println("The number of Draws " + draws);

            if (gameStats[0] > gameStats[1]) {
                System.out.println("YOU HAVE WON THE GAME!");
            } else if (gameStats[1] > gameStats[0]) {
                System.out.println("THE COMPUTER HAS WON THE GAME!");

            } else if (gameStats[0] == gameStats[1]) {
                System.out.println("BOTH PLAYER AND COMPUTER HAVE THE SAME NUMBER OF WINS! ");
            }

        }
    }

    /**
     * This is the main method.The rock paper scissors game takes place.
     * Once the game has finished.The user was asked to play again and depending
     * on the user input the game is takes place again.
     * If the user chooses not to play the Program quits.
     * @param args
     */
    public static void main(String[] args) {

        rockPaperScissorsGame();
        System.out.println("Would you like to play again? Please type YES/NO");
        Scanner playAgainScanner=new Scanner(System.in);
        String playAgainInput=playAgainScanner.nextLine();
        System.out.println(playAgainInput);

        if (playAgainInput.equals("YES")){
            rockPaperScissorsGame();
        }else{
            System.out.println("Thank you for Playing!");
            System.exit(0);
        }


        }
    }

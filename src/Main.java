import java.util.Scanner;
import java.util.Random;

public class Main {

    public static final int ROCK = 1;
    public static final int PAPER = 2;
    public static final int SCISSORS = 3;
    public static final String COMPUTERCHOICESCISSORS="The Computer has chosen Scissors";

    public static final String COMPUTERCHOICEPAPER="The Computer has chosen Paper";

    public static final String COMPUTERCHOICEROCK="The Computer has chosen Rock";


    public static int userWins = 0;
    public static int computerWins = 0;
    public static int draws = 0;

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

    public static int getPlayerChoice() {
        System.out.println("Please enter you move! Select 1 for ROCK,2 for PAPER,3 for SCISSORS");
        Scanner userInput = new Scanner(System.in);
        int playerChoice = userInput.nextInt();
        return playerChoice;
    }
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
            int gameStats[] = {userWins, computerWins, draws};
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

    //public static
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
        //TODO:back up on github


/*        Scanner readingRounds = new Scanner(System.in);


        System.out.println("Please enter the number of Rounds you will like to play: ");
        int noOfRounds = readingRounds.nextInt();
        if (noOfRounds > 10) {
            System.out.println("EXIT Game");
            //break;
        } else if (noOfRounds < 1) {
            System.out.print("EXIT GAME");

        } else {
            for (int i = 1; i <= noOfRounds; i++) {

                int userChoice = getPlayerChoice();
                int computerChoice = 3;
                if (userChoice == ROCK & computerChoice == SCISSORS) {
                    System.out.println("The USER WON");
                    userWins = userWins + 1;

                } else if (userChoice == SCISSORS & computerChoice == PAPER) {

                    userWins = userWins + 1;
                    System.out.println("The user WINS!");
                } else if (userChoice == ROCK & computerChoice == PAPER) {
                    userWins = userWins + 1;
                    System.out.println("The user WINS!");
                } else if (userChoice == ROCK & computerChoice == ROCK) {
                    draws = draws + 1;
                    System.out.println("IT IS A DRAW");
                } else if (userChoice == PAPER & computerChoice == PAPER) {
                    draws = draws + 1;
                    System.out.println("IT IS A DRAW");
                } else if (userChoice == SCISSORS & computerChoice == SCISSORS) {
                    draws = draws + 1;
                    System.out.println("IT IS A DRAW");
                } else {
                    //System.out.println("Computer WINS");
                    computerWins = computerWins + 1;
                    System.out.println("THE COMPUTER WINS");
                }



            }
            int gameStats[]={userWins,computerWins,draws};
            System.out.println("The number of wins for the Player: "+userWins);
            System.out.println("The number of wins for the Computer: "+computerWins);
            System.out.println("The number of Draws "+draws);
            //PRINT THE NUMBER OF USERWINS,COMPUTERWINS AND DRAWS
            System.out.println();
            if (gameStats[0]>gameStats[1]){
                    System.out.println("YOU HAVE WON THE GAME!");
            }else if(gameStats[1]>gameStats[0]){
                System.out.println("THE COMPUTER HAS WON THE GAME!");

            }else if(gameStats[0]==gameStats[1]){
                System.out.println("BOTH PLAYER AND COMPUTER HAVE THE SAME NUMBER OF WINS! ");
            }*/

        }
    }

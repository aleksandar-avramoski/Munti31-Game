import java.util.ArrayList;
import java.util.Scanner;

public class Munti31 extends Players {
    public static String answer;
    public static int randomNum;
    public static int value;
    public static int finalValue;

    public static ArrayList<Integer> values = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello player! \nWelcome to the Munti31!");

        //INTRODUCTION
        System.out.println(" ");
        System.out.println("Press 'R' to review the rules of the game");

        String review = scanner.nextLine();

        if ("R".equals(review)) {
            System.out.println("The rules of the game are: \n-There's a dealer and a players; \n-The dealer deals 3 cards at the beginning to all players,and then by the permission of the player,the dealer deals one card more; \n-If the total value of the player's cards pass 31,then the player is out of the game; \n-If a player have a total value of 31,than he's a winner; \n-If nobody have a value of 31,than a winner is the player who have a value closest to 31; \nGood luck!");
            System.out.println(" ");
        }

        //PLAYERS OF THE GAME
        Players players = new Players();
        players.players();

        //STARTING THE GAME
        try {
            Thread.sleep(1000);
            System.out.println(" ");
            System.out.println("The game is starting...");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //THE DEALER DEALS A CARDS
        System.out.println(" ");
        System.out.println("The dealer deals a cards...");

        System.out.println(" ");
        for (String x : storeTheNames) {
            System.out.println(x + ":" + "3 cards");
        }

        for (int i = 0; i < numOfPlayers; i++) {
            for (String x : storeTheNames) {
                //CARDS OF THE PLAYER
                System.out.println(" ");
                System.out.println("Cards of the" + " " + pickTheName[i] + ":");

                randomNum = (int) (Math.random() * 9) + 1;
                int randomNum1 = randomNum;
                System.out.println(randomNum1);

                randomNum = (int) (Math.random() * 9) + 1;
                int randomNum2 = randomNum;
                System.out.println(randomNum);

                randomNum = (int) (Math.random() * 9) + 1;
                int randomNum3 = randomNum;
                System.out.println(randomNum);

                //VALUE OF THE CARDS
                System.out.println(" ");
                value = randomNum1 + randomNum2 + randomNum3;
                System.out.println("The value of the cards are:" + value);

                //GETTING ONE CARD MORE
                for (; ; ) {
                    System.out.println(" ");
                    System.out.println("Press 'C' to get one card more");

                    answer = scanner.nextLine();

                    if ("C".equals(answer)) {
                        randomNum = (int) (Math.random() * 9) + 1;
                        System.out.println(randomNum);

                        value = value + randomNum;

                        System.out.println("The value of the cards are:" + value);

                        //OUT
                        if (value > 31) {
                            System.out.println(" ");
                            System.out.println(pickTheName[i] + " " + "is out!");
                            break;

                            //WINNER
                        } else if (value == 31) {
                            System.out.println(" ");
                            System.out.println(pickTheName[i] + " " + "is the winner!");
                            System.exit(0);
                        }
                    }

                    if (!"C".equals(answer)) {
                        finalValue = value;
                        values.add(finalValue);
                        System.out.println("The final value of the cards of" + " " + pickTheName[i] + " " + "are:" + finalValue);
                        break;
                    }
                }
                break;
            }
        }

        //VALUES OF THE PLAYERS
        System.out.println("------------------------------------------ ");
        System.out.println("Values of cards of the players:");
        for (int i = 0; i < numOfPlayers; i++) {
            for (String p : storeTheNames) {
                System.out.println(" ");
                System.out.println("Values of cards of" + " " + pickTheName[i] + ":");
                System.out.println(pickTheName[i] + ":" + values.get(i));
                break;
            }
        }

        winnerOfTheGame();

        }
    public static void winnerOfTheGame() {
        System.out.println(" ");
        for (int i = 0; i < numOfPlayers; i++) {

            //IF NUM OF PLAYERS==2
            if (numOfPlayers == 2) {
                if (values.get(i) > values.get(1)) {
                    System.out.println("The winner is:" + pickTheName[i]);
                } else if (values.get(i) > values.get(0)) {
                    System.out.println("The winner is:" + pickTheName[i]);
                }

                //IF NUM OF PLAYERS==3
            } else if (numOfPlayers == 3) {
                if (values.get(i) > values.get(1) && values.get(i) > values.get(2)) {
                    System.out.println("The winner is:" + pickTheName[i]);
                } else if (values.get(i) > values.get(0) && values.get(i) > values.get(2)) {
                    System.out.println("The winner is:" + pickTheName[i]);
                } else if (values.get(i) > values.get(1) && values.get(i) > values.get(0)) {
                    System.out.println("The winner is:" + pickTheName[i]);
                }

                //IF NUM OF PLAYERS==4
            } else if (numOfPlayers == 4) {
                if (values.get(i) > values.get(1) && values.get(i) > values.get(2) && values.get(i) > values.get(3)) {
                    System.out.println("The winner is:" + pickTheName[i]);
                } else if (values.get(i) > values.get(0) && values.get(i) > values.get(2) && values.get(i) > values.get(3)) {
                    System.out.println("The winner is:" + pickTheName[i]);
                } else if (values.get(i) > values.get(1) && values.get(i) > values.get(0) && values.get(i) > values.get(3)) {
                    System.out.println("The winner is:" + pickTheName[i]);
                } else if (values.get(i) > values.get(1) && values.get(i) > values.get(0) && values.get(i) > values.get(2)) {
                    System.out.println("The winner is:" + pickTheName[i]);
                }

                //IF NUM OF PLAYERS==5
            } else if (numOfPlayers == 5) {
                if (values.get(i) > values.get(1) && values.get(i) > values.get(2) && values.get(i) > values.get(3) && values.get(i) > values.get(4)) {
                    System.out.println("The winner is:" + pickTheName[i]);
                } else if (values.get(i) > values.get(0) && values.get(i) > values.get(2) && values.get(i) > values.get(3) && values.get(i) > values.get(4)) {
                    System.out.println("The winner is:" + pickTheName[i]);
                } else if (values.get(i) > values.get(1) && values.get(i) > values.get(0) && values.get(i) > values.get(3) && values.get(i) > values.get(4)) {
                    System.out.println("The winner is:" + pickTheName[i]);
                } else if (values.get(i) > values.get(1) && values.get(i) > values.get(0) && values.get(i) > values.get(2) && values.get(i) > values.get(4)) {
                    System.out.println("The winner is:" + pickTheName[i]);
                } else if (values.get(i) > values.get(1) && values.get(i) > values.get(0) && values.get(i) > values.get(2) && values.get(i) > values.get(3)) {
                    System.out.println("The winner is:" + pickTheName[i]);
                }

                //IF NUM OF PLAYERS==6
            } else if (numOfPlayers == 6) {
                if (values.get(i) > values.get(1) && values.get(i) > values.get(2) && values.get(i) > values.get(3) && values.get(i) > values.get(4) && values.get(i) > values.get(5)) {
                    System.out.println("The winner is:" + pickTheName[i]);
                } else if (values.get(i) > values.get(0) && values.get(i) > values.get(2) && values.get(i) > values.get(3) && values.get(i) > values.get(4) && values.get(i) > values.get(5)) {
                    System.out.println("The winner is:" + pickTheName[i]);
                } else if (values.get(i) > values.get(1) && values.get(i) > values.get(0) && values.get(i) > values.get(3) && values.get(i) > values.get(4) && values.get(i) > values.get(5)) {
                    System.out.println("The winner is:" + pickTheName[i]);
                } else if (values.get(i) > values.get(1) && values.get(i) > values.get(0) && values.get(i) > values.get(2) && values.get(i) > values.get(4) && values.get(i) > values.get(5)) {
                    System.out.println("The winner is:" + pickTheName[i]);
                } else if (values.get(i) > values.get(1) && values.get(i) > values.get(0) && values.get(i) > values.get(2) && values.get(i) > values.get(3) && values.get(i) > values.get(5)) {
                    System.out.println("The winner is:" + pickTheName[i]);
                } else if (values.get(i) > values.get(1) && values.get(i) > values.get(0) && values.get(i) > values.get(2) && values.get(i) > values.get(3) && values.get(i) > values.get(4)) {
                    System.out.println("The winner is:" + pickTheName[i]);
                }

                //IF NUM OF PLAYERS==7
            } else if (numOfPlayers == 7) {
                if (values.get(i) > values.get(1) && values.get(i) > values.get(2) && values.get(i) > values.get(3) && values.get(i) > values.get(4) && values.get(i) > values.get(5) && values.get(i) > values.get(6)) {
                    System.out.println("The winner is:" + pickTheName[i]);
                } else if (values.get(i) > values.get(0) && values.get(i) > values.get(2) && values.get(i) > values.get(3) && values.get(i) > values.get(4) && values.get(i) > values.get(5) && values.get(i) > values.get(6)) {
                    System.out.println("The winner is:" + pickTheName[i]);
                } else if (values.get(i) > values.get(1) && values.get(i) > values.get(0) && values.get(i) > values.get(3) && values.get(i) > values.get(4) && values.get(i) > values.get(5) && values.get(i) > values.get(6)) {
                    System.out.println("The winner is:" + pickTheName[i]);
                } else if (values.get(i) > values.get(1) && values.get(i) > values.get(0) && values.get(i) > values.get(2) && values.get(i) > values.get(4) && values.get(i) > values.get(5) && values.get(i) > values.get(6)) {
                    System.out.println("The winner is:" + pickTheName[i]);
                } else if (values.get(i) > values.get(1) && values.get(i) > values.get(0) && values.get(i) > values.get(2) && values.get(i) > values.get(3) && values.get(i) > values.get(5) && values.get(i) > values.get(6)) {
                    System.out.println("The winner is:" + pickTheName[i]);
                } else if (values.get(i) > values.get(1) && values.get(i) > values.get(0) && values.get(i) > values.get(2) && values.get(i) > values.get(3) && values.get(i) > values.get(4) && values.get(i) > values.get(6)) {
                    System.out.println("The winner is:" + pickTheName[i]);
                } else if (values.get(i) > values.get(1) && values.get(i) > values.get(0) && values.get(i) > values.get(2) && values.get(i) > values.get(3) && values.get(i) > values.get(4) && values.get(i) > values.get(5)) {
                    System.out.println("The winner is:" + pickTheName[i]);
                }

                //IF NUM OF PLAYERS==8
            } else if (numOfPlayers == 8) {
                if (values.get(i) > values.get(1) && values.get(i) > values.get(2) && values.get(i) > values.get(3) && values.get(i) > values.get(4) && values.get(i) > values.get(5) && values.get(i) > values.get(6) && values.get(i) > values.get(7)) {
                    System.out.println("The winner is:" + pickTheName[i]);
                } else if (values.get(i) > values.get(0) && values.get(i) > values.get(2) && values.get(i) > values.get(3) && values.get(i) > values.get(4) && values.get(i) > values.get(5) && values.get(i) > values.get(6) && values.get(i) > values.get(7)) {
                    System.out.println("The winner is:" + pickTheName[i]);
                } else if (values.get(i) > values.get(1) && values.get(i) > values.get(0) && values.get(i) > values.get(3) && values.get(i) > values.get(4) && values.get(i) > values.get(5) && values.get(i) > values.get(6) && values.get(i) > values.get(7)) {
                    System.out.println("The winner is:" + pickTheName[i]);
                } else if (values.get(i) > values.get(1) && values.get(i) > values.get(0) && values.get(i) > values.get(2) && values.get(i) > values.get(4) && values.get(i) > values.get(5) && values.get(i) > values.get(6) && values.get(i) > values.get(7)) {
                    System.out.println("The winner is:" + pickTheName[i]);
                } else if (values.get(i) > values.get(1) && values.get(i) > values.get(0) && values.get(i) > values.get(2) && values.get(i) > values.get(3) && values.get(i) > values.get(5) && values.get(i) > values.get(6) && values.get(i) > values.get(7)) {
                    System.out.println("The winner is:" + pickTheName[i]);
                } else if (values.get(i) > values.get(1) && values.get(i) > values.get(0) && values.get(i) > values.get(2) && values.get(i) > values.get(3) && values.get(i) > values.get(4) && values.get(i) > values.get(6) && values.get(i) > values.get(7)) {
                    System.out.println("The winner is:" + pickTheName[i]);
                } else if (values.get(i) > values.get(1) && values.get(i) > values.get(0) && values.get(i) > values.get(2) && values.get(i) > values.get(3) && values.get(i) > values.get(4) && values.get(i) > values.get(5) && values.get(i) > values.get(7)) {
                    System.out.println("The winner is:" + pickTheName[i]);
                } else if (values.get(i) > values.get(1) && values.get(i) > values.get(0) && values.get(i) > values.get(2) && values.get(i) > values.get(3) && values.get(i) > values.get(4) && values.get(i) > values.get(5) && values.get(i) > values.get(6)) {
                    System.out.println("The winner is:" + pickTheName[i]);
                }

                //IF NUM OF PLAYERS==9
            } else if (numOfPlayers == 9) {
                if (values.get(i) > values.get(1) && values.get(i) > values.get(2) && values.get(i) > values.get(3) && values.get(i) > values.get(4) && values.get(i) > values.get(5) && values.get(i) > values.get(6) && values.get(i) > values.get(7) && values.get(i) > values.get(8)) {
                    System.out.println("The winner is:" + pickTheName[i]);
                } else if (values.get(i) > values.get(0) && values.get(i) > values.get(2) && values.get(i) > values.get(3) && values.get(i) > values.get(4) && values.get(i) > values.get(5) && values.get(i) > values.get(6) && values.get(i) > values.get(7) && values.get(i) > values.get(8)) {
                    System.out.println("The winner is:" + pickTheName[i]);
                } else if (values.get(i) > values.get(1) && values.get(i) > values.get(0) && values.get(i) > values.get(3) && values.get(i) > values.get(4) && values.get(i) > values.get(5) && values.get(i) > values.get(6) && values.get(i) > values.get(7) && values.get(i) > values.get(8)) {
                    System.out.println("The winner is:" + pickTheName[i]);
                } else if (values.get(i) > values.get(1) && values.get(i) > values.get(0) && values.get(i) > values.get(2) && values.get(i) > values.get(4) && values.get(i) > values.get(5) && values.get(i) > values.get(6) && values.get(i) > values.get(7) && values.get(i) > values.get(8)) {
                    System.out.println("The winner is:" + pickTheName[i]);
                } else if (values.get(i) > values.get(1) && values.get(i) > values.get(0) && values.get(i) > values.get(2) && values.get(i) > values.get(3) && values.get(i) > values.get(5) && values.get(i) > values.get(6) && values.get(i) > values.get(7) && values.get(i) > values.get(8)) {
                    System.out.println("The winner is:" + pickTheName[i]);
                } else if (values.get(i) > values.get(1) && values.get(i) > values.get(0) && values.get(i) > values.get(2) && values.get(i) > values.get(3) && values.get(i) > values.get(4) && values.get(i) > values.get(6) && values.get(i) > values.get(7) && values.get(i) > values.get(8)) {
                    System.out.println("The winner is:" + pickTheName[i]);
                } else if (values.get(i) > values.get(1) && values.get(i) > values.get(0) && values.get(i) > values.get(2) && values.get(i) > values.get(3) && values.get(i) > values.get(4) && values.get(i) > values.get(5) && values.get(i) > values.get(7) && values.get(i) > values.get(8)) {
                    System.out.println("The winner is:" + pickTheName[i]);
                } else if (values.get(i) > values.get(1) && values.get(i) > values.get(0) && values.get(i) > values.get(2) && values.get(i) > values.get(3) && values.get(i) > values.get(4) && values.get(i) > values.get(5) && values.get(i) > values.get(6) && values.get(i) > values.get(8)) {
                    System.out.println("The winner is:" + pickTheName[i]);
                } else if (values.get(i) > values.get(1) && values.get(i) > values.get(0) && values.get(i) > values.get(2) && values.get(i) > values.get(3) && values.get(i) > values.get(4) && values.get(i) > values.get(5) && values.get(i) > values.get(6) && values.get(i) > values.get(7)) {
                    System.out.println("The winner is:" + pickTheName[i]);
                }

                //IF NUM OF PLAYERS==10
            } else if (numOfPlayers == 10) {
                if (values.get(i) > values.get(1) && values.get(i) > values.get(2) && values.get(i) > values.get(3) && values.get(i) > values.get(4) && values.get(i) > values.get(5) && values.get(i) > values.get(6) && values.get(i) > values.get(7) && values.get(i) > values.get(8) && values.get(i) > values.get(9)) {
                    System.out.println("The winner is:" + pickTheName[i]);
                } else if (values.get(i) > values.get(0) && values.get(i) > values.get(2) && values.get(i) > values.get(3) && values.get(i) > values.get(4) && values.get(i) > values.get(5) && values.get(i) > values.get(6) && values.get(i) > values.get(7) && values.get(i) > values.get(8) && values.get(i) > values.get(9)) {
                    System.out.println("The winner is:" + pickTheName[i]);
                } else if (values.get(i) > values.get(1) && values.get(i) > values.get(0) && values.get(i) > values.get(3) && values.get(i) > values.get(4) && values.get(i) > values.get(5) && values.get(i) > values.get(6) && values.get(i) > values.get(7) && values.get(i) > values.get(8) && values.get(i) > values.get(9)) {
                    System.out.println("The winner is:" + pickTheName[i]);
                } else if (values.get(i) > values.get(1) && values.get(i) > values.get(0) && values.get(i) > values.get(2) && values.get(i) > values.get(4) && values.get(i) > values.get(5) && values.get(i) > values.get(6) && values.get(i) > values.get(7) && values.get(i) > values.get(8) && values.get(i) > values.get(9)) {
                    System.out.println("The winner is:" + pickTheName[i]);
                } else if (values.get(i) > values.get(1) && values.get(i) > values.get(0) && values.get(i) > values.get(2) && values.get(i) > values.get(3) && values.get(i) > values.get(5) && values.get(i) > values.get(6) && values.get(i) > values.get(7) && values.get(i) > values.get(8) && values.get(i) > values.get(9)) {
                    System.out.println("The winner is:" + pickTheName[i]);
                } else if (values.get(i) > values.get(1) && values.get(i) > values.get(0) && values.get(i) > values.get(2) && values.get(i) > values.get(3) && values.get(i) > values.get(4) && values.get(i) > values.get(6) && values.get(i) > values.get(7) && values.get(i) > values.get(8) && values.get(i) > values.get(9)) {
                    System.out.println("The winner is:" + pickTheName[i]);
                } else if (values.get(i) > values.get(1) && values.get(i) > values.get(0) && values.get(i) > values.get(2) && values.get(i) > values.get(3) && values.get(i) > values.get(4) && values.get(i) > values.get(5) && values.get(i) > values.get(7) && values.get(i) > values.get(8) && values.get(i) > values.get(9)) {
                    System.out.println("The winner is:" + pickTheName[i]);
                } else if (values.get(i) > values.get(1) && values.get(i) > values.get(0) && values.get(i) > values.get(2) && values.get(i) > values.get(3) && values.get(i) > values.get(4) && values.get(i) > values.get(5) && values.get(i) > values.get(6) && values.get(i) > values.get(8) && values.get(i) > values.get(9)) {
                    System.out.println("The winner is:" + pickTheName[i]);
                } else if (values.get(i) > values.get(1) && values.get(i) > values.get(0) && values.get(i) > values.get(2) && values.get(i) > values.get(3) && values.get(i) > values.get(4) && values.get(i) > values.get(5) && values.get(i) > values.get(6) && values.get(i) > values.get(7) && values.get(i) > values.get(9)) {
                    System.out.println("The winner is:" + pickTheName[i]);
                } else if (values.get(i) > values.get(1) && values.get(i) > values.get(0) && values.get(i) > values.get(2) && values.get(i) > values.get(3) && values.get(i) > values.get(4) && values.get(i) > values.get(5) && values.get(i) > values.get(6) && values.get(i) > values.get(7) && values.get(i) > values.get(8)) {
                    System.out.println("The winner is:" + pickTheName[i]);
                }
            }
        }
    }
}

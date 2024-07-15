import java.util.ArrayList;
import java.util.Scanner;

public class Players {
    public static int numOfPlayers;
    public static String nameOfThePlayer;
    static ArrayList<String>storeTheNames=new ArrayList<>(10);
    static String[]pickTheName=new String[10];
    public void players() {

        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        //NUMBER OF PLAYERS WHO ARE PLAYING THE GAME
        System.out.println("How many players will play the game?");
        System.out.println("2-10 players");

        numOfPlayers = scanner1.nextInt();

        for (; ; ) {
            if (numOfPlayers < 2 || numOfPlayers > 10) {
                System.out.println("2-10 players can play the game");
                numOfPlayers = scanner1.nextInt();
            } else {
                System.out.println("The game will play:" + numOfPlayers + " " + "players");

                //ENTERING THE NAME OF THE PLAYERS
                for (int i=1;i<=numOfPlayers;i++) {
                    System.out.println(" ");
                    System.out.println("Enter the name of the Player" + " " + i + ":");

                    nameOfThePlayer = scanner.nextLine();

                    storeTheNames.add(nameOfThePlayer);
                }

                if(numOfPlayers==2) {
                    pickTheName[0] = storeTheNames.get(0);
                    pickTheName[1] = storeTheNames.get(1);
                } else if (numOfPlayers==3) {
                    pickTheName[0] = storeTheNames.get(0);
                    pickTheName[1] = storeTheNames.get(1);
                    pickTheName[2] = storeTheNames.get(2);
                } else if (numOfPlayers==4) {
                    pickTheName[0] = storeTheNames.get(0);
                    pickTheName[1] = storeTheNames.get(1);
                    pickTheName[2] = storeTheNames.get(2);
                    pickTheName[3] = storeTheNames.get(3);
                } else if (numOfPlayers==5) {
                    pickTheName[0] = storeTheNames.get(0);
                    pickTheName[1] = storeTheNames.get(1);
                    pickTheName[2] = storeTheNames.get(2);
                    pickTheName[3] = storeTheNames.get(3);
                    pickTheName[4] = storeTheNames.get(4);
                } else if (numOfPlayers==6) {
                    pickTheName[0] = storeTheNames.get(0);
                    pickTheName[1] = storeTheNames.get(1);
                    pickTheName[2] = storeTheNames.get(2);
                    pickTheName[3] = storeTheNames.get(3);
                    pickTheName[4] = storeTheNames.get(4);
                    pickTheName[5] = storeTheNames.get(5);
                } else if (numOfPlayers==7) {
                    pickTheName[0] = storeTheNames.get(0);
                    pickTheName[1] = storeTheNames.get(1);
                    pickTheName[2] = storeTheNames.get(2);
                    pickTheName[3] = storeTheNames.get(3);
                    pickTheName[4] = storeTheNames.get(4);
                    pickTheName[5] = storeTheNames.get(5);
                    pickTheName[6] = storeTheNames.get(6);
                } else if (numOfPlayers==8) {
                    pickTheName[0] = storeTheNames.get(0);
                    pickTheName[1] = storeTheNames.get(1);
                    pickTheName[2] = storeTheNames.get(2);
                    pickTheName[3] = storeTheNames.get(3);
                    pickTheName[4] = storeTheNames.get(4);
                    pickTheName[5] = storeTheNames.get(5);
                    pickTheName[6] = storeTheNames.get(6);
                    pickTheName[7] = storeTheNames.get(7);
                } else if (numOfPlayers==9) {
                    pickTheName[0] = storeTheNames.get(0);
                    pickTheName[1] = storeTheNames.get(1);
                    pickTheName[2] = storeTheNames.get(2);
                    pickTheName[3] = storeTheNames.get(3);
                    pickTheName[4] = storeTheNames.get(4);
                    pickTheName[5] = storeTheNames.get(5);
                    pickTheName[6] = storeTheNames.get(6);
                    pickTheName[7] = storeTheNames.get(7);
                    pickTheName[8] = storeTheNames.get(8);
                } else if (numOfPlayers==10) {
                    pickTheName[0] = storeTheNames.get(0);
                    pickTheName[1] = storeTheNames.get(1);
                    pickTheName[2] = storeTheNames.get(2);
                    pickTheName[3] = storeTheNames.get(3);
                    pickTheName[4] = storeTheNames.get(4);
                    pickTheName[5] = storeTheNames.get(5);
                    pickTheName[6] = storeTheNames.get(6);
                    pickTheName[7] = storeTheNames.get(7);
                    pickTheName[8] = storeTheNames.get(8);
                    pickTheName[9] = storeTheNames.get(9);
                }

                //THE PLAYERS WHO ARE PLAYING THE GAME
                System.out.println(" ");
                System.out.println("The players who are playing the game are:");

                for (int i=0;i<=numOfPlayers;i++) {
                    for (String x : storeTheNames) {
                        i=i+1;
                        System.out.println(i+"."+x);
                    }
                }

                System.out.println(" ");
                System.out.println("Good luck players!");

                break;
            }
        }
    }
}

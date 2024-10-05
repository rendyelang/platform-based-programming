import java.util.Scanner;

public class CaseThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        
        // while (true) {
        System.out.println("Enter the jersey number of the player: ");
        int jerseyNumber = scan.nextInt();
        String playerPosition = identifyPlayer(jerseyNumber);
        System.out.println(playerPosition);
        System.out.println();
        scan.close();
        // }
    }

    // Method to identify the player based on the jersey number
    protected static String identifyPlayer(int jerseyNumber) {
        String playerPosition = "";

        // Code to handle even jersey numbers
        Boolean isTargetAttacker = jerseyNumber %2 == 0;
        Boolean isRightCaptain = false;
        if (isTargetAttacker) {
            isRightCaptain = jerseyNumber >= 50 && jerseyNumber <= 100;
            if (isRightCaptain) {
                playerPosition = "The player is Target Attacker and have the right to be Captain";
            } else {
                playerPosition = "The player is Target Attacker";
            }
        }

        // Code to handle odd jersey numbers
        Boolean isDefender = jerseyNumber %2 == 1;
        Boolean isPlayMaker = false;
        Boolean isKeeper = false;
        if (isDefender) {
            isPlayMaker = jerseyNumber > 90;
            isKeeper = jerseyNumber %3 == 0 && jerseyNumber %5 == 0;
            if (isPlayMaker) {
                playerPosition = "The player is Defender and Play Maker";
            } else if (isKeeper) {
                playerPosition = "The player is Defender and Keeper";
            } else {
                playerPosition = "The player is Defender";
            }
        }

        return playerPosition;
    }
}

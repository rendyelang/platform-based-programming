import java.util.Scanner;

public class CaseTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Boolean isCyanidePowder = false;
        Boolean isLotCyanidePowder = false;
        Boolean isClearCctv = false;
        Boolean isBlurredCctv = false;
        Boolean isLotFingerPrint = false;
        Boolean isSuspiciousMovement = false;
        Boolean isCyanideInSuspectPocket = false;

        // Code for check if there are any cyanide powder in the victim's stomach
        System.out.println("Is there any cyanide powder in the victim's stomach? (yes/no)");
        String cyanidePowder = scan.nextLine();
        if (cyanidePowder.equalsIgnoreCase("yes")) {
            isCyanidePowder = true;
            System.out.println("Is there greater than 50 miligrams of cyanide powder in the victim's stomach? (yes/no)");
            String lotCyanidePowder = scan.nextLine();
            if (lotCyanidePowder.equalsIgnoreCase("yes")) {
                isLotCyanidePowder = true;
            }
        }

        // Code for check if there are any CCTV evidence
        System.out.println("Is there CCTV evidence? (yes/no)");
        String isCctvEvidence = scan.nextLine();
        if (isCctvEvidence.equalsIgnoreCase("yes")) {
            // Code for check if the CCTV is clear or blurred
            System.out.println("Is the CCTV clear? (yes/no)");
            String clearCctv = scan.nextLine();
            if (clearCctv.equalsIgnoreCase("yes")) {
                isClearCctv = true;
            } else {
                isBlurredCctv = true;
            }

            // Code for check if there are any suspicious movement in the CCTV
            System.out.println("Is there any suspicious movement in the CCTV? (yes/no)");
            String suspiciousMovement = scan.nextLine();
            if (suspiciousMovement.equalsIgnoreCase("yes")) {
                isSuspiciousMovement = true;
            }
        }

        // Code for check if there are any fingerprint evidence
        System.out.println("Is there a lot of fingerprint evidence? (yes/no)");
        String lotFingerPrint = scan.nextLine();
        if (lotFingerPrint.equalsIgnoreCase("yes")) {
            isLotFingerPrint = true;
        }

        // Code for check if there are any cyanide powder in the suspect's pocket
        System.out.println("Is there any cyanide powder in the suspect's pocket? (yes/no)");
        String cyanideInSuspectPocket = scan.nextLine();
        if (cyanideInSuspectPocket.equalsIgnoreCase("yes")) {
            isCyanideInSuspectPocket = true;
        }

        scan.close();
        String decision = caseInvestigation(isCyanidePowder, isLotCyanidePowder, isClearCctv, isBlurredCctv, isLotFingerPrint, isSuspiciousMovement, isCyanideInSuspectPocket);
        System.out.println(decision);
    }

    //  Method for investigating the case based on the given parameters.
    public static String caseInvestigation(Boolean isCyanidePowder, Boolean isLotCyanidePowder, Boolean isClearCctv, Boolean isBlurredCctv, Boolean isLotFingerPrint, Boolean isSuspiciousMovement, Boolean isCyanideInSuspectPocket) {
        String decison = "";
        int investigationScore = 0;

        if (isCyanidePowder) {
            investigationScore += 50;
        }

        if (isLotCyanidePowder) {
            investigationScore += 500;
        }

        if (isClearCctv) {
            investigationScore += 250;
        }

        if (isBlurredCctv) {
            investigationScore += 150;
        }

        if (isLotFingerPrint) {
            investigationScore += 100;
        }

        if (isSuspiciousMovement) {
            investigationScore += 50;
        }

        if (isCyanideInSuspectPocket) {
            investigationScore += 750;
        }

        if (investigationScore > 1300) {
            decison = "Total investigation score: " + investigationScore + "\nIt's clearly a murder";
        } else {
            decison = "Total investigation score: " + investigationScore + "\nThe case needs more investigation, still need more evidence to proof this cases";
        }

        return decison;
    }
}
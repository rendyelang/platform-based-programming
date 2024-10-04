public class Assignment {
    public static void main(String[] args) {
        String detective = findRankMafia("John", 45, "Nevada", 15000000);
        System.out.println(detective);
    }

    public static String findRankMafia(String name, int age, String place_to_live, int savings_in_dollars) {
        String indicates = "";

        Boolean isDon = age > 40 && (place_to_live.equals("Nevada") || place_to_live.equals("New York") || place_to_live.equals("Havana")) && savings_in_dollars > 10000000;
        Boolean isUnderBoss = (age >= 25 && age <= 40) && (place_to_live.equals("New Jersey") || place_to_live.equals("Manhattan") || place_to_live.equals("Nevada")) && (savings_in_dollars >= 1000000 && savings_in_dollars <= 2000000);
        Boolean isCapo = (age >= 18 && age <= 24) && (place_to_live.equals("California") || place_to_live.equals("Detroit") || place_to_live.equals("Boston")) && savings_in_dollars < 1000000;

        if (isDon) {
            indicates = name + " is likely a mafia member with Don rank.";
        } else if (isUnderBoss) {
            indicates = name + " is likely a mafia member with UnderBoss rank.";
        } else if (isCapo) {
            indicates = name + " is likely a mafia member with Capo rank.";
        } else {
            indicates = name + " is not suspicious.";
        }

        return indicates;
    }
}

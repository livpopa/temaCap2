public class Blackjack {

    public static int parseCard(String card) {

        switch (card) {
            case "ace":
                return 11;
            case "two":
                return 2;
            case "three":
                return 3;
            case "four":
                return 4;
            case "five":
                return 5;
            case "six":
                return 6;
            case "seven":
                return 7;
            case "eight":
                return 8;
            case "nine":
                return 9;
            case "ten":
            case "jack":
            case "queen":
            case "king":
                return 10;
            default:
                return 0;
        }
    }

    public static boolean isBlackjack(String card1, String card2) {
        if (card1.equals("queen") && card2.equals("ace")) {
            System.out.println("isBlackJack");
            return true;

        } else {
            System.out.println("Is not BackJack");
            return false;
        }
    }

    public static String largeHand(boolean isBlackjack, int dealerScore) {
        int handScore = 21;
        if (handScore > 20 && isBlackjack && dealerScore < 21) {
            return "W";
        } else {
            return "lost";


        }
    }

    public static String smallHand(int handScore, int dealerScore) {
        if (handScore < 21 && handScore > dealerScore) {
            return "H";

        } else {
            return "P";

        }
    }
}
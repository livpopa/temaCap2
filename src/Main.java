import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        // Lasagna
        System.out.println(Lasagna.expectedMinutesInOven());
        System.out.println(Lasagna.remainingMinutesInOven(30));
        System.out.println(Lasagna.preparationTimeInMinutes(2));
        System.out.println(Lasagna.totalTimeInMinutes(3, 20));

        // AnnalynsInfiltration
        System.out.println(AnnalynsInfiltration.canFastAttack(true));
        System.out.println(AnnalynsInfiltration.canSpy(false, true, false));
        System.out.println(AnnalynsInfiltration.canSignalPrisoner(false, true));
        System.out.println(AnnalynsInfiltration.canFreePrisoner(false, true, false, false));

        // BlackJack
        System.out.println(Blackjack.parseCard("ace"));
        System.out.println(Blackjack.isBlackjack("queen", "ace"));
        System.out.println(Blackjack.largeHand(true, 7));
        System.out.println(Blackjack.smallHand(15, 12));

        //exercitiul B1
        System.out.println("Numarul ales este:");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();


        int random = (int) (Math.random() * 100);
        if (x < random) {
            System.out.println("Numarul introdus " + x + " este mai mic decat " + random);
        } else {
            System.out.println("Numarul introdus " + x + " este mai mare decat " + random);
        }


        // exercitiul B2
        PunctulB.exercitiulB1();
        PunctulB.exercitiulB4();
        PunctulB.exercitiulB5();
        PunctulB.exercitiulB6();
        PunctulB.exercitiulB7();
        PunctulB.exercitiulB8();
    }
}
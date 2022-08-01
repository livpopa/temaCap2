import java.util.ArrayList;
import java.util.Scanner;

public class PunctulB {

    static void exercitiulB1() {

        System.out.println(
                "-‘a’: adaugare\n" +
                        "-‘s’: scadere\n" +
                        "-‘i’: inmultire\n" +
                        "-‘p’: impartire\n" +
                        "-‘m’: modul\n" +
                        " caracterul ales este: ");
        Scanner caracter = new Scanner(System.in);

        String Gigi = caracter.next();

        System.out.println("Primul numar ales este: ");
        Scanner nr1 = new Scanner(System.in);
        int primulnumar = nr1.nextInt();

        System.out.println("Al doilea numar ales este: ");
        Scanner nr2 = new Scanner(System.in);
        int numar2 = nr1.nextInt();


        switch (Gigi) {
            case "a": {
                System.out.println("Rezultatul adunarii este: " + (primulnumar + numar2));
                break;
            }
            case "s": {
                System.out.println("Rezultatul scaderii este: " + (primulnumar - numar2));
                break;
            }
            case "i": {
                System.out.println("Rezultatul inmultirii este: " + (primulnumar * numar2));
                break;
            }
            case "p": {
                System.out.println("Rezultatul impartirii este: " + (primulnumar / numar2));
                break;
            }
            case "m": {
                System.out.println("Rezultatul modulului este: " + (primulnumar % numar2));
                break;
            }
            default: {
                System.out.println("Eroare");
                break;
            }
        }

        //Exercitiul 3
        int[][] arr = {{1, 3, 5}, {2, 4, 6, 8, 10}};

        System.out.println(arr[0][0]);
        System.out.println(arr[0][2]);

        System.out.println(arr[1][0]);
        System.out.println(arr[1][4]);


    }

    //Exercitiul 4
    static void exercitiulB4() {
        char[] strada = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        for (int i = 1; i < strada.length; i += 2) {
            System.out.println(strada[i]);

        }
    }

    //Exercitiul 5
    static void exercitiulB5() {

        double[] zecimale = {14.7, 22.7, 3.6, 8.14, 22.3, 33.1};
        for (int i = 0; i < zecimale.length; i++) {
            if (zecimale[i] == 4.5) {
                System.out.println(zecimale[i]);
            }
            if (zecimale[i] > 5) {
                System.out.println("Element peste 5");
            }
        }
    }

    static void exercitiulB6() {
        int[] multime = {-12, 1, 23, 97, 81, 123, 1231, 111, 11110};
        for (int i = 0; i < multime.length; i++) {
            if (i == 2) {
                i++;
                i--;
                System.out.println(multime[i]);
            } else if (i == 6) {
                System.out.println("STOP");
                break;
            } else {
                System.out.println("Index valid");
            }
        }
    }

    static void exercitiulB7() {
        ArrayList<Integer> numar = new ArrayList<>();
        numar.add(11);
        numar.add(22);
        numar.add(33);
        numar.add(44);
        numar.add(55);
        System.out.println("Sumar numerelor este: " + (numar.get(0) + numar.get(1) + numar.get(2) + numar.get(3) + numar.get(4)));
    }

    public static void exercitiulB8() {
        String[] array = {};
        ArrayList<String> continut = new ArrayList<>();
        if (array.length == 0) {
            System.out.println("Continutul array-ului este gol");
        } else {
            System.out.println("Continutul array-ului nu este gol");
        }
        if (continut.size() == 0) {
            System.out.println("Lista continutului este goala");
        } else {
            System.out.println("Lista continutului nu este goala");
        }
    }
}
import java.util.Scanner;

public class swithchStatements {
    public static void main(String[] args) {
        //initieer scanner: Scanner scannerNaam = new Scanner(System.in);
        Scanner gebruikersInvoer = new Scanner(System.in);
        // de gebruiker vragen om invoer
        System.out.println("Wil je een snicker kies 1. Wil je liever een mars kies 2. Wil je een snicker kies 3.");

        // maak een variabel om de waarde die de gebruiker invoert in op te bergen
        int ingevoerdeKeuze = gebruikersInvoer.nextInt();

        switch (ingevoerdeKeuze){
            case 1:
                System.out.println("Je krijgt een mars.");
                break;
            case 2:
                System.out.println("Je krijgt een snicker.");
                break;
            case 3:
                System.out.println("Je krijgt een milky way.");
                break;
            default:
                System.out.println("Je krijgt helaas niks, omdat je niet hebt gekozen voor een geldige invoer. Kies 1, 2 of 3.");
        }
    }
}

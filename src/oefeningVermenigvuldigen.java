import java.util.Scanner;

public class oefeningVermenigvuldigen {
    public static void main(String[] args) {
        // variabelen en hun waarden definieeren en aangeven waarmee je gaat werken (je hoeft hem niet te vullen met een waarde)
        int getal1 = 3; // het kan ook zijn dat je hem definieert zonder waarde - int getal1;
        int getal2 = 3;
        int gebruikersInvoer = 0;
        int vermeningvuldigingGetal1Getal2 = getal1 * getal2;
        // opgeven dat je een scanner gaat gebruiken om de gebruikers invoer op te halen
        Scanner scannerGebruikersInvoer = new Scanner(System.in);

        // de gebruiker vragen wat de berekening is die je wil weten
        System.out.println("Voer de uitkomst van :" + getal1 + "x" + getal2 + " in.");

        // de gebruikers invoer ophalen en daarna opbergen in je eerder gedefinieerde variabel genaamd gebruikersinvoer
        gebruikersInvoer = scannerGebruikersInvoer.nextInt();
        if (vermeningvuldigingGetal1Getal2 == gebruikersInvoer){
            System.out.println("het antwoord is goed");
        } else {
            System.out.println("het antwoord is fout");
        }

    }
}

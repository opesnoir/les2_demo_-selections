import java.util.Scanner;

public class inputOphalenMetScanner {
    public static void main(String[] args) {
        // variabelen
        double cijfer = 8.5;
        String studentenNaam = "Eva";
        String nameUpdate;
        //printen
        System.out.println( studentenNaam + " heeft als eindcijfer: " + cijfer + ".");

        //input ophalen met scanner
        //scanner initieren
        Scanner input = new Scanner(System.in);
        System.out.println("Met welke naam wil je de huidige studentennaam updaten? Voer de nieuwe naam in: ");
        nameUpdate = input.nextLine();
        System.out.println("De naam: " + studentenNaam + " is ge-update naar: " + nameUpdate);

    }
}

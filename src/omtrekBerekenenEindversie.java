import java.util.Objects;
import java.util.Scanner;

public class omtrekBerekenenEindversie {

    //functie vraag: cirkel of vierkant
    public static String cirkelOfVierkant(){
        Scanner gebruikersInput = new Scanner(System.in);
        String returnGebruikersInput = gebruikersInput.nextLine();

        switch (returnGebruikersInput){
            case "cirkel":
                break;
            case "vierkant":
                break;
            default:
                System.out.println("Je keuze is ongeldig, voer in of je het oppervlakte van een vierkant of een cirkel wil uitrekenen");
        }

        return returnGebruikersInput;

    }

    // functie bereken oppervlakte cirkel
    public static double oppervlakteVierkantBerekening(double lengte, double breedte){
        double uitkomstOppervlakteVierkant = lengte * breedte;

        return uitkomstOppervlakteVierkant;
    }

    // functie bereken oppervlakte vierkant
    public static double oppervlakteCirkelBerekening(double straal){

        double uitkomstOppervlakteCirkel = straal * Math.PI;

        return uitkomstOppervlakteCirkel;
    }

    public static void main(String[] args) {
        String gebruikersKeuze;
        double inputLengte;
        double inputBreedte;
        double inputStraal;

        // input ophalen
        Scanner input = new Scanner(System.in);

        // communicatie rondom functie cirkel of vierkant
        System.out.println("Wil je de oppervlakte voor een cirkel of een vierkant uitrekenen?");
        gebruikersKeuze = cirkelOfVierkant();
        System.out.println("Je hebt gekozen voor een: " + gebruikersKeuze);

        // communicatie rondom uitrekenen cirkel of vierkant inclusief foutmelding
        if(Objects.equals(gebruikersKeuze, "vierkant")){
            double resultaatOppervlakteVierkant;

            System.out.println("voer de lengte van je vierkant in");
            inputLengte = input.nextDouble();
            System.out.println("voer de breedte van je vierkant in");
            inputBreedte = input.nextDouble();

            resultaatOppervlakteVierkant = oppervlakteVierkantBerekening(inputLengte,inputBreedte);
            System.out.println("De oppervlakte van je vierkant is: " + resultaatOppervlakteVierkant);
        } else if (Objects.equals(gebruikersKeuze, "cirkel")){
            double resultaatOppervlakteCirkel;

            System.out.println("voer de straal van je cirkel in");
            inputStraal = input.nextDouble();

            resultaatOppervlakteCirkel = oppervlakteCirkelBerekening(inputStraal);
            System.out.println("De oppervlakte van je cirkel is: " + resultaatOppervlakteCirkel);
        } else {
            System.out.println("Input is invalide");
        }

    }

}

import java.util.Scanner;

public class berekenOmtrek {

    //variabelen
    String cirkel;
    String vierkant;
    Boolean cirkelUitrekenen = true;


    //functies
    //de functie cirkelOfVierkant retouneert een string met daarin de waarde of iemand een cirkel of een vierkant wil uitrekenen
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

        // deze functie geeft de door de gebruiker ingevoerde input terug, waarbij hij toetst of de invoer accuraat is, mocht dat niet het geval zijn, dan retourneert hij de default zin dat de keuze ongeldig is.
        return returnGebruikersInput;

    }

    // functie om de vierkant oppervlakte te berekenen
    public static double oppervlakteVierkantBerekening(double lengte, double breedte){
        double uitkomstOppervlakteVierkant = lengte * breedte;

        return uitkomstOppervlakteVierkant;
    }

    // functie om de cirkel oppervlakte te berekenen
    public static double oppervlakteCirkelBerekening(double straal){

        double uitkomstOppervlakteCirkel = straal * Math.PI;

        return uitkomstOppervlakteCirkel;
    }

    public static void main(String[] args) {
        double invoerLengte;
        double invoerBreedte;
        double resultaatinvoeromtrekrechthoek;

        String gebruikersKeuze;
        double oppervlakte;
        double omtrek;

        Scanner gebruikersInvoerVierkant = new Scanner(System.in);

//        System.out.println("Wil je de oppervlakte voor een cirkel of een vierkant uitrekenen?");
//        gebruikersKeuze = cirkelOfVierkant();
//        System.out.println("Je hebt gekozen voor een: " + gebruikersKeuze);
//        System.out.println("Voer de straal van je cirkel in");
//
//        Scanner gebruikersInvoerStraal = new Scanner(System.in);
//        Double straalInput = gebruikersInvoerStraal.nextDouble();


        //informatie rechthoek gebruikersinput
        System.out.println("voer de lengte voor je vierkant in");
        invoerLengte = gebruikersInvoerVierkant.nextDouble();
        System.out.println("voer de breedte voor je vierkant in");
        invoerBreedte = gebruikersInvoerVierkant.nextDouble();
        resultaatinvoeromtrekrechthoek = oppervlakteVierkantBerekening(invoerLengte, invoerBreedte);
        System.out.println("De oppervlakte van je vierkant is: "+ resultaatinvoeromtrekrechthoek);

//        if (gebruikersKeuze == "cirkel"){
//            oppervlakte = oppervlakteCirkelBerekening(straalInput);
//        } else if (gebruikersKeuze == "vierkant"){
//            double oppervlakte2 = oppervlakteVierkantBerekening(invoerLengte, invoerBreedte);
//        } else {
//            System.out.println("foutieve invoer, kies cirkel of vierkant");
//        }
    }
}

//Functie stroomschema maken om inzichtelijk te maken wat de code moet doen
//Boolean is een datatype dat twee waarde kent: iets is waar (true) of niet waar (false)

public class ifStatements {
    public static void main(String[] args) {
        // je print eerst de waarde van de boolean, die is op dit punt true, gezien dat de waarde is die je hebt opgegeven
        boolean isWaar = true;
        System.out.println("Is het waar = " + isWaar);

        // vanaf hier geef je waarden op, en zal het programma kijken of hetgeen je vraagt 'true' of 'false' is.
        int getal1 = 17;
        int getal2 = 20;

        // isWaar ga je vullen en krijgt isWaar een waarde en je vraagt is getal1 gelijk aan of groter dan getal2
        isWaar = (getal1 >= getal2);
        System.out.println("Is het waar = " + isWaar);

        // if statement
        int getal = 12;

        if (getal > 0){
            System.out.println("Het opgegeven getal is positief");
        }

        // if else statement
        // is er een restwaarde als ik het getal deel door twee, daarmee kan je kijken of je met een even of oneven getal te maken hebt
        if (getal % 2 == 0){
            System.out.println("het getal is even");
        } else {
            System.out.println("het getal is oneven");
        }
    }



}

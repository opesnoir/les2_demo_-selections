// een multi way if is altijd het een of het andere, het is

public class multiWayIf {
    public static void main(String[] args) {
        // de variabelen waar je mee gaat werken
        int score = 76;
        char grade;

        //als de score groter dan of gelijk is aan 90 dan geef je als uitkomst qua grade een A, bij 80 een B, bij 70 een C en alles onder de 70 is een F
        if (score >= 90){
            grade = 'A';
        } else if (score >=80) {
            grade = 'B';
        } else if (score >=70) {
            grade = 'C';
        }else {
            grade = 'F';
        }
        // hier ga je werken met de multi way if, en aangeven was je cijfer is
        System.out.println("Je Grade is = " + grade);

        int getal = 9;
        // logische operatoren && (en), || (of) of ! (niet
        // vergelijken of twee zaken gelijk zijn aan elkaar, dus het getal boven de 0 en onder de 5
        if (getal >= 0 && getal <=5){
            System.out.println("je getal is tussen de 0 en 10, te weten een: " + getal + ".");
        }

    }
}

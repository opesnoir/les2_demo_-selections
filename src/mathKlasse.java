import static java.lang.Math.pow;
//Math klasse is dus een bestaande klasse met diverse functies: round (afronden op 2 decimalen), square, random (random getallen definieren)

public class mathKlasse {
    public static void main(String[] args) {
        // variable definieren
        double answer;
        //pow is een vaste functie binnen Jave, die moet je dus importeren om hem te gebruiken
        answer = pow(2,2);
        //geef de waarde van answer terug, en toon die in de termina door hem te printen
        System.out.println("het antwoord is " + answer);

    }

}

public class functieMaakBroodjeAanroepen {

    //functie maak een broodje kaas
    public static void maakBroodjeKaas(){
        System.out.println("1. pak brood en kaas");
        System.out.println("2. plaats een plak kaas op je plak brood");
        System.out.println("3. zet je broodje op een bord");
    }

    //main functie - hier plaats je de meat van je code en de functies die je aanroept
    public static void main(String[] args) {
        System.out.println("Welkom, hierna volgt hoe je een broodje kaas moet maken:");
        maakBroodjeKaas();
        System.out.println("Eet smakelijk!");
    }
}

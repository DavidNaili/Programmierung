class KassettenRekorder {
    
    boolean kannAufzeichnen = false;

    void kassetteAbspielen(){
        System.out.println("Spiele Kassette");
    }
    void kassetteAufzeichnen(){
        System.out.println("Kassette aufzeichnen");
}
}

class KassettenRekorderTestLauf {
    public static void main (String[] args){
        KassettenRekorder kr = new KassettenRekorder();
        kr.kannAufzeichnen = true;
        kr.kassetteAbspielen();

        if (kr.kannAufzeichnen == true){
            kr.kassetteAufzeichnen();
        }
    }
}

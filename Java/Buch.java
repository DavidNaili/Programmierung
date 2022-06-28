class Buch {
    String titel;
    String autor;
}

class BücherTestLauf{
    public static void main(String[]args){

        Buch [] meineBücher = new Buch[3];
        int x = 0;
        meineBücher[0] = new Buch();
        meineBücher[1] = new Buch();
        meineBücher[2] = new Buch();
        meineBücher[0].titel = "Die Früchte von Java";
        meineBücher[1].titel = "Der Java-Gatsby";
        meineBücher[2].titel = "Das Java-Kochbuch";
        meineBücher[0].autor = "Richard";
        meineBücher[1].autor = "Susanne";
        meineBücher[2].autor = "Ian";

        while (x < 3) {
            System.out.print(meineBücher[x].titel);
            System.out.print( " von ");
            System.out.println(meineBücher[x].autor);
            x = x + 1;
        }
    }
}
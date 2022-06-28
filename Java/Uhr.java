class Uhr {
    String zeit;

    void setZeit(String z){
        zeit = z;
    }

    String getZeit() {
        return zeit;
    }
}

class UhrTestlauf {
    public static void main (String[]args){
        Uhr u = new Uhr();

        u.setZeit("1245");
        String heute = u.getZeit();
        System.out.println("Zeit: " + heute);
    }
}
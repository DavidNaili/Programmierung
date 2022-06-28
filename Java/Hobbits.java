class Hobbits {
    String name;

    public static void main(String[]args){

        Hobbits [] h = new Hobbits[3];
        int z = -1;

        while (z < 2) {
            z = z + 1;
            h[z] = new Hobbits();
            h[z].name = "Bilbo Beutlin";
            if (z==1) {
                h[z].name = "Frodo Beutlin";
            }
            if (z==2) {
                h[z].name = "Sam Weiss Gamgee";
            }
            System.out.print(h[z].name + " ist ein ");
            System.out.println("guter Hobbit-Name");
        }
    }
}
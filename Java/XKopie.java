class XKopie {
    public static void main (String[]args){
        int orig = 42;
        XKopie x = new XKopie();
        int y = x.los(orig);
        System.out.println(orig + " " + y);
    }
    int los(int arg){
        arg = arg * 2;
        return arg;
    }
}
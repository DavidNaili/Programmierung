public class Schleifentest { 
  public static void main (String[] args) {

int x = 10;
System.out.println("Schleifentest");

while (x > 1){
      System.out.println("Innerhalb der Schleife");
      System.out.println("Der Wert von x ist " + x);
    x = x - 1;
  }
  System.out.println("Ausserhalb der Schleife!");
 }
} 
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Testdatengenerator {
    public static void main(String[] args) {
        printConventionally();
    }

    private static void printConventionally() {
        PrintWriter pWriter = null;
        String s = "/Users/david/OneDrive/Desktop/test.txt";
        try {
            pWriter = new PrintWriter(new FileWriter(s));
            pWriter.println("Hallo Welt!");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            if (pWriter != null) {
                pWriter.flush();
                pWriter.close();
            }
        }
    }
}
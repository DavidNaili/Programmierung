package TestDaten;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main{
public static void main(String[]args){
        File Testgenerator = new File("Test.txt");{

            try{
            FileWriter writer = new FileWriter(Testgenerator);
            writer.write("Hallo");
            writer.flush();
            } catch (IOException e){
            System.out.println("Die Datei konnte nicht bearbeitet werden :/");
            }
        }
    }
}
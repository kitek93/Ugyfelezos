package ugyfelezes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.management.Query;

public class AzonositoGeneralas {

    private static int ugyfelkezdet = (beolvasas() + 1);
    private static int szamlakezdet = 2000;

    public static int ugyfelidGeneralas() {

        return beiras(ugyfelkezdet++);

    }

    public static int szamlaidGeneralas() {

        return szamlakezdet++;

    }

    private static int beiras(int a) {

        BufferedWriter bw = null;

        try {
            String filePath = System.getProperty("user.dir");
            File file = new File(filePath + "/sajatfile.txt");

            FileWriter fw = new FileWriter(file);

            bw = new BufferedWriter(fw);
            bw.write(String.valueOf(a));

        } catch (IOException e) {
            System.out.println("ERROR: " + e);
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (Exception e) {
                System.out.println("BW close ERROR: " + e);
            }
        }
        return a;

    }

    private static int beolvasas() {

        String filePath = System.getProperty("user.dir");

        int i = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath + "/sajatfile.txt"))) {
            String strCurrentLine;

            while ((strCurrentLine = br.readLine()) != null) {

                i = Integer.parseInt(strCurrentLine);
            }
        } catch (IOException e) {

            System.out.println("ERROR: " + e);

        } 
        return i;
    }
}

package ugyfelezes;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AzonositoGeneralas {

    private static int ugyfelkezdet = 100;
    private static int szamlakezdet = 2000;

    public static int ugyfelidGeneralas() {

       int a=  ugyfelkezdet++;

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

    public static int szamlaidGeneralas() {

        return szamlakezdet++;

    }

}

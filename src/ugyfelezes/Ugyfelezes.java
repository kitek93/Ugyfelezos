package ugyfelezes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Ugyfelezes extends Ugyfel {

    public static void main(String[] args) {

        Ugyfel ugyfel1 = new Ugyfel();
        Ugyfel ugyfel2 = new Ugyfel();
        Ugyfel ugyfel3 = new Ugyfel();

        ugyfel1.setNev("Gizi");
        ugyfel2.setNev("János");
        ugyfel3.setNev("Klára");

        ugyfel1.getUgyfelSzamlai().add(new Szamla(13, "Villanyszámla", 6000, "11/02/2020"));
        ugyfel1.getUgyfelSzamlai().add(new Szamla(21213, "Gázszámla", 11000, "11/12/1998"));
        ugyfel1.getUgyfelSzamlai().add(new Szamla(2389, "Állatorvos", 29000, "21/02/2010"));
        ugyfel1.getUgyfelSzamlai().add(new Szamla(8213, "Kötelező bizotsítás", 30000, "13/03/2008"));
        ugyfel1.getUgyfelSzamlai().add(new Szamla(2978, "Hiteltörlesztés", 120000, "01/12/1993"));
        ugyfel1.getUgyfelSzamlai().add(new Szamla(613, "Parkolási bírásg", 58670, "04/05/2016"));
        ugyfel1.getUgyfelSzamlai().add(new Szamla(921113, "Vízszámla", 10000, "24/09/2000"));
        ugyfel1.getUgyfelSzamlai().add(new Szamla(17653, "Új ruha", 8970, "16/01/2019"));

        System.out.println("Rendezés előtt:");
        System.out.println(ugyfel1);

        System.out.println("Rendezés után, összeg szerint, compareto-val:");
        Collections.sort(ugyfel1.getUgyfelSzamlai());
        System.out.println(ugyfel1);

        System.out.println("Rendezés után, név szerint, comparator-ral");
        Collections.sort(ugyfel1.getUgyfelSzamlai(), new SortSzamlaByName());
        System.out.println(ugyfel1);

        System.out.println("Rendezés után, dátum szerint, comparator-ral");
        Collections.sort(ugyfel1.getUgyfelSzamlai(), new SortSzamlaByDate());
        System.out.println(ugyfel1);
    

    System.out.println("Rendezés után, számlaszám szerint, comparator-ral");
        Collections.sort(ugyfel1.getUgyfelSzamlai(), new SortbySzamlaID());
        System.out.println(ugyfel1);
    }
}


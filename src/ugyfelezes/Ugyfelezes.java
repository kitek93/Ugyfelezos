package ugyfelezes;

import java.util.Collections;

public class Ugyfelezes {

    public static void main(String[] args) {

        UgyfelFacatory ugyfelFacatory = new UgyfelFacatory();

        Ugyfel ugyfel1 = ugyfelFacatory.ugyfelGyartas("Gizi");
        Ugyfel ugyfel2 = ugyfelFacatory.ugyfelGyartas("János");
        Ugyfel ugyfel3 = ugyfelFacatory.ugyfelGyartas("Klára");

        ugyfel1.getUgyfelSzamlai().add(new Szamla("Villanyszámla", 6000, "11/02/2020"));
        ugyfel1.getUgyfelSzamlai().add(new Szamla("Gázszámla", 11000, "11/12/1998"));
        ugyfel1.getUgyfelSzamlai().add(new Szamla("Állatorvos", 29000, "21/02/2010"));
        ugyfel1.getUgyfelSzamlai().add(new Szamla("Kötelező bizotsítás", 30000, "13/03/2008"));
        ugyfel1.getUgyfelSzamlai().add(new Szamla("Hiteltörlesztés", 120000, "01/12/1993"));
        ugyfel1.getUgyfelSzamlai().add(new Szamla("Parkolási bírásg", 58670, "04/05/2016"));
        ugyfel1.getUgyfelSzamlai().add(new Szamla("Vízszámla", 10000, "24/09/2000"));
        ugyfel1.getUgyfelSzamlai().add(new Szamla("Új ruha", 8970, "16/01/2019"));

//        System.out.println("Rendezés előtt:");
//        System.out.println(ugyfel1);
//
//        System.out.println("Rendezés után, összeg szerint, compareto-val:");
//        Collections.sort(ugyfel1.getUgyfelSzamlai());
//        System.out.println(ugyfel1);
//
//        System.out.println("Rendezés után, név szerint, comparator-ral");
//        Collections.sort(ugyfel1.getUgyfelSzamlai(), new SortSzamlaByName());
//        System.out.println(ugyfel1);
//
//        System.out.println("Rendezés után, dátum szerint, comparator-ral");
//        Collections.sort(ugyfel1.getUgyfelSzamlai(), new SortSzamlaByDate());
//        System.out.println(ugyfel1);
//
//        System.out.println("Rendezés után, számlaszám szerint, comparator-ral");
//        Collections.sort(ugyfel1.getUgyfelSzamlai(), new SortbySzamlaID());
//        System.out.println(ugyfel1);
        System.out.println(ugyfel1);
        System.out.println(ugyfel2);
        System.out.println(ugyfel3);
        Ugyfel ugyfel4 = ugyfelFacatory.ugyfelGyartas("Juli");
        
        System.out.println(ugyfel4);

    }
}

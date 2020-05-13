package ugyfelezes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ugyfel {

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(this.id).append(" ").append(this.nev).append("\n");

        for (Szamla szamla : ugyfelSzamlai) {
            sb.append(szamla);
            sb.append("\n");
        }

        return sb.toString();
    }

    private static int kezdet = 100;

    private String nev;
    private int id;
    private List<Szamla> ugyfelSzamlai = new ArrayList<>();

    public Ugyfel() {

        this.id = kezdet++;
    }

    public List<Szamla> getUgyfelSzamlai() {
        return ugyfelSzamlai;
    }

    public int getId() {
        return id;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

}

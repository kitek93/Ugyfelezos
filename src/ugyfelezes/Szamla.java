package ugyfelezes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Szamla implements Comparable<Szamla> {

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(this.szamlaSzam).append(" ").append(this.szamlaMegnevezes)
                .append(" ").append(this.osszeg).append(" ").append(szamlaDatum);

        return sb.toString();
    }

    private int szamlaSzam;
    private String szamlaMegnevezes;
    private double osszeg;
    private Date szamlaDatum;

    public Szamla(int szamlaSzam, String szamlaMegnevezes, double osszeg, String szamlaDatum) {
        this.szamlaSzam = szamlaSzam;
        this.szamlaMegnevezes = szamlaMegnevezes;
        this.osszeg = osszeg;
        this.setSzamlaDatum(szamlaDatum);
    }

    public int getSzamlaSzam() {
        return szamlaSzam;
    }

    public void setSzamlaSzam(int szamlaSzam) {
        this.szamlaSzam = szamlaSzam;
    }

    public String getSzamlaMegnevezes() {
        return szamlaMegnevezes;
    }

    public void setSzamlaMegnevezes(String szamlaMegnevezes) {
        this.szamlaMegnevezes = szamlaMegnevezes;
    }

    public double getOsszeg() {
        return osszeg;
    }

    public void setOsszeg(double osszeg) {
        this.osszeg = osszeg;
    }

    public Date getSzamlaDatum() {
        return szamlaDatum;
    }

    public void setSzamlaDatum(String szamlaDatum) {
        try {
            this.szamlaDatum = new SimpleDateFormat("dd/MM/yyyy").parse(szamlaDatum);

        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }

    }

    @Override
    public int compareTo(Szamla o) {

        double kul = this.getOsszeg() - o.getOsszeg();
        int r;

        if (kul == 0) {
            r = 0;
        } else if (kul > 0) {
            r = 1;
        } else {
            r = -1;
        }
        return r;
    }

}

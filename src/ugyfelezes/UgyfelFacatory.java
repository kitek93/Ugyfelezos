package ugyfelezes;

public class UgyfelFacatory {

    public Ugyfel ugyfelGyartas(String nev) {

        return new Ugyfel(AzonositoGeneralas.ugyfelidGeneralas(), nev);
    }

}

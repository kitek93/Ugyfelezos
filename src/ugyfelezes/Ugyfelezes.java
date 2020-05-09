package ugyfelezes;

public class Ugyfelezes extends Ugyfel {
    
    public static void main(String[] args) {
        
        Ugyfel ugyfel1 = new Ugyfel();
        Ugyfel ugyfel2 = new Ugyfel();
        Ugyfel ugyfel3 = new Ugyfel();
        
        Szamla szamla1 = new Szamla();
        Szamla szamla2 = new Szamla();
        Szamla szamla3 = new Szamla();
        Szamla szamla4 = new Szamla();
        Szamla szamla5 = new Szamla();
        
        
        ugyfel1.setNev("Gizi");
        ugyfel2.setNev("János");
        ugyfel3.setNev("Klára");
        
        ugyfel1.setId(0);
        ugyfel2.setId(0);
        ugyfel3.setId(0);
        
        szamla1.setSzam(123);
        szamla2.setSzam(13455);
        szamla3.setSzam(23);
         szamla4.setSzam(21233);
          szamla5.setSzam(23);
        
        System.out.println(ugyfel1.getId() + " " + ugyfel1.getNev());
        System.out.println(ugyfel2.getId() + " " + ugyfel2.getNev());
        System.out.println(ugyfel3.getId() + " " + ugyfel3.getNev());
        
    }
    
}

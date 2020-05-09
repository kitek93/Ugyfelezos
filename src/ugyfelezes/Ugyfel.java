/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ugyfelezes;

/**
 *
 * @author User
 */
public class Ugyfel {

   

    private static int kezdet = 100;

    String nev;
      int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id+kezdet;
        kezdet++;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

  
}

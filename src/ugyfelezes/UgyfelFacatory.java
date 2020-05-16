/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ugyfelezes;

import com.sun.imageio.plugins.common.I18N;

/**
 *
 * @author User
 */
public class UgyfelFacatory implements IDgeneralas {

        private static int kezdet = 100;

    
    public Ugyfel ugyfelGyartas(String nev) {

        return new Ugyfel(idGeneralas(), nev);
    }

    @Override
    public int idGeneralas() {
        
        return kezdet++;
        
         }

}

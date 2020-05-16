/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ugyfelezes;

import java.util.Comparator;

/**
 *
 * @author User
 */
public class SortbySzamlaID implements Comparator<Szamla>{

    @Override
    public int compare(Szamla o1, Szamla o2) {
  
         return o1.getSzamlaSzam()-(o2.getSzamlaSzam());
  
 
    }
    
}

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
public class AzonositoGeneralas  {

   private static int ugyfelkezdet = 100;
      private static int szamlakezdet = 100;


    
    public static int ugyfelidGeneralas() {
        
        return ugyfelkezdet++;

    }
    
     public static int szamlaidGeneralas() {
        
        return szamlakezdet++;

    }

}

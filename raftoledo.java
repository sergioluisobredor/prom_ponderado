/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy;

import javax.swing.JOptionPane;

/**
 *
 * @author estudiante
 */
public class Easy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int i,n;
       n=Integer.parseInt(JOptionPane.showInputDialog("ingrese tamaño del arreglo"));
       int vect[]=new int[n];
       String cad="";
       
        for ( i = 0; i < n; i++) {
          vect[i]=Integer.parseInt(JOptionPane.showInputDialog("ingrese numero"));
        }
        
//        for ( i = n/2; i < n; i++) {
//            cad=cad+vect[i]+", ";
//        }
//        JOptionPane.showMessageDialog(null, "arreglo "+cad);
//        
//                for ( i = 0; i < n/2; i++) {
//            cad=cad+vect[i]+", ";
//        }
//        JOptionPane.showMessageDialog(null, "arreglo "+cad);
        
        
                for ( i = n/2; i < n; i++) {
            cad=cad+vect[i]+", ";
        }
        JOptionPane.showMessageDialog(null, "arreglo "+cad);
//        
//        for (i = 0; i < n; i=i+2) {
//            JOptionPane.showMessageDialog(null,"En la posicion par " +i +" esta el numero " +vect[i]);
//        } 
//        
//        for (i = 1; i < n; i=i+2) {
//            JOptionPane.showMessageDialog(null, "En la posicion Impar " +i +" esta el numero " +vect[i]);
//        }
//        
//        for (i = 0; i < n; i++) {
//            
//        }
        
    }
    
}

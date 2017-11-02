/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo1;

import javax.swing.JOptionPane;

/**
 *
 * @author estudiante
 */
public class Arreglo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, n;
        int vec[]=new int [8];
        String cad="";
        n=Integer.parseInt(JOptionPane.showInputDialog("ingresa tamaño"));
        for(i=0;i<n;i++){
            vec[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingresa Elem:" +i));
        }
        for(i=0;i<n;i++){
            if(vec[i]%2==0){
                JOptionPane.showMessageDialog(null,"Este Elem.es Par" + vec[i]);
            }
            else{
                JOptionPane.showMessageDialog(null,"Ingresa Elem.es impar " + vec[i]);
            }
        }
            
    }
    
}

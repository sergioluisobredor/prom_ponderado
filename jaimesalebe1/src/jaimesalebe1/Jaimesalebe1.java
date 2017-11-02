/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaimesalebe1;

import javax.swing.JOptionPane;

/**
 *
 * @author estudiante
 */
public class Jaimesalebe1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] num=new int[10];
        
        for(int i=0;i<10;i++){
           num[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese un numero para la posicion: "+i));
        }
        
        for(int i=9;i>=0;i--){
            
        JOptionPane.showMessageDialog(null, num[i]);
        }
    }
    
}


    
    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lolo;

/**
 *
 * @author ACER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        AVL árbol = new AVL (); 
        árbol.insertar(6); 
        árbol.insertar(3); 
        árbol.insertar(7); 
        árbol.visualizar(); 
    } 
    
    
}

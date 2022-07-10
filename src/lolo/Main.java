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
       	AVL bst = new AVL();
    	bst.insert(1);
    	bst.insert(2);
    	bst.insert(3);
    	bst.insert(4);
    	bst.insert(5);
    	bst.insert(6);
    	bst.insert(7);
    	bst.insert(8);
    	bst.prettyPrint();
	}
    
    
}

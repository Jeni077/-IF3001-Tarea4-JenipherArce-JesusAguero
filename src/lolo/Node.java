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
public class Node {
    int data; // holds the key
	Node parent; // pointer to the parent
	Node left; // pointer to left child
	Node right; // pointer to right child
	int bf; // balance factor of the node

	public Node(int data) {
		this.data = data;
		this.parent = null;
		this.left = null;
		this.right = null;
		this.bf = 0;
	
    }
}

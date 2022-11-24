/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binarytree;

import java.util.Scanner;

/**
 *
 * @author terer
 */
public class BinaryTreeTester {

    /**
     * @param args the command line arguments
     */
    public BinaryTreeTester(){
        Scanner scan = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        System.out.println("Enter positive integers");
        int next;
        do{
            next = scan.nextInt();
            if(next == -1)
                break;
            else
                tree.insert(next);
        }while(next != -1);
        
        System.out.println("Inorder --> 1, preorder --> 2, postorder -->3, Stop --> 4");
        char choice = scan.next().charAt(0);
        
        while (choice != '4'){
            if (choice == '1'){
                tree.inOrderTraversal();
            }else if (choice == '2'){
                tree.preOrderTraversal();
            }else if (choice == '3'){
                tree.postOrderTraversal();
            }
            System.out.println("\nInorder --> 1, preorder --> 2, postorder -->3, Stop --> 4");
            choice = scan.next().charAt(0);
        }
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        new BinaryTreeTester();
    }
    
}

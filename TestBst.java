/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class TestBst {
    public static void main(String[] args) {
        int [] array = {7,5,3,4,8};
        BST myTree = new BST();
        for(Integer x: array){
            myTree.insert(x);
        }
        myTree.inOrder();
        System.out.println("");
        myTree.printPath(19);
    }
    
}

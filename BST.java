/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
import java.util.*;
public class BST {
    // inner class
    private class TreeNode{
        private int data;
        private TreeNode leftChild;
        private TreeNode rightChild;   
        public TreeNode(int data){
            this.data = data;
        }
    }
    // root node
    private TreeNode root;
    public BST(){};
    // access for client
    public void insert(int data){
        root = insert(root,data);
    }
    // real implementation
    private TreeNode insert(TreeNode root, int data){
        if(root == null){
            return new TreeNode(data);
        }
        else if(root.data > data){
            root.leftChild = insert(root.leftChild, data);
        }
        else if(root.data < data){
            root.rightChild = insert(root.rightChild, data);
        }
        else{
        }
        return root;
    }
    // access for client
    public void printPath(int target){
        Stack<Integer> path = new Stack();
        printPath(root,target,path);   
    }
    // real implementation 
    private void printPath(TreeNode root, int target, Stack<Integer> path){
        if(root != null){
            path.add(root.data);
            if(isLeaf(root)){
                if(target-root.data == 0){
                    print(path);
                }
            }
            printPath(root.leftChild,target-root.data,path);
            printPath(root.rightChild,target-root.data,path);
            path.pop();     
        }
    }
    // see if leaf
    private boolean isLeaf(TreeNode root){
        return (root.leftChild == null && root.rightChild == null);
    }
    // function to print path
    private void print(Stack<Integer> path){
        Iterator <Integer> it = path.iterator();
        System.out.print("[");
        while(it.hasNext()){
            System.out.print(it.next()+" ,");
        }
        System.out.print("]");
        System.out.println("");
    }
    public void inOrder(){
        inOrder(root);
    }
    private void inOrder(TreeNode root){
        if(root != null){
            inOrder(root.leftChild);
            System.out.print(root.data +" ");
            inOrder(root.rightChild);
        }
       // System.out.println("");
    }
}

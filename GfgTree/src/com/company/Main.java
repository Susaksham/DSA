package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Node root = new Node(10);
//
//
//        Node node1 = new Node(20);
//
//        Node node2 = new Node(8);
//        Node node3 = new Node(7);
//        Node node4 = new Node(9);
//        Node node5 = new Node(15);
//        Node node6 = new  Node(30);
//        Node node7 = new Node(6);
//
//        root.left  = node1;
//        root.right = node6;
//        node1.left = node2;
//        node1.right = node3;
//        node3.left = node4;
//        node3.right = node5;
//        node6.right = node7;

        Node root = new Node(10);
        Node node1 = new Node(20);
        Node node2 = new Node(30);
        Node node3 = new Node(40);
        Node node4 = new Node(50);
        Node node5 = new Node(60);
        Node node6 = new Node(70);
        Node node7 = new Node(80);
        Node node8 = new Node(90);

        root.left = node1;

        root.right = node2;
        node2.left = node3;
        node2.right = node4;
        node1.left = node5;
        node5.left = node6;
        node6.left = node7;
        node7.left = node8;
       leftViewOfTree(root);
       leftViewOfTree2(root , 1);
    }
    static int maxLevel = 0;
    public static void leftViewOfTree2(Node root , int level){
        if(root == null){
            return;
        }
        if( maxLevel < level){
            System.out.println(root.data);
            maxLevel = level;
        }
        leftViewOfTree2(root.left , level + 1);
        leftViewOfTree2(root.right , level + 1);
    }
    public static void leftViewOfTree(Node root){
        if(root == null){
            return;
        }
        if(root.left != null){
            System.out.println(root.left.data);
        }
        leftViewOfTree(root.left);
        leftViewOfTree(root.right);
    }
    public static void inorderTraversal(Node root){
        if(root == null){
            return;
        }
        inorderTraversal(root.left);
        System.out.println(root.data);
        inorderTraversal(root.right);
    }
    public static void preorderTraversal(Node root){
        if(root == null){
            return;
        }
        System.out.println(root.data);
        preorderTraversal(root.left);

        preorderTraversal(root.right);
    }
    public static void postorderTraversal(Node root){
        if(root == null){
            return;
        }
        postorderTraversal(root.left);

        postorderTraversal(root.right);
        System.out.println(root.data);
    }
}
class Node{
    Node left ;
    Node right ;
    int data ;

    Node(int data){
        this.data = data;
    }
}

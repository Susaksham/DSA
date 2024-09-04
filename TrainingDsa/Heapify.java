public class Heapify {
    public static void main(String[] args) {
        Node3[] arr = new Node3[6];
    }
    public static void heapify(Node3 node , int i , Node3[] arr){
        if(node == null){
            return;
        }
       Node3  left =  arr[2*i];
        Node3 right = arr[2*i + 1];
        if(node.data < left.data){
            
        }
    }
}

class Node3{
    int data;
    Node3 left;
    Node3 right;
    Node3 (int element){
        this.data = element;
    }
}
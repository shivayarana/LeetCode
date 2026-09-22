import java.util.LinkedList;
import java.util.Stack;
public class AlterList {
    private class Node{
        Node next;
        int data;
        Node(int data){
            this.data = data;
        }
    }
    private Node head;

    public void add(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public void display(){
        Node node =  head;
        while(node != null){
            System.out.print(node.data+" ");
            node = node.next;
        }
    }

/**
 * 
 */
public void alter(){
         LinkedList<Node> stack = new LinkedList<>();
        Node node = head;
        while(node != null){
           stack.push(node);
          
           node = node.next;
        }
    Node tail = new Node(-1);
    node = head;
    Node tos = stack.pop();

    while(node != tos && node.next != tos){
     
        tail.next = node;
        tail = tail.next;
        node = node.next;
        
        tail.next = tos;
        tail = tail.next;
        tos = stack.pop();
    }

    if(node == tos){
        tail.next = node;
        node.next = null;
    }

    if(node.next == tos){
        tail.next = tos;
        tail.next.next = node;
        node.next = null;}
    
    
    

}
public static void main(String[] args) {
    AlterList list = new AlterList();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.display();
    System.out.println();
    list.alter();
    list.display();
    System.out.println();
}
}

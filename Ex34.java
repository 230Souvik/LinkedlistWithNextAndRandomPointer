
package ex34;
  import java.io.*;

public class Ex34 {

  

static class Node {
  int val;
  Node next;
  Node arbit;
 
  // Constructor
  Node(int x)
  {
    this.val = x;
    this.next = null;
    this.arbit = null;
  }
}
static Node head;
static void printList(Node head)
  {
    System.out.print(head.val + "(" + head.arbit.val
                     + ")");
    head = head.next;
    while (head != null) {
      System.out.print(" -> " + head.val + "("
                       + head.arbit.val + ")");
      head = head.next;
    }
    System.out.println();
  }
 public static Node cloneLinkedList(Node head){
     if(head==null)
         return null;
     Node cur=head;
     while(cur !=null){
         Node temp=new Node(cur.val);
         temp.next=cur.next;         
         cur.next=temp;
         cur=temp.next;
     }
     cur=head;
     while(cur!=null){
         if(cur.arbit!= null){
             cur.next.arbit=cur.arbit.next;
         }
         cur=cur.next.next;
     }
     cur=head;
     Node clonedHead = head.next;
     Node clonedCurr = clonedHead;
        while (clonedCurr.next != null) {
            cur.next = cur.next.next;
            clonedCurr.next = clonedCurr.next.next;
            cur = cur.next;
            clonedCurr = clonedCurr.next;
        }
        cur.next = null;
        clonedCurr.next = null;
 
        return clonedHead;
    }
   
 
    public static void main(String[] args) {
        // TODO code application logic here
        Node head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = new Node(4);
    head.next.next.next.next = new Node(5);
    head.arbit = head.next.next;
    head.next.arbit = head;
    head.next.next.arbit = head.next.next.next.next;
    head.next.next.next.arbit = head.next.next;
    head.next.next.next.next.arbit = head.next;
 
    // Print the original list
    System.out.println("The original linked list:");
    printList(head);
    Node sol = cloneLinkedList(head);
 
    System.out.println("The cloned linked list:");
    printList(sol);
    }
    
}

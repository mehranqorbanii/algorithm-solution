<<<<<<< HEAD
// Source :
// http://www.javaworld.com/article/2073526/core-java/datastructures-and-algorithms-part-2.html

=======
>>>>>>> origin/master
class SinglyLinkedListDelete {

    static class Node {
      String name;
      Node next;
    }

    public static void main (String [] args) {
      // Build Singly Linked List
      Node top = new Node ();
      top.name = "C";
      top.next = null;

      Node temp = new Node ();
      temp.name = "D";
      temp.next = top;
      top = temp;

      temp = new Node ();
      temp.name = "A";
      temp.next = top;
      top = temp;

      temp = new Node ();
      temp.name = "B";
      temp.next = top;
      top = temp;
      dump ("Initial singly-linked list : ", top);
      // End Build

      // 1. Delete the first node
      top = top.next;
      dump ("After first node deletion : ", top);

      // Put back B
      temp = new Node ();
      temp.name = "B";
      temp.next = top;
      top = temp;
      dump ("Put back B : ", top);

      // 2. Delete any node but the first node
      temp = top;
      while (temp.name.equals ("A") == false)
         temp = temp.next;
      temp.next = temp.next.next;
      dump ("After D node deletion", top);
    }

    static void dump (String msg, Node topNode) {
      System.out.print (msg + " ");
      while (topNode != null)
      {
         System.out.print (topNode.name + " ");
         topNode = topNode.next;
      }
      System.out.println ();
    }
}

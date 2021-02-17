import java.util.*; 
/*
* Things to consider: implement a tail pointer to make insert and delete at beginning/end easier
*/
class DoublyLinkedList extends DoublyNode
{
    DoublyNode head;
    
    DoublyLinkedList()
    {
        head = null;
    }
    
    DoublyLinkedList(int val)
    {
        head = new DoublyNode(val);
    }

    void addNode(int value) 
    {  
        // List is empty so create a single node furst 
        if (head == null) {  
            DoublyNode new_node = new DoublyNode();  
            new_node.data = value;  
            new_node.next = new_node.prev = new_node;  
            head = new_node;  
            return;  
        }  
        
        DoublyNode iterator = head;
        while(iterator.next != null) //getting the last node
        {
            iterator = iterator.next;
        }
        
        DoublyNode newNode = new DoublyNode(value);
        iterator.next = newNode;
        newNode.prev = iterator;
        newNode.next = null;
        
    }  

    void removeNode(int val)
    {
        DoublyNode iterator = head;
        while(iterator != null)
        {
            //remove first elt
            if (iterator.data == val && iterator == head)
            {
                head = head.next;
                head.prev = null;
                return;
            }
            //remove last elt
            if (iterator.data == val && iterator.next == null)
            {
                iterator.prev.next = null;
                return;
            }
            if (iterator.data == val && iterator.next != null)
            {

                iterator.prev.next = iterator.next;
                iterator.next.prev = iterator.prev;
                return;
            }
            iterator = iterator.next;
        }
    }

    void printNodes()   
    {  
        DoublyNode temp = head;  
        //traverse in forward direction starting from head to print the list
        while (temp != null)  
        {  
            if(temp.next != null)
                System.out.print(temp.data + "->");  
            else
                System.out.println(temp.data);  
            temp = temp.next;  
        }  

    }  
   
    public static void main(String[] args)  
    {  
        //the empty list 
        DoublyLinkedList doubleList = new DoublyLinkedList(10);  
   
        // add nodes to the list  
        doubleList.addNode(40);  
        doubleList.addNode(50);  
        doubleList.addNode(60);  
        doubleList.addNode(70);  
        doubleList.addNode(80);  
   
        //print the list
        System.out.println("Circular doubly linked list: ");  
        doubleList.printNodes();  

        System.out.println("Remove 10 (doesn't exist)");
        doubleList.removeNode(10);
        doubleList.printNodes();  

        System.out.println("Remove 60");
        doubleList.removeNode(60);
        doubleList.printNodes();  

        System.out.println("Remove 40");
        doubleList.removeNode(40);
        doubleList.printNodes(); 

        System.out.println("Remove 80");
        doubleList.removeNode(80);
        doubleList.printNodes(); 


    } 
}  
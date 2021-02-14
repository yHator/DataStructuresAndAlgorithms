import java.util.*;

class SingularlyLinkedList extends Node{ //extended so LL can access private vars
	
	Node head; 

	SingularlyLinkedList()
    {
        head = null;
    }

    SingularlyLinkedList(int headVal)
    {
        head = new Node(headVal);
    }

    /* length()
    * return: number of nodes
    */
    int length()
	{
		Node traverse = head;
		int n = 1;
		if(traverse == null)
			return 0;
		else
		{
		 while(traverse!=null)
			{	traverse = traverse.next;
				n++;
			}
		}
		return n;
	}

    /* insertBegin(int inVal, Node head)
    * inserts a new node by making the head point to the new obj
    * 2 cases:
    * linked list is empty, and you can insert as the head
    *linked list is full, change the links around it
    */

	void insertBegin(int key)
	{
		Node temp = new Node(key);
		
		if(head == null)
			head = temp;
		
		else
		{
            temp.next = head;
            head = temp;
		}
	}
	
	/* insertEnd(int inVal)
    * inserts a new node by making the head point to the new obj
    * 2 cases:
    * linked list is empty, and you can insert at the end
    *linked list is full, change the links around it
    */

	void insertInEnd(int key)
	{
		Node newNode = new Node(key);
		Node traverse = head;
		
		if(head == null)
			head = newNode;
		else
		{
			while(traverse.next!=null)
            {
                traverse= traverse.next;
            }
			traverse.next = newNode; 
		}
	}

    /* insertAtPos(int inVal)
    * inserts a new node at specific spot
    * 2 cases:
    * linked list is empty, and you can insert at the end
    *linked list is full, change the links around it
    *returns: head node to linked list
    */

	void insertAtPos(int key, int pos)
	{
		Node newNode = new Node(key);

        if (pos <= length() &&  pos > 0)
        {
            Node traverse = head;
            if(pos == 1)
            {
                newNode.next = head;
                head = newNode;
            }
            else
            {
                int loop = 1;
                while(loop < pos - 1)
                {
                    traverse = traverse.next;
                }
                newNode.next = traverse.next;
                traverse.next = newNode;
            }
        }
	}
	
    /* delete(int inVal)
    * deletes a new node at specific spot
    * 2 cases:
    * linked list is empty, and you can delete head
    *linked list is full, change the links around it, then remove
    */
	
	void delete(int pos)
	{
        if (pos <= length() &&  pos > 0)
        {
            Node traverse = head;
            if(pos==1)
                head = traverse.next;
            else
            {
                int loop = 1;
                while(loop < pos - 1)
                {
                    traverse = traverse.next;
                }
                traverse.next = traverse.next.next;
            }
        }
	}
	
	/* reverse()
    * deletes a new node at specific spot
    * 2 cases:
    * linked list is empty, and you can delete head
    *linked list is full, change the links around it, then remove
    */
	void reverse()
	{
		Node prevNode=null, curNode=head, nextNode=null;
        
		while(curNode!=null)
		{
			nextNode=curNode.next;
			curNode.next=prevNode;
			
			prevNode=curNode;
			curNode=nextNode;
		}
		
		head=prevLNode;
	}
	
	
	void display()
	{
		Node traverse = head;
		while(traverse != null)
        {
            if(traverse.next == null)
			{    
                System.out.print(traverse.data);  
			}
            else
                System.out.print(traverse.data+" -> ");  
            traverse = traverse.next;
        }
        System.out.println();
	}
	
	public static void main(String[] args)
	{
		SingularlyLinkedList list = new SingularlyLinkedList();
       
		Scanner in =new Scanner(System.in);
		do
	    {
            System.out.println("\n********* MENU *********");
            System.out.println("\n1.Insert In End");
            System.out.println("\n2.Insert In Beg");
            System.out.println("\n3.Insert At A  Particular Pos");
            System.out.println("\n4.Delete At a Pos");
            System.out.println("\n5.Length");
            System.out.println("\n6.Reverse");
            System.out.println("\n7.Display");
            System.out.println("\n8.EXIT");
            System.out.println("\nenter ur choice : ");
	        int n=in.nextInt();
	    
        switch(n)
		{
            case 1: 
                System.out.println("\nenter the value ");
			    list.insertInEnd(in.nextInt());
                list.display();
			    break;
		 case 2: 
                System.out.println("\nenter the value");
			    list.insertBegin(in.nextInt());
                list.display();
			    break;
		 case 3: 
            System.out.println("\nenter the value");
			list.insertAtPos(in.nextInt(), in.nextInt());
            list.display();
			break;
		 case 4: 
			 list.delete(in.nextInt());
             list.display();
			 break;
		 case 5: 
			System.out.println(list.length());
			 break;
		 case 6: 
			list.reverse();
            list.display();
			break;
		 case 7: 
			list.display();
		 	 break;
		 case 8: 
            System.exit(0);
		 	break;
		 default: 
            System.out.println("\n Not a choice!");
		 	break;
		}

	    } while(true);
    }
}

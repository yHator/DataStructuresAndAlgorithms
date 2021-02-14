class Node{

	int data;
	Node next;
	
	//making default constructor so subclass doesn't have to call super
	Node()
	{
		this.next = null;
	}
	Node(int data)
	{
		this.data=data;
		this.next=null;
		
	}
}

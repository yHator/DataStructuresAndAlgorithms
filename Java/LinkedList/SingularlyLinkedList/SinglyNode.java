class SinglyNode{

	int data;
	SinglyNode next;
	
	//making default constructor so subclass doesn't have to call super
	SinglyNode()
	{
		this.next = null;
	}
	SinglyNode(int data)
	{
		this.data=data;
		this.next=null;
		
	}
}

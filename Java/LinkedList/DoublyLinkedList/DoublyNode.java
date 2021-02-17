class DoublyNode{

	int data;
	DoublyNode next;
    DoublyNode prev;
	
	//making default constructor so subclass doesn't have to call super
	DoublyNode()
	{
		this.next = null;
        this.prev = null;
	}
	DoublyNode(int data)
	{
		this.data=data;
		this.next=null;
        this.prev = null;
		
	}
}
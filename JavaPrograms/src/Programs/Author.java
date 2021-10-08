package Programs;
public class Author {
	Node10 head;
	int index = 1;
	public static void addElements(Author list,int id, String bookName, int noOfBooks)
	{
		Node10 new_node = new Node10( id,  bookName, noOfBooks);
		if(list.head==null)
		{
			list.head = new_node;
		}
		else
		{
			Node10 curr = list.head;
			while(curr.next!=null)
			{
				curr=curr.next;
				} 
			curr.next=new_node;
			}
			
		}
	public void remove(Author list, int id,String bookName,int noOfBooks)
	{
	if(list.head==null)
	System.out.println("Empty..");
	else
	{

	Node10 curr=list.head;
	Node10 curr2=curr.next;
	if(curr.id==id)
	{
	Node10 temp=list.head;
	list.head=list.head.next;
	temp=null;

	 }
	else
	{
	while(curr2.next!=null)
	{
	if(curr2.id==id)
	{
	curr.next=curr2.next;
	curr2=null;
	break;
	}
	curr=curr2;
	curr2=curr2.next;
	}
	}

	 }
	}
public void addInMiddle(Node10 list,int id,String bookName ,int noOfBooks)
	{
	if(list==null)
	{
	System.out.println("empty");
	return;
	}
	Node10 author =new Node10(id,bookName, noOfBooks);
	author.next=list.next;
	list.next=author;
	author.prev=list;
	if(author.next!=null)
	author.next.prev=author;
	}
	public void find(Author list, int id)
	{
	if(list.head==null)
	System.out.println("Empty");
	else if(list.head.getId()==id)
	System.out.println(list.head);
	else
	{
	Node10 curr=list.head;
	while(curr.next!=null)
	{
	if(curr.getId()==id)
	{
	System.out.println(curr);
	return;
	}
	curr=curr.next;
	}
	}
	}
	public  static void printList(Author list)
	{
		Node10 curr=list.head; 
		System.out.println("\n LinkedList: "); 
		while(curr!=null)
		{
			System.out.print("\n"+curr.id+" -->  "+curr.bookName+" ---> "+curr.noOfBooks);
			curr=curr.next;
			}
	}
	public void removeAtMiddle(int position,Author newNode)
    {
       
       Node10 temp=head;
        if(position==1)
        {
            head.next.prev=null;
            head=head.next;
            temp.next=null;
            }
        else
        {
            int count=1;
            Node10 previous=head;
            while(count<position-1)
            {
                previous=previous.next;
                count++;
            }
            Node10 current=previous.next;
            previous.next=current.next;
            current.prev=previous.next;
           
        }
    }
	public static void main(String[]args)
	{
		Author list = new Author();
		list.addElements(list, 1,"Java Book", 5);
		list.addElements(list, 2,"C Book", 10);
		list.addElements(list, 3,"AWS Book", 15);
		list.addElements(list, 4,"Python Book", 20);
		list.addElements(list, 5,"DS Book", 25);
		printList(list);
		System.out.println("\n\nAddElements to the list");
		list.addElements(list,6,"ML Book",30);
		printList(list);
		System.out.println("\n\nRemove element from list");
		list.remove(list, 2,"C Book", 10);
		printList(list);
		System.out.println("\n\n Remove at middle");
		list.removeAtMiddle(3, list);
		printList(list);
		System.out.println("\n\n Find the Element");
		list.find(list, 3);
		System.out.println("\n\nAdd ELement in middle");
		list.addInMiddle(list.head.next, 7, "DotNet Book", 35);
		printList(list);
		
		
	}

}
	
	
		
class Node10
{
	int id;
	String bookName;
	int noOfBooks;
	Node10 next = null;
	Node10 prev = null;
	public Node10(int id, String bookName, int noOfBooks) {
		
		this.id = id;
		this.bookName = bookName;
		this.noOfBooks = noOfBooks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	@Override
	public String toString() {
		return "Node [id=" + id + ", bookName=" + bookName + ", noOfBooks=" + noOfBooks + "]";
	}
	
	
}
		



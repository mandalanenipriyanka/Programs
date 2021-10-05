package Programs;
public class AddElements
{
	Node head;
	public static AddElements insert(AddElements list,int data)
	{
		Node n = new Node(data);
		n.next = null;
		if(list.head == null)
		{
			list.head = n;
		}
		else
		{
			Node trav = list.head;
			while(trav.next!=null)
			{
				trav = trav.next;
			}
			trav.next = n;
		}
		return list;
	}
	public static void printList(AddElements list)
	{
		Node curr = list.head;
		System.out.println("\n Linked List : ");
		while(curr!=null)
		{
			System.out.println(curr.data+"---->");
			curr = curr.next;
		}
	}
	public static AddElements insertMiddle(AddElements list,int data,int index)
	{
		Node n = new Node(data);
		n.next = null;
		Node p1;
		int i = 1;
		if(list.head!=null)
		{
			p1 = list.head;
			while(p1.next!=null)
			{
				if(i==index-1)
				{
					n.next = p1.next;
					p1.next = n;
					break;
					
				}
				p1 = p1.next;
				i++;
			}
		}
		else
			System.out.println("List is Empty");
		return list;
	}
	public static AddElements remove(AddElements list,int data)
	{
		System.out.println("In Remove method");
		if(list.head == null)
			System.out.println("The list is empty");
		else
		{
			Node curr = list.head;
			Node curr2 = curr.next;
			while(curr2.next!=null)
			{
				if(curr2.data == data)
				{
					System.out.println(curr2.data+ " --->"+data);
					Node temp = curr2;
					curr.next = curr2.next;
					temp = null;
					break;
				}
			}
			curr = curr2;
			curr2 = curr2.next;
		}
		return list;
	}
	public static void main(String[] args) {
		AddElements list = new AddElements();
		list.insert(list, 12);
		list.insert(list, 22);
		list.insert(list, 18);
		list.insert(list, 128);
		list.insert(list, 108);
		printList(list);
		list.insertMiddle(list, 23, 3);
		printList(list);
	}


}
class Node
{
	int data;
	Node next;
	public Node(int data) {
		this.data = data;
	}
}
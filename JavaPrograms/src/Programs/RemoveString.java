package Programs;

public class RemoveString {
	Point head;
	public static RemoveString insert(RemoveString list,String data)
	{
	Point new_node = new Point(data);
	new_node.next = null;
	if(list.head == null)
	{
	list.head = new_node;
	}
	else
	{
	Point trav = list.head;
	while(trav.next!=null)
	{
	trav = trav.next;
	}
	trav.next = new_node;
	}
	return list;
	}
	public static void printList(RemoveString list)
	{
	Point curr = list.head;
	System.out.println("\nLinkedList :");
	while(curr!=null)
	{
	System.out.print(curr.data+"---> ");
	curr=curr.next;
	}
	}
	public static RemoveString remove(RemoveString list,String data)
	{
	System.out.println(" In Remove method");
	if(list.head == null)
	System.out.println("The list is empty");
	else
	{
	Point curr = list.head;
	Point curr2 = curr.next;
	while(curr2.next!=null)
	{
	if(curr2.data == data)
	{
	System.out.println(curr2.data+ " == " +data);
	Point temp = curr2;
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
	RemoveString list = new RemoveString();
	list.insert(list, "apple");
	list.insert(list, "bat");
	list.insert(list, "cat");
	list.insert(list, "dog");
	list.insert(list, "cow");
	printList(list);
	System.out.println("\nremove string is");
	list.remove(list,"bat");
	printList(list);
	}
	}
	class Point
	{
	String data;
	Point next;
	public Point(String data)
	{
	this.data = data;
	}
	}



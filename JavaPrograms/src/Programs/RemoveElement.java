package Programs;

public class RemoveElement {
	
		Delete head;
		public static RemoveElement insert(RemoveElement list,int data)
		{
		Delete new_node = new Delete(data);
		new_node.next = null;
		if(list.head == null)
		{
		list.head = new_node;
		}
		else
		{
		Delete trav = list.head;
		while(trav.next!=null)
		{
		trav = trav.next;
		}
		trav.next = new_node;
		}
		return list;
		}
		public static void printList(RemoveElement list)
		{
		Delete curr = list.head;
		System.out.println("\nLinkedList :");
		while(curr!=null)
		{
		System.out.print(curr.data+"---> ");
		curr=curr.next;
		}
		}
		public static RemoveElement remove(RemoveElement list,int data)
		{
		System.out.println(" In Remove method");
		if(list.head == null)
		System.out.println("The list is empty");
		else
		{
		Delete curr = list.head;
		Delete curr2 = curr.next;
		while(curr2.next!=null)
		{
		if(curr2.data == data)
		{
		System.out.println(curr2.data+ " == " +data);
		Delete temp = curr2;
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
		RemoveElement list = new RemoveElement();
		list.insert(list, 31);
		list.insert(list, 23);
		list.insert(list, 73);
		list.insert(list, 46);
		list.insert(list, 56);
		printList(list);
		list.remove(list,23);
		printList(list);
		}
		}
		class Delete
		{
		int data;
		Delete next;
		public Delete(int data)
		{
		this.data = data;
		}
		}



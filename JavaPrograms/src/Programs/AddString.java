package Programs;

public class AddString {
	
		Add head;
		public static AddString insert(AddString list,String data)
		{
		Add new_node = new Add(data);
		new_node.next = null;
		if(list.head == null)
		{
		list.head = new_node;
		}
		else
		{
		Add trav = list.head;
		while(trav.next!=null)
		{
		trav = trav.next;
		}
		trav.next = new_node;
		}
		return list;
		}
		public static void printList(AddString list)
		{
		Add curr = list.head;
		System.out.println("\nLinkedList :");
		while(curr!=null)
		{
		System.out.print(curr.data+"---> ");
		curr=curr.next;
		}
		}
		public static AddString insertStringMiddle(AddString list,String string,int index)
		{
		Add new_node = new Add(string);
		new_node .next = null;
		Add p1;
		int i = 1;
		if(list.head!=null)
		{
		p1 = list.head;
		while(p1.next!=null)
		{
		if(i==index-1)
		{
		new_node.next = p1.next;
		p1.next= new_node;
		break;
		}
		p1=p1.next;
		i++;
		}
		}
		else
		System.out.println("List empty");
		return list;
		}

		public static void main(String[] args) {
		AddString list = new AddString();
		list.insert(list, "apple");
		list.insert(list, "bat");
		list.insert(list, "cat");
		list.insert(list, "dog");
		list.insert(list, "cow");
		printList(list);
		System.out.println("\nAdded String is");
		list.insertStringMiddle(list,"bag",3);
		printList(list);

		 }

		}
		class Add
		{
		String data;
		Add next;
		public Add(String data)
		{
		this.data = data;
		}
		}



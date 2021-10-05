package Programs;

import com.peopletech.Student;

public class DoublyLinkedList {
	Student head;
	 static int size = 0;
	public static void add(DoublyLinkedList list,Student newStudent)
	{
		if(list.head == null)
		list.head = newStudent;
		else
		{
			Student curr = list.head;
			while(curr.next!=null)
				curr = curr.next;
				curr.next = newStudent;
				newStudent.prev = curr;
				
		}
		size++;
	}
	public static Student get(DoublyLinkedList list,int index)
	{
		Student s = null;
		if(index>size)
			System.out.println("in valid index");
		else
		{
			int temp = 0;
			s=list.head;
			while(s.next!=null)
			{
				s=s.next;
				temp++;
				break;
			}
			s=s.next;
			index++;
		}
		return s;
	}

	public static void printList(DoublyLinkedList list)
    {
        Student curr=list.head;
        if(list.head==null)
            System.out.println("List is Empty...");
        else
        {
        	
            while(curr!=null)
            {
                System.out.print(curr+" <-> ");
                curr=curr.next;
            }
            
        }
        System.out.print("\nList in reverse order\n");
        Student s=get(list,size);
        while(s!=null)
        {
            System.out.print(s+" <-> ");
            s=s.prev;
        }    
    }
	public static void addFrist(DoublyLinkedList list,Student newStudent)
	{
		if(list.head == null)
			list.head = newStudent;
		else
		{
			newStudent.next = list.head;
			list.head.prev = newStudent;
			list.head = newStudent;
		}
		size++;
	}
	public static void remove(DoublyLinkedList list,Student s)
	{
		if(list.head == null)
			System.out.println("list is empty");
		else
		{
			Student curr = list.head;
			while(curr.next!=null)
			{
				if(curr.equals(s))
					curr.prev.next = curr.next;
				curr.next.prev = curr.prev;
				curr = null;
				break;
			}
			//curr = curr.next;
		}
	}
	public static void addElement(DoublyLinkedList list,Student s)
	{
		if(list.head == null)
			System.out.println("list is empty");
		else
		{
			Student curr = list.head;
			while(curr.next!=null)
			{
				if(curr.equals(s))
				{
					
					s.next = curr.next;
					s.prev = curr;
					curr.next = s;
					curr = null;
					break;
					
					
				}
				curr = curr.next;
        
        		
        	}
		}
	}

	public static void main(String[] args) {
		DoublyLinkedList list=new DoublyLinkedList();
        list.add(list, new Student(12,"ABCD","CS"));
        list.add(list, new Student(34,"EFGH","IT"));
        list.add(list, new Student(71,"IJKL","EEE"));
        list.add(list, new Student(62,"MNOP","ECE")); 
        list.addFrist(list, new  Student(86,"pqrs","CS"));
        
        printList(list);
        System.out.println("\nElement at index 2 : "+get(list,2));
        list.addFrist(list, new Student(8,"Varsha","Mech"));
        printList(list); 
        //list.remove(list, new Student(86,"pqrs","cs"));
        printList(list);
        list.addElement(list, new Student(32, "XYZ", "CSE"));
        printList(list);}
	

}

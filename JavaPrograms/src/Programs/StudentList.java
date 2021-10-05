package Programs;

public class StudentList {
	static Student head;//denotes start of linked list
	//adding new Student as last element of singly linked list
	public static void add(StudentList list,Student newStudent)
	{
		if(list.head == null)
			list.head = newStudent;
			//System.out.println("Given list is empty");
		else
		{
		   Student trav = list.head;
		   while(trav.next!=null)
			   trav = trav.next;
		   trav.next = newStudent;
		}
		
	}
	public static void printList(StudentList list)
	{
		Student trav;
		if(list.head == null)
		{
			System.out.println("The list is empty");
			
		}
		else
		{
			trav = list.head;
			while(trav!=null)
			{
				System.out.println(trav+" --->");
				trav = trav.next;
			}
		}
	}
	public static void findList(StudentList list,int rollno)
	{
		if(list.head == null)
			System.out.println("The list is empty");
		else if(list.head.getRollno()==rollno)
		
			System.out.println(list.head);
			else
			{
				Student curr = list.head;
				while(curr.next!=null)
				{
					if(curr.getRollno()==rollno)
					{
						System.out.println(curr);
						break;
					}
					curr = curr.next;
				}
			}
		
			
		
	}
	
	public static boolean getAdd(StudentList list,Student newStudent)
	{
		if(list.head == null)
			list.head = newStudent;
		else
		{
			newStudent.next = list.head;
			list.head = newStudent;
		}
		return false;
		
	}
	public static void remove(StudentList list, Student s)
	{
		if(list.head == null)
			System.out.println("LIst is empty");
		else if(list.head.getRollno()==s.getRollno())
		{
			Student temp = list.head;
			list.head = list.head.next;
			temp = null;
		}
		else
		{
			Student curr = list.head;
			Student curr1=curr.next;
			while(curr.next!=null)
			{
				if(curr.getRollno()==s.getRollno())
				{
					curr.next = curr1.next;
					curr1 = null;
					break;
				}
				curr = curr1;
				curr1 = curr1.next;
			}
		}
	}
    
	public static void main(String[] args) {
		StudentList list = new StudentList();
		list.add(list,new Student(12,"ABCD","ECE"));
		list.add(list,new Student(13,"EFGH","EEE"));
		list.getAdd(list,new Student(14,"IJKL","IT"));
		list.getAdd(list,new Student(15,"MNOP","Civil"));
		printList(list);
		Student s = new Student();
		s.setRollno(12);
		list.remove(list, s);
		printList(list);
//		System.out.println("_________");
//		list.remove(list, s);
//		printList(list);
//		System.out.println("________");
//		list.findList(list,14);
//	
//		
     

	
	
		

}
}

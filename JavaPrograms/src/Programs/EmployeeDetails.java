/*1. Given a Code Complete the Linked List implementation by creating remove, removeFirst, removeLast, addFirst.
find functions[new Product().setId(123)] Node= Employee[id, name,salary] type*/

package Programs;

public class EmployeeDetails 
{
	Employee10 head;
	static int size=0;
	public void insert(EmployeeDetails list,int id,String name,double salary) 
	{
		Employee10 emp=new Employee10(id, name, salary);
		if(list.head ==null) 
			list.head=emp; 
		else
		{
			Employee10 trav=list.head;
			while(trav.next!=null)
			{
				trav=trav.next;
				} 
			trav.next=emp;
			}
		}
	public void addFirst(EmployeeDetails list,int id,String name ,double salary )
	{
		Employee10 emp=new Employee10(id, name, salary);
		if(list.head==null) 
			list.head=emp;
		else
		{
			emp.next=list.head;
			list.head.prev=emp;
			list.head=emp; 
			}
		size++; 
		}
	public void removeFirst(EmployeeDetails list) 
	{ 
		if (list.head == null)
		{
		System.out.println("list is already empty");
		}
		else
		{
			Employee10 curr = list.head;
			list.head = curr.next;
			curr.next = null;
			}
		}
	//Remove Last 
	public void removeLast( EmployeeDetails list) 
	{
		Employee10 prev = null;
		if (list.head == null)
		{
			System.out.println("list is empty");
			} 
		else
		{
			Employee10 temp = list.head;
			while(temp.next != null)
			{
				prev = temp;
				temp = temp.next;
				}
			prev.next = null;
			}
		}
	public void remove(EmployeeDetails list, int id,String name,double salary)
	{
		Employee10 emp=new Employee10(id, name, salary);
		if(list.head==null)
			System.out.println("The List is Empty..");
		else
		{
			Employee10 curr=list.head;
			Employee10 curr2=curr.next;
			if(curr.id==id)
			{
				Employee10 temp=list.head;
				list.head=list.head.next;
				temp=null;
				}
			else
			{
				while(curr2.next!=null)
				{
					if(curr2.id==id)
					{
						System.out.println(curr2.id+" == "+id);
						
						emp=curr2;
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
	public static void print(EmployeeDetails list)
	{ 
		Employee10 curr=list.head; 
		System.out.println("\n LinkedList: "); 
		while(curr!=null)
		{
			System.out.print(curr.id+ " "+curr.name+" "+curr.salary+" "+" --> ");
			curr=curr.next;
			}
		}
	public static void main(String[] args)
	{
		EmployeeDetails emp =new EmployeeDetails();
emp.insert(emp, 234, "ABCD", 1235.3); 
emp.insert(emp, 224, "EFGH", 34567.3); 
emp.insert(emp, 514, "IJKL", 14324.3); 
print(emp); 
System.out.println("<\n --------remove--------->");
emp.remove(emp, 224, "EFGH", 34567.3 ); 
print(emp);
System.out.println("\n --------add first--------");
emp.addFirst(emp,359,"XYZ",7658.98);
print(emp);
System.out.println("\n --------remove first--------");
emp.removeFirst(emp); 
print(emp); 
System.out.println("\n --------remove last--------");
emp.removeLast(emp);
print(emp);
}
}
class Employee10 
{ 
	int id;
	String name;
	double salary;
	Employee10 next;
	Employee10 prev;
	public Employee10(int id, String name, double salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.next=null;
		}
}
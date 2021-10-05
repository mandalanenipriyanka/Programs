package Programs;

import com.peopletech.Student;

public class UsingGetMethods {
	Student head;
    //Add
    public void adding( UsingGetMethods  list , Student newData)
    {
        if(head == null)
        {
            head = newData;
            }
        else
        {
            Student curr = list.head;
            while(curr.next != null)
            {
                curr = curr.next;
                }
            curr.next = newData;
            }
        }
    public void print( UsingGetMethods list)
    {
        if(head == null)
        {
            System.out.print("empty list");
            }
        else
        {
            Student temp = head; 
            while(temp!=null)
            {
                System.out.print(temp+" --> "); 
                temp = temp.next; 
                }
            System.out.println("\n");
            }
        }
    public void get(UsingGetMethods list, int get)
    {
        int i=1;
        if(head == null) 
        {
            System.out.print("empty list");
            }
        else
        {
            Student temp = head;
            while(temp!=null)
            {
                if(i == get) 
                {
                    System.out.println(temp);
                    }
                temp = temp.next;
                i++;
                }
            }
        }
    public void getFirst(UsingGetMethods  list)
    {
        if(head == null)
        {
            System.out.print("empty list");
            }
        else
        {
            Student temp = head; 
            System.out.println(temp);
            }
        } 
    public void getLast(UsingGetMethods list)
    {
        if(head == null)
        {
            System.out.print("empty list");
            }
        else
        
        {
            Student temp = head;
            while(temp.next != null)
            {
                temp = temp.next;
                } 
            System.out.println(temp);
            }
        }
    public void LastIndexOf(UsingGetMethods list) 
    {
        int index = 1;
        if(head == null) 
        {
            System.out.print("empty list");
            }
        else
        {
            Student temp = head;
            while(temp.next != null)
            { 
                temp = temp.next;
                index++;
                }
            System.out.println("The last index is : " + index + " of student "+temp);
            }
        }
    public boolean Contains( UsingGetMethods list, Student s)
    {
        if(head == null) 
        {
            return false; 
            }
        else
        {
            Student temp = head;
            while(temp.next != null)
            {
                if(temp.equals(s)) 
                {
                    return true; 
                    }
                temp = temp.next;
                }
            }
        return false; 
        } 
    public static void main(String[] args)
    {
    	UsingGetMethods  list = new UsingGetMethods();
        list.adding(list, new Student(1, "ABCDE", "ECE"));
        list.adding(list, new Student(2,"EFGHI","CSE"));
        list.adding(list, new Student(3,"IJKLM","Mech"));
        list.adding(list, new Student(4,"NOPQ","CIVIL")); 
        list.adding(list, new Student(5,"RSTUY","ML"));
        list.print(list);
        System.out.println("get method is :"); 
        list.get(list, 2);
        System.out.println("get first is :"); 
        list.getFirst(list);
        System.out.println("get last is :"); 
        list.getLast(list); 
        System.out.println("get last index is :");
        list.LastIndexOf(list);
        System.out.println("\nData Contains : "); 
        
        }
}

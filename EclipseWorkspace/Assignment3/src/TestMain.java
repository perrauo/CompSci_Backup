
public class TestMain 
{

    public static void main(String[] args) 
    {
	DLinkedPriorityQueue<String> qu = new DLinkedPriorityQueue<String>();
	
	qu.add("student1", 5);
		
	qu.add("student2", 23);
	
	qu.add("student3", 13);
//	
	qu.add("student4", 44);
//	
	//qu.add("student5", 1);
	
	
	System.out.println(qu.toString());
	
	System.out.println("update priority");
	qu.updatePriority("student2", 55);
	
	System.out.println(qu.toString());
	
	qu.updatePriority("student2", 1);
	
	System.out.println(qu.toString());
	
//	
//	qu.updatePriority("student2", 1);
//	
//	System.out.println(qu.toString());
	

    }

}
package HBProj;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Entity.BookLib;
import Entity.Userdata;

public class UserDao {
	 EntityManagerFactory emf = Persistence.createEntityManagerFactory("employeePU");
 	EntityManager em = emf.createEntityManager();
	Scanner sc=new Scanner(System.in);

 public void insert()
 {
		System.out.println("Registeration panel ");
		 System.out.println("create Your Library no  :(NOTE: The Library number Should be And Integer) ");
  	  int lib_no=sc.nextInt();
		System.out.print("Enter Your name :");
	String	name=sc.next();
		System.out.print("enter your age : ");
		int age=sc.nextInt();
		System.out.print("Enter email : ");
		String email=sc.next();
		System.out.print("enter your Phone No: ");
		long phoneno=sc.nextLong();
		System.out.println("press Signup here");
		
		
		em.getTransaction().begin();
        em. persist(new  Userdata(lib_no,name,age,email,phoneno));
   em.getTransaction().commit();
System.out.println("Details Added Successfully");

 }
 public void Login()
 {
	 System.out.println("Enter Library Mumber ");
 	  int lib_no=sc.nextInt();
		System.out.print("Enter Your name :");
	String	name=sc.next();
	
	Userdata user=em.find(Userdata.class,lib_no);
	if(user==null)
	{
	  	   System.out.println(name+ " "+"You have No record with this given Library Id");

	}
	  else {
 	     System.out.println(user);
    }  
 }
	 public void delete() 
	 {
		   System.out.println("Enter Library Id");
		   int lib_no=sc.nextInt();
		   
		   Userdata user=em.find(Userdata.class,lib_no);
		      if(user== null) {
		    	   System.out.println("No record with this given Employee Id");
		       }
		       else {
		    	     em.getTransaction().begin();
		    	     em.remove(user);
		    	     em.getTransaction().commit();
		 }  
		
		     
 }
	 public void availbook() 
	 {

		 System.out.println("***************Available Books*************");	
		 
		 System.out.println("Available Books are :"
	    			+ "1.The Pragmatic Programmer  ...\r\n" + 
	    			"2.The Mythical Man-month: Essays on Software Engineering. ...\r\n" + 
	    			"3.Clean Code: A Handbook of Agile Software Craftsmanship. ...\r\n" + 
	    			"4.The Clean Coder: A Code of Conduct for Professional Programmers. ...\r\n" + 
	    			"5.Refactoring: Improving the Design of Existing Code");
		 System.out.println("Enter Library Id");
		   int lib_no=sc.nextInt();
		   System.out.println("Enter How many Books You Want ");
		   int count=sc.nextInt();
		   for(int i=1;i<=count;i++)
		   {
	    	System.out.println("Enter The Book Name ");
	    	String book=sc.next();
	    	System.out.println("Enter The Book No ");
	    int book_no=sc.nextInt();
		   
	    	BookLib lib=new BookLib(book_no,book);
	    			 em.getTransaction().begin();
	          em. persist(lib);
	     em.getTransaction().commit();
	    	System.out.println(book + "The book is added Successfully");
		   }
	} 	
	  public void update() 
	  {
		
		  
	  }
/*
  public void update() {
	   System.out.println("Enter employee Id");
	     int id = scanner.nextInt();
	     System.out.println("Enter first Name");
     String fName = scanner.next();
	     System.out.println("Enter last Name");
     String lName = scanner.next();
	     System.out.println("Enter salary");
     double salary = scanner.nextDouble();
     
     Employee emp = null;
     emp = em.find(Employee.class, id);
     
     if(emp == null) {
  	   System.out.println("No record with this given Employee Id");
     }
     else {
  	     em.merge(new Employee(id, fName, lName, salary));
     }
     
 }
 
 
 public void delete() {
	   System.out.println("Enter employee Id");
	     int id = scanner.nextInt();
	     Employee emp = null;
	      emp = em.find(Employee.class, id);
	      if(emp == null) {
	    	   System.out.println("No record with this given Employee Id");
	       }
	       else {
	    	     em.getTransaction().begin();
	    	     em.remove(emp);
	    	     em.getTransaction().commit();
	       }  
	     
	   
 }
 //
 public void findById() {
	   System.out.println("Enter employee Id");
	     int id = scanner.nextInt();
	     
	     Employee emp = null;
	      emp = em.find(Employee.class, id);
	      if(emp == null) {
	    	   System.out.println("No record with this given Employee Id");
	       }
	       else {
	    	     System.out.println(emp);
	       }  
	    
	 
 }
 
 public void findAllEmployees() {
	   
	        Query query = em.createQuery("select e from Employee e");//10
	        List<Employee>  emps =   query.getResultList();
	        
	        for(Employee e : emps) {
	        	System.out.println(e);
	        }
	        
	 
 }

public void findBySalary() {
	Query query = em.createQuery("select e from Employee e where e.salary > 20000 ");
  List<Object>  emps =   query.getResultList();

  for(Object e : emps) {
  	System.out.println(e);
  }
 
}

public void getEmployeeName() {
	
	// SQL -   select first_name, last_name from employee
	Query query = em.createQuery("select e.empId, e.firstName, e.lastName , e.salary from Employee e");
	    List<Object[]> objects =    query.getResultList();
	    
	    for(Object[] obj : objects) {
	    	System.out.println(obj[0] + "  " +  obj[1] + " " + obj[2] + " " + obj[3]);
	    } 
	              
	
}

public void sortByName() {

	
	Query query = em.createQuery("select obj from Employee obj  order by obj.firstName desc");
  List<Employee>  emps =   query.getResultList();
  for(Object e : emps) {
  	System.out.println(e);
  }

}

public void maxSalary() {
	
	// select max(salary) from employee
	Query query = em.createQuery("select max(e.salary) from Employee e");
	Object  obj = query.getSingleResult();
	
	System.out.println(obj);

}
 	
    	
    	
    	
    	
    	
    	
    	
    	
    	*/
    	
    	
    	
    	
    	
    	
    	
 
    /*	else if(c==2)
    	{
    		 System.out.println("***************Available Books*************");	
    		 
    		 System.out.println("Available Books are :"
 	    			+ "1.The Pragmatic Programmer  ...\r\n" + 
 	    			"2.The Mythical Man-month: Essays on Software Engineering. ...\r\n" + 
 	    			"3.Clean Code: A Handbook of Agile Software Craftsmanship. ...\r\n" + 
 	    			"4.The Clean Coder: A Code of Conduct for Professional Programmers. ...\r\n" + 
 	    			"5.Refactoring: Improving the Design of Existing Code");
 	    	System.out.println("Enter The Book Name ");
 	    	String book=sc.nextLine();
 	    	System.out.println("Enter The Book No ");
 	    int book_no=sc.nextInt();
 	    	
 	    	BookLib lib=new BookLib(lib_no,book_no,book);
 	    			 em.getTransaction().begin();
  	          em. persist(lib);
  	     em.getTransaction().commit();
 	    	System.out.println(book + "The book is added Successfully");
    	}
    	 }
    	 
    	 else if(log==2)
    	 {
    	
    	
   	     
 	  System.out.println("****************************************************************************************************");
 	
 	 System.out.println("press 1");
 	 ch=sc.nextInt();
    	switch(ch)
    	{
    	case 1:
    	     System.out.println("Press 1 : DashBoard and Press 2 : view Cart");
    	     int dash=sc.nextInt();
    	 	 
    	     if(dash==1)
    	     {
    	    	System.out.println("Available Books are :"
    	    			+ "1.The Pragmatic Programmer  ...\r\n" + 
    	    			"2.The Mythical Man-month: Essays on Software Engineering. ...\r\n" + 
    	    			"3.Clean Code: A Handbook of Agile Software Craftsmanship. ...\r\n" + 
    	    			"4.The Clean Coder: A Code of Conduct for Professional Programmers. ...\r\n" + 
    	    			"5.Refactoring: Improving the Design of Existing Code");
    	    	System.out.println("Enter The Book Name ");
    	    	String book=sc.next();
    	    	System.out.println("Enter The Book Number ");
    	    	int book_no=sc.nextInt();
    	    	
    	    	BookLib lib=new BookLib(lib_no,book_no, book);
    	    			 em.getTransaction().begin();
     	          em. persist(lib);
     	     em.getTransaction().commit();
    	    	System.out.println(book + "The book is added Successfully");
    	    	
    	     }
    	     else if(dash==2)
    	     {
    	    	 System.out.println("***************Cart*************");
    	    	 Query query = em.createQuery("Select * from book b");
    	    		      List<String> list = query.getResultList();

    	    		      for(String b:list) {
    	    		         System.out.println("Added Books :"+b);
    	    		      }
    	     }
    	
    	}
 }*/
}

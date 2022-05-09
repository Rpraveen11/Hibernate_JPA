package HBProj;


import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
Scanner sc=new Scanner(System.in);
       
    	
    	System.out.println("********************Welcome To The ABC Library********************");
    	
    //	System.out.println("Press 1 to login , if new User press 2 for sign up");
    	System.out.println("1. Login");
    	System.out.println("2. SignUp");
    	System.out.println("3. Delete Data From Records");
    	System.out.println("4. Available Books ");


    	int log=sc.nextInt();
    	
    	UserDao op=new UserDao();
    	switch (log)
    	{
    	
    		case 1:
    			
    			op.Login();
    			System.out.println("Press 1: to Go Dashboard"
    					+ "press any key : Sign up otherwise Exit");
    			int i=sc.nextInt();
    			if(i==1)
    			{
    			System.out.println("1. Delete Data From Records");
    	    	System.out.println("2. Available Books ");
    	    	switch(i)
    	    	{
    	    	case 1:
    	    		op.delete();
    	    		break;
    	    	case 2:
    	    		System.out.println(" Available Book ");
    	    		op.availbook();
    	    		break;
    	    		case 3:
    	    			System.out.println("Update Book  ");
    	    			op.update();
    	    	}
    			}
    			else
    			{
    				System.out.println(" 1:sign up"
    						+ "2: Exit");
    				 i=sc.nextInt();
    				 if(i==1)
    				 {
    				System.out.println(" Sign Up");
    				op.insert();
    				op.availbook();
    				 }
    				 else
    				System.out.println("You Are Left ");
    			}
    			break;
    		case 2:
    		     op.insert();
    		     op.availbook();
    		     break;
    		case 3:
    			op.delete();
    			System.out.println("Data Deleted Successfully.... ");
    			break;
    		case 4:
    			op.availbook();
    			break;
    		case 5:
    			op.update();
    		}
    	sc.close();
    }
    	
    }


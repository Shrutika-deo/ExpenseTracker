package com.expensetracker.main;
import java.util.Scanner;

import com.expensetracker.entity.Transaction;
import com.expensetracker.handler.FileHandler;
import com.expensetracker.service.TransactionService;
/**
 * Hello world!
 *
 */
public class ExpenseTracker 
{
    public static void main( String[] args )
    {
        Scanner sc =new Scanner(System.in);
        
        TransactionService service = new TransactionService();
        
        String filename = "D:\\Eclipse_files\\transaction.txt";
        
        while(true)
        {
        	System.out.println("\n ---- Expense Tracker ----");
        	
        	System.out.println("1 . Add Income ");
        	System.out.println("2 . Add Expense ");
        	System.out.println("3 . Monthly Summary ");
        	System.out.println("4 . Load From File ");
        	System.out.println("5 . Save To File ");
        	System.out.println("6 . Exit ");
        	
        	
        	System.out.println(" Enter Choice : ");
        	int choice = sc.nextInt();
        	sc.nextLine();
        	
        	switch(choice)
        	{
        	case 1 :
        	case 2 :
        	
        	
        		String type = choice == 1 ? "income" : "expense";
        		
        		System.out.print("Enter Category : ");
        		String category = sc.nextLine();
        		
        		System.out.print("Enter Amount : ");
        		double amount = sc.nextDouble();
        						sc.nextLine();
        						
        		System.out.print("Enter Date (yyyy-mm): ");
        		String date = sc.nextLine();
        		
        		Transaction t = new Transaction(type, category, amount, date);
        		
        		service.addTransaction(t);
        		
        		System.out.println("Transaction Added...");
        		break;
        		
        		
        		case 3:
        			
        			System.out.print("Enter Month(yyyy-mm) :");
        			String month = sc.nextLine();
        			System.out.println(service.getMonthlySummary(month));
        		break;
        		
        		case 4:
        			
        			FileHandler.loadFromFile(service.getAllTransactions(), filename);
        			break;
        			
        		case 5:
        			
        			FileHandler.loadFromFile(service.getAllTransactions(), filename);
        			break;
        			
        		case 6:
        			
        			System.out.println("---- Thank You ----");
        			return;
        			
        			default :
        				
        				System.out.println("---- Default Choice ----");
        
        	}
	
        }
    }
}

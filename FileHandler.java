package com.expensetracker.handler;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.List;

import com.expensetracker.entity.Transaction;

import java.io.*;

public class FileHandler {
	
	public static void saveToFile(List<Transaction> transactions,String filename)
	{
		try(PrintWriter pw = new PrintWriter(new File(filename)))
		{
			for(Transaction t : transactions)
			{
				pw.println(t);
			}
			System.out.println("Saved to file : "+filename);
		}
		catch(Exception e)
		{
			System.out.println("Error");
		}
	}
	

	
	
	public static void loadFromFile(List<Transaction> transactions,String filename)
	{
		try(BufferedReader br = new BufferedReader(new FileReader(filename)))
		{
		String line;
		while((line = br.readLine())!= null)
				{
			transactions.add(Transaction.fromString(line));
				}
			System.out.println("Load File :"+filename);
			
			
		}
		catch(Exception e)
		{
			System.out.println("Error");
		}
	}
}

package com.expensetracker.service;
import java.util.ArrayList;
import java.util.List;

import com.expensetracker.entity.Transaction;

public class TransactionService {

	private List<Transaction> transactions = new ArrayList<>();
	
	public void addTransaction(Transaction t)
	{
		transactions.add(t);
	}
	
	public List<Transaction> getAllTransactions()
	{
		return transactions;
		
	}
	
	public String getMonthlySummary(String month)
	{
		double income = 0;
		double expense = 0;
		
		for(Transaction t : transactions)
		{
			if(t.getDate().equals(month))
			{
				if(t.getType().equalsIgnoreCase("income"))
				{
					income += t.getAmount();
				}
				else
				{
					expense += t.getAmount();
				}
			}
		}
		
		return "Summary For :" +month + " : \n"
				+"Total income : " +income+ "\n"
				+"Total Expense :" +expense+ "\n"
				+"Balance :"+(income - expense);
		
	}
	
	
}

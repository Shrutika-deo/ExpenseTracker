package com.expensetracker.entity;

public class Transaction {
	
	private String type;
	private String category;
	private double amount;
	private String date;
	
	
			//Generate Constructor
	
	public Transaction(String type, String category, double amount, String date) {
		
		this.type = type;
		this.category = category;
		this.amount = amount;
		this.date = date;
	}

             //Generate Only Getter
	
	public String getType() {
		return type;
	}

	public String getCategory() {
		return category;
	}

	public double getAmount() {
		return amount;
	}

	public String getDate() {
		return date;
	}

	
			//Generate ToString Method

	@Override
	public String toString() {
		return "Transection [type=" + type + ", category=" + category + ", amount=" + amount + ", date=" + date + "]";
	}

		
	
	//Generate Manually Transaction Object
	
	public static Transaction fromString(String line)
	{
		String[] forms = line.split(" , "); 
		return new Transaction(forms[0], forms[1], Double.parseDouble(forms[2]), forms[3]);
		
	}
	
	
	
	

}

package com.ai.brisca_agent.entities;

public class Card {
	
	private String name;
	private int value;
	private int number;
	private String suit;
	
	public Card(String s)
	{
		this.name = s;
		this.value = 0;
		
		this.suit = extractSuit(this.name);
		
		this.number = extractNumber(name);
		
		this.value = calculateValue(this.number);
	}
	

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public int getValue()
	{
		return value;
	}
	
	public int getNumber()
	{
		return this.number;
	}
	
	public String getSuit()
	{
		return this.suit;
	}
	
	private String extractSuit(String name)
	{
		String result = name.charAt(0) + "";
		
		return result;
	}
	
	private int extractNumber(String name)
	{
		String temp = "";
		
		for(int i = 1; i < name.length(); i++)
		{
			temp += name.charAt(i) + "";
		}
		
		int result = Integer.parseInt(temp);
		
		return result;
		
	}
	
	private int calculateValue(int cardNumber)
	{
		switch(cardNumber)
		{
			case 1:
				value = 11;
				break;
			case 3:
				value = 10;
				break;
			case 10:
				value = 2;
				break;
			case 11:
				value = 3;
				break;
			case 12:
				value = 4;
				break;
			default:
				value = 0;
				break;
		}
		return value;
	}
	

}

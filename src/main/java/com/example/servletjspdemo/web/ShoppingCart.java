package com.example.servletjspdemo.web;

import java.util.*;
import java.io.Serializable;

public class ShoppingCart implements Serializable
{

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private int accountNum;	
private Vector<Integer> Items;


	public ShoppingCart()
	{
		Items = new Vector<Integer>();
	}
	
	public int getAccountNum()
	{
		return this.accountNum;
	}

	public void setAccountNum(int accountNum)
	{
		this.accountNum = accountNum;
	}
	
	public Iterator<Integer> getItems()
	{
		return this.Items.iterator();
	}

	public boolean addItem(int item)		
	{
		return Items.add(new Integer(item));
		
	}
	
	public String toString()
	{
		return "ShoppingCart for " + accountNum;
	}	
}
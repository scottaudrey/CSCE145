//Written by Audrey Scott

public class Apple {
	
	//These are the three instance variables. They all need to have the private scope.
	private String type;
	private double weight;
	private double price;
	
	//This is the default constructor which assigns a default value for each variable
	public Apple() 
	{
		this.type = "Gala";
		this.weight = 0.0;
		this.price = 0.0;
	}
	
	//This is the parameter constructor with checks for valid values for each instance variable.  
	public Apple (String t, double w, double p)
	{
		//Type
		//It checks if the statement entered is valid.
		if (t.equals("Red Delicious") || t.equals("Golden Delicious") || t.equals("Gala") || t.equals("Granny Smith")) {
			this.type = t;
		}
		else
		{
			this.type = "Gala";
		}
		
		//weight
		//It checks if the weight is between 0 and 2 kg.
		if (w >= 0 && w <= 2.0)
		{
			this.weight = w;
		}
		else
		{
			this.weight = 0.0;
		}
		
		//Price
		//It checks if the price is a non negative number.
		if (p >= 0)
		{
			this.price = p;
		}
		else
		{
			this.price = 0.0;
		}
	}
	
	//Accessor (Getter)
	//These three methods get the type/weight/price needed 
	public String getType ()
	{
		return this.type;
	}
	
	public double getWeight ()
	{
		return this.weight;
	}
	
	public double getPrice ()
	{
		return this.price;
	}
	
	
	//Mutator (setter)
	//These allow the user to change the type/weight/price, as long as it fits the valid values.
	public void setType (String t)
	{
		if (t.equals("Red Delicious") || t.equals("Golden Delicious") || t.equals("Gala") || t.equals("Granny Smith")) {
			this.type = t;
		}
		else
		{
			this.type = "Gala";
		}
	}
	
	public void setWeight (double w)
	{
		if (w >= 0 && w <= 2.0)
		{
			this.weight = w;
		}
		else
		{
			this.weight = 0.0;
		}
	}
	
	public void setPrice (double p)
	{
		if (p >= 0)
		{
			this.price = p;
		}
		else
		{
			this.price = 0.0;
		}
	}
	
	//toString
	//This makes the program print out the information 
	//Type: ___, Weight: ____, Price: _____
	public String toString()
	{
		return "Type: " + getType() + ", Weight: " + getWeight() +  ", Price: " + getPrice();
	}
	
	//equals
	//This is used to compare two apples. It makes sure that it is both not null and has the same type, weight, and price.
	public boolean equals (Apple a)
	{
		return a != null
				&& this.type.equals(a.getType())
				&& this.weight == a.getWeight()
				&& this.price == a.getPrice();
	}
}

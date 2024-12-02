//Written by Audrey Scott

public class Wheel {
	
	//Instance Variables
	private double diameter;
	private double width;
	
	//Default Constructor
	public Wheel() 
	{
		this.diameter = 16;
		this.width = 1;
	}
	
	//Parameterized Constuctor
	public Wheel(double d, double w) 
	{
		//Diameter
		if (d >= 16 && d <= 55)
		{
			this.diameter = d;
		}
		else
		{
			this.diameter = 16;
		}
		
		//Width
		if (w >= 1 && w <= 2.5) {
			this.width = w;
		}
		else 
		{
			this.width = 1;
		}
	}
	
	//Accessors
	public double getDiameter() 
	{
		return this.diameter;
	}
	
	public double getWidth() 
	{
		return this.width;
	}
	
	// Mutators (if the value is not valid, it resets to the default value)
	public void setDiameter(double d) 
	{
		if (d >= 16 && d <= 55)
		{
			this.diameter = d;
		}
		else
		{
			this.diameter = 16;
		}
	}
	
	public void setWidth(double w) 
	{
		if (w >= 1 && w <= 2.5) {
			this.width = w;
		}
		else 
		{
			this.width = 1;
		}
	}
	
	//Equals
	public boolean equals(Wheel w) 
	{
		return w != null
				&& this.diameter == w.getDiameter()
				&& this.width == w.getWidth();
	}
	
	//toString
	public String toString()
	{
		return "[Wheel] Diameter: " + getDiameter() + " Width: " + getWidth();
	}	
}

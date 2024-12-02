//Written by Audrey Scott

public class Frame {
	
	//Instance variables
	private double size;
	private String type;
	
	//Default Constructor
	public Frame() 
	{
		this.size = 18.5;
		this.type = "diamond";
	}
	
	//Parameterized Constructor
	public Frame(double s, String t)
	{
		//Size
		if (s >= 18.5 && s <= 60) {
			this.size = s;
		}
		else
		{
			this.size = 18.5;
		}
		
		//Type
		if (t.toLowerCase().equals("diamond") ||
				t.toLowerCase().equals("step-through") ||
				t.toLowerCase().equals("truss") ||
				t.toLowerCase().equals("penny-farthing")) {
			this.type = t;
		}
		else
		{
			this.type = "diamond";
		}
	}
	
	//Accessors
	public double getSize() 
	{
		return this.size;
	}
	
	public String getType() 
	{
		return this.type;
	}
	
	//Mutators (if the value is not valid, it resets to the default value)
	public void setSize(double s) 
	{
		if (s >= 18.5 && s <= 60) {
			this.size = s;
		}
		else
		{
			this.size = 18.5;
		}
	}
	
	public void setType(String t)
	{
		if (t.toLowerCase().equals("diamond") ||
				t.toLowerCase().equals("step-through") ||
				t.toLowerCase().equals("truss") ||
				t.toLowerCase().equals("penny-farthing")) {
			this.type = t;
		}
		else
		{
			this.type = "diamond";
		}
	}
	
	//Equals
	public boolean equals(Frame f) 
	{
		return f != null
				&& this.size == f.getSize()
				&& this.type.equals(f.getType());
	}
	
	//toString
	public String toString () 
	{
		return "[Frame] Size: " + getSize() + " Type: " + getType();
	}
}

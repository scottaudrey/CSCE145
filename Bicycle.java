//Written by Audrey Scott

public class Bicycle {
	
	//Instance Variables 
	private String make;
	private Wheel frontWheel = new Wheel();
	private Wheel backWheel = new Wheel();
	private Frame frame = new Frame();
	
	//Default Constructor
	public Bicycle () 
	{
		this.make = "none";
	}
	
	//Parameterized Constructor
	public Bicycle (String s, Wheel f, Wheel b, Frame fr) 
	{
		this.make = s;
		if (make == null)
			this.make = "none";
		else
			this.make = s;
		frontWheel = f;
		backWheel = b;
		frame = fr;
	}
	
	//Accessors
	public String getMake() 
	{
		return this.make;
	}
	
	public Wheel getFrontWheel() 
	{
		return frontWheel;
	}
	
	public Wheel getBackWheel() 
	{
		return backWheel;
	}
	
	public Frame getFrame() 
	{
		return frame;
	}
	
	//Mutators
	public void setMake(String s) 
	{
		this.make = s;
		if (make == null)
			this.make = "none";
		else
			this.make = s;
	}
	
	public void setFrontWheel(Wheel wheel) 
	{
		frontWheel.setDiameter(frontWheel.getDiameter());
		frontWheel.setWidth(frontWheel.getWidth());
	}
	
	public void setBackWheel(Wheel wheel) 
	{
		backWheel.setDiameter(backWheel.getDiameter());
		backWheel.setDiameter(backWheel.getWidth());
	}
	
	public void setFrame (Frame frame) 
	{
		frame.setSize(frame.getSize());
		frame.setType(frame.getType());
	}
	
	//Equals
	public boolean equals(Bicycle b) 
	{
		return b != null
				&& this.make.equals(getMake())
				&& frontWheel == getFrontWheel()
				&& backWheel == getBackWheel()
				&& frame == getFrame();
	}
	
	//toString
	public String toString() 
	{
		return "[Bicycle] Make: " + getMake() + " Front Wheel: " + getFrontWheel() + " Back Wheel: " + getBackWheel() + " Frame: " + getFrame();
	}
}

//Written by Audrey Scott

public class AppleTester {

	public static void main(String[] args) {
		
		//This creates the three apples used in the demonstration. 
		Apple defaultApple = new Apple();
		Apple parameterizedApple = new Apple ();
		Apple incorrectApple = new Apple();
		
		//This part introduces the user to the apple tester.
		System.out.println("Welcome to the Apple Tester!" + "\n"); 
		
		//This prints out the first apple. It has the default values.
		System.out.println("First, a default apple will be created");
		System.out.println(defaultApple + "\n");
		
		//For the second apple, the values are changed into new correct values.
		System.out.println("Now, another apple will be created");
		parameterizedApple.setType("Red Delicious");
		parameterizedApple.setWeight(1.45);
		parameterizedApple.setPrice(1.99);
		System.out.println("This new apple has the set values of \"Red Delicious\" for the type, 1.45 for the weight, and 1.99 for the price");
		System.out.println(parameterizedApple + "\n");
		
		//For the third apple, I intentionally put in incorrect values.
		//Because of this, the values stay the same.
		System.out.println("Creating one more apple");
		System.out.println("I am going to intentionally put in incorrect values.");
		System.out.println("This new apple has the set values of \"Purple Pumpkin\" for the type, 5.3 for the weight, and -3.00 for the price");
		incorrectApple.setType("Purple Pumpkin");
		incorrectApple.setWeight(5.3);
		incorrectApple.setPrice(-3.00);
		System.out.println("Since these values are incorrect, the apple should continue to have the default values.");
		System.out.println(incorrectApple + "\n");
		
		//This uses the .equals method I created to find if the parameterizedApple and the incorrectApple are the same.
		//They are not equal, so it should print out false. 
		System.out.println("Finally, I am going to check if the second and third apple have the same values. The answer should be false.");
		System.out.println(parameterizedApple.equals(incorrectApple));
	}

}

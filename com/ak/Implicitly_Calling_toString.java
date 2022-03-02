
package com.ak;
public class Implicitly_Calling_toString {
}// Java program to illustrate
// working of toString() method

// Main class
class Best_Friend {

	// Member attributes of this class
	String name;
	int age;
	String college;
	String course;
	String address;

	// Constructor of this class
	Best_Friend(String name, int age, String college,
				String course, String address)
	{
		// This keyword refers to current instance itself
		this.name = name;
		this.age = age;
		this.college = college;
		this.course = course;
		this.address = address;
	}

	// Method 1
	// Creating our own toString() method
	public String toString()
	{
		return name + " " + age + " " + college + " "
			+ course + " " + address;
	}

	// Method 2
	// Main driver method
	public static void main(String[] args)
	{
		// Creating object of class inside main() method
		Best_Friend b = new Best_Friend(
			"Gulpreet Kaur", 21, "BIT MESRA", "M.TECH",
			"Kiriburu");
//		for (Best_Friend index : b) {
//			System.out.println(index);
//
//		}

		// Print and display commands to illustrate
		// toString() method as both will print the same
		// Print the object
		System.out.println(b);


		// when we don't define the method toString it will implicitly call tht toString method implicitly

		// Printing object but using toString() method
		System.out.println(b.toString());

		Best_Friend[] b1 ={new Best_Friend("Ambar kansal", 20, "DIT University", "B.tech", "Meerut"),new Best_Friend(
				"Gulpreet Kaur", 21, "BIT MESRA", "M.TECH",
				"Kiriburu")};

		for (Best_Friend index : b1) {
			System.out.println(index);
		}
		System.out.println(b1);

	}
}

//***********************************************************
// Name:  Anthony Weringer
// Title: Triangle.java
// Description: Tells what kind of triangle for Assignment4
// Time spent: 1.5 hours
// Date: 9/9/17
//***********************************************************

public class Triangle 
{
	/*Variables*/
	private int side1, side2, side3;
	
	/*Constructor*/
	public Triangle (int s1, int s2, int s3)
	{
		side1 = s1;
		side2 = s2;
		side3 = s3;
	}
	
	/*Find largest side*/
	private int largest()
	{
		if (side1 >= side2 && side1 >= side3) return side1;
		else if (side2 >= side1 && side2 >= side3) return side2;
		else return side3;
	}
	 
	/*Find shortest side*/
	private int shortest()
	{
		if (side1 <= side2 && side1 <= side3) return side1;
		else if (side2 <= side1 && side2 <= side3) return side2;
		else return side3;
	}
	
	/*Boolean methods find whether equilateral, isosceles, or scalene*/
	public boolean is_equilateral()
	{
		if (largest() == shortest()) return true;
		else return false;
	}
	
	public boolean is_isosceles()
	{
		if (side1 == side2 || side1 == side3 || side2 == side3) return true;
		else return false;
	}
	
	public boolean is_scalene()
	{
		if (side1 != side2 && side1 != side3 && side2 != side3) return true;
		else return false;
	}
	
	/*Result output*/
	public String toString()
	{
		return side1 + " " + side2 + " " + side3;
	}
	
	
}

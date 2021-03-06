/**	
* Polymorphism: separates the interface and the implementation
* to allow the programmer to program -at the interface- in the design of
* a complex system
* Below: Rectangle subclass of Shape superclass, using inheritance
*/

public class Rectangle extends Shape {
	
	/**
	* private member fields (variables)
	*/
	private int length;
	private int width;
	
	/**
	* constructor
	*/
	public Rectangle(String colour, int length, int width) {
		super(colour);
		this.length = length;
		this.width = width;
	}
	
	@Override
	public String toString() {
		return "rectangle[length=" + length + ", width=" + width + ", " + super.toString() + "]";
	}
	
	/**
	* Override the inherited getArea()
	* to provide the proper implementation
	*/
	@Override
	public double getArea() {
		return length * width;
	}
}

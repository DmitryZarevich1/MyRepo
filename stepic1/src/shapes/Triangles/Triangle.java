package shapes.Triangles;

import shapes.Shapes;

public class Triangle extends Shapes {
	private double lengthA;
	private double lengthB;
	private double lengthC;
	

	public Triangle() {
		// TODO Auto-generated constructor stub
	}
	public Triangle(String name,double lengthA,double lengthB,double lengthC) {
		super(name,lengthA);
		this.lengthA = lengthA;
		this.lengthB = lengthB;
		this.lengthC = lengthC;
		
	}
	@Override
	public double perimetr() {
		return lengthA+lengthB+lengthC;
	}
	@Override
	public String toString() {
	      return "Фигура: "+getName()+" Периметр: "+perimetr();
	}

}

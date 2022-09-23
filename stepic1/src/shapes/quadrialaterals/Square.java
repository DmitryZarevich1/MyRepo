package shapes.quadrialaterals;

import shapes.Shapes;

public class Square extends Shapes{
	private double width;
	private double length;
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}

	public Square() {
		// TODO Auto-generated constructor stub
	}
	public Square(String name,double length,double width) {
		super (name,length);
		this.length = length;
		this.width = width;
	}
	
	@Override
	public double perimetr() {
		return (length+width)*2;
	}
	@Override
	public String toString() {
	    return "Фигура: "+getName()+" Периметр: "+perimetr();
	}

}

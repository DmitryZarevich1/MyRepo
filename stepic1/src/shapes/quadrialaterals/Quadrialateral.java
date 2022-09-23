package shapes.quadrialaterals;

import shapes.Shapes;

public class Quadrialateral extends Shapes {
	private double length1;
	private double width;
	private double width1;
	
	public double getLength1() {
		return length1;
	}
	public void setLength1(double length1) {
		this.length1 = length1;
	}
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getWidth1() {
		return width1;
	}
	public void setWidth1(double width1) {
		this.width1 = width1;
	}
	
	

	/*public Quadrialateral() {
		// TODO Auto-generated constructor stub
	}*/
	public Quadrialateral(String name,double length,double width,double length1,double width1) {
		super(name,length);
		this.width = width;
		this.length1 = length1;
		this.width1 = width1;
		
	}
	
	@Override
	public double perimetr() {
		return getLength()+getWidth()+getLength1()+getWidth1();
	}

	@Override
	public String toString() {
		 return "Фигура: "+getName()+" Периметр: "+perimetr();
	}

}

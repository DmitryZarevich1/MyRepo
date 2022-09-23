package shapes;

public abstract class Shapes {
	private String name;
	private double length;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	
	public Shapes() {
	}
	
	public Shapes(String name,double length) {
		this.name = name;
		this.length = length;	
	}
	
	public abstract double perimetr();
	
	public abstract String toString();
	

}

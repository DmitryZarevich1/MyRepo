package shapes;

public class Circle extends Shapes {
	private double r;
	
	/*public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}*/
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	public Circle(String name,double r) {
		super (name,r);
		this.r=r;
	}
	
	@Override
	public double perimetr() {
		return 2*Math.PI*r;
	}
	@Override
	public String toString() {
		return "Фигура: "+getName()+" Периметр: "+perimetr();
	}

}

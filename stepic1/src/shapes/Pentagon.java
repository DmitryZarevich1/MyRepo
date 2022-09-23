package shapes;

public class Pentagon extends Shapes {
	private double sideLength;
	

	public Pentagon() {
		// TODO Auto-generated constructor stub
	}
	public Pentagon(String name,double sideLength) {
		super (name,sideLength);
	}
	@Override
	public double perimetr() {
		return 5*sideLength;
	}
	@Override
	public String toString() {
		return "Фигура: "+getName()+" Периметр: "+perimetr();
	}

}

package shapes;

public class Hexagon extends Shapes {
	private double sideLength = 34;

	public Hexagon() {
		// TODO Auto-generated constructor stub
	}
	public Hexagon(String name,double sideLength) {
		super (name,sideLength);
	}
	
	@Override
	public double perimetr() {
		return 6*sideLength;
	}
	@Override
	public String toString() {
		return "Фигура: "+getName()+" Периметр: "+perimetr();
	}


}

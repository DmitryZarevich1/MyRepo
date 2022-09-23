package shapes;

import shapes.Triangles.Triangle;
import shapes.quadrialaterals.Square;

public class Main {

	public static void main(String[] args) {
		Circle circle = new Circle("циркуль",567.9);
		System.out.println(circle.perimetr());
		System.out.println(circle);
		
		Hexagon hex = new Hexagon("шестиугольник",34);
		System.out.println(hex.perimetr());
		System.out.println(hex);
		
		Triangle tri = new Triangle("треугольник",7,6,4);
		System.out.println(tri.perimetr());
		System.out.println(tri);
		
		Square sq = new Square("квадрат",5,7);
		System.out.println(sq.perimetr());
		System.out.println(sq);
		

	}

}

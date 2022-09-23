package shapes.Triangles;

import shapes.Shapes;

public class RightTriangle extends Shapes {
		private double lengthA;
		private double lengthB;
		private double lengthC;
		

		public RightTriangle() {
			// TODO Auto-generated constructor stub
		}
		public RightTriangle(String name,double lengthA,double lengthB,double lengthC) {
			super(name,lengthA);
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
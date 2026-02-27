package secondlevelfirstsemesteroopsandrasamy;

public class Circle extends Shape implements Drawable {
	private double radius;

			public Circle(String color,double radius) {
				this.color=color;
		this.radius=radius;
			}

			public Circle(double radius) {

		this.radius=radius;
			}
			public double getRadius() {
				return radius;
			}
			

			public void setRadius(double radius) {
				this.radius = radius;
			}

			
			@Override
			public double getArea() {

				return  Math.PI * Math.pow(radius, 2);
			}

			@Override
			public double getperimeter() {

				return  2*Math.PI * radius;
			}


			@Override
			public String toString() {
				return "Circle []";
			}

			@Override
			public String howtodraw() {
				return "how to draw a circle with radius"+radius;
			}

			@Override
			public String howtopaint() {
				// TODO Auto-generated method stub
				return null;
			}





			


		
	}
	



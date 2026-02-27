package secondlevelfirstsemesteroopsandrasamy;

public class Cube extends ThreeDShape implements Drawable {
	private double side;
	public Cube(double side) {
		this.side = side;
	}


        public Cube( String c,double s) {
        this.side=s;
         this.color=c;

	}
	public double getSide()
	{
		return side;
	}
	public void setSide(double side) 
	{
		this.side = side;
	}

	@Override
	public String howtodraw() {

		return "how to draw a cube with side "+side;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return   6 * Math.pow(side, 2) ;
	}

	@Override
	public double getperimeter() {
		// TODO Auto-generated method stub
		return  12 * side;
	}


	@Override
	public double getVloume() {
		// TODO Auto-generated method stub
		return side*side*side;
	}


	@Override
	public String howtopaint() {
		// TODO Auto-generated method stub
		return null;
	}



}

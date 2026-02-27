package secondlevelfirstsemesteroopsandrasamy;

import java.util.Date;

public abstract class Shape implements Drawable {
protected Date dataCreated;
protected String color;
public Shape()
{
	this.dataCreated= new Date();
	this.color="yellow";

}	

public Shape(String color)
{
this.color=color;
}

	public Date getDateCreated()
	{
		return dataCreated;
	}
	public String getcolor()
	{
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public abstract double getArea();

	public abstract double getperimeter();


	
}

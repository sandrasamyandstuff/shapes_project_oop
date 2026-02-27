package secondlevelfirstsemesteroopsandrasamy;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class DrawableTest {

	public static void main(String[] args) {
		
		
		
//		new GUI().show();
	
		
	int SIZE= Integer.parseInt(args[0]);
	Shape sh[]= new Shape [SIZE];
	double total=0;
	int temp=0;
	for (int i=1;i<args.length;i+=2)
	{
		String type=args[i];
		double dim=Double.parseDouble(args[i+1]);
		if(type.equalsIgnoreCase("circle"))
				{
			sh[temp]=new Circle("red",dim);
			total+=sh[temp].getArea();
			
				}
		else 		if(type.equalsIgnoreCase("cube"))
				{
			sh[temp]=new Cube("yellow",dim);
			total+=sh[temp].getArea();
			
				}
		temp++;

	}
	System.out.print(total);
	}

}

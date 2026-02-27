package secondlevelfirstsemesteroopsandrasamy;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class FILES {


	public static void main(String[] args) {
		File f=null;
		 Scanner k =null;
		 double sum=0;
		 try {
			 f=new File ("input");
			 k=new Scanner (f);
			 String y=k.next();
			 int num=Integer.parseInt(y);
			 Drawable ar[]= new Drawable[num] ;
			
			 for(int i=0 ;i<num;i++)
				{
					String type=k.next();
					double length= Double.parseDouble(k.next());		
					switch(type)
					{
					case"circle":
					case"Circle":
				ar[i]=new Circle(length);
				sum+=((Circle)ar[i]).getArea();
				break;
					case"cube":
					case"Cube":
						ar[i]=new Cube(length);
						sum+=((Cube)ar[i]).getArea();
						break;
					}
				}
				System.out.println (sum);
			 
		 }
		catch(Exception e)
		 {
			System.out.println("Error");
		 }
		 finally
		 {
			 if (k!=null)
			 k.close();
		 }
		 //(BONUS) write file
		 FileWriter fw=null;
		 PrintWriter pw=null;
		try
		{
			fw=new FileWriter("output");
			pw=new PrintWriter(fw);
			pw.println(sum);
		}
		catch(Exception e)
		{
			System.out.println("Error");
		}
		finally
		{
			if (pw!=null)
			pw.close();
		}

	}

}

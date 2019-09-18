//MARCAL HARRISON 1703882
import java.io.FileWriter;
import java.io.IOException;

public class DRIVER {

	public static void main(String[] args) 
	{
		House Obj = new House();
		int x;
		
		System.out.println("Welcome to Real Estate Association App");
		System.out.println();
		for(x= 1;x<4;x++) 
		{
			System.out.println("House # "+x);
			System.out.println();
			Obj.enterinfo();
			SaveToFile(x, Obj);
			
		}
		
	}
	
	public static void SaveToFile(int x, House obj)
	{
		try 
		{
			FileWriter objF = new FileWriter("Real Estate Association.txt", true);
			
			objF.write("House # " +x);
			objF.write(obj.getId() + " ");
			objF.write(obj.getPrice() + " ");
			objF.write(obj.getLocation() + " ");
			objF.write(obj.getAdvertiser() + " ");
			objF.write("-----------------------------------------\n");
			objF.close();

		} catch (IOException e) 
		{
			System.err.println("An error occured while opening the file");
		}
		
	}

}

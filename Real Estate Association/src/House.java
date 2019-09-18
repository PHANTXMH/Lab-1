//MARCAL HARRISON 1703882

import java.util.Scanner;

/**
 * @author 1703882
 *
 */
public class House 
{
	private int id;
	private float price;
	private String location;
	private String advertiser;
	private Photo image;
	
	
	
	public House()
	{
		id = 0;
		price = 0.00f;
		location = "N/A";
		advertiser = "N/A";
		image = new Photo(0,0);
		
	}

	public House(int id, int size, int id2, float price, String location, String advertiser, Photo image) {
		
		id = id2;
		this.price = price;
		this.location = location;
		this.advertiser = advertiser;
		this.image = image;		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getAdvertiser() {
		return advertiser;
	}

	public void setAdvertiser(String advertiser) {
		this.advertiser = advertiser;
	}

	public Photo getImage() {
		return image;
	}

	public void setImage(Photo image) {
		this.image = image;
	}	
	
	public void enterinfo()
	{
		Scanner in = new Scanner(System.in);
		int pid, size;		
		Photo image;			
	
		
		System.out.println("Enter the house ID#: ");
		setId(in.nextInt());
		System.out.println("Enter the price: ");
		setPrice(in.nextFloat());
		System.out.println("Enter location: ");
		setLocation(in.next());
		System.out.println("Enter advertiser: ");
		setAdvertiser(in.next());
		System.out.println("Enter picture ID: ");
		pid = in.nextInt();
		System.out.println("Enter picture size");
		size = in.nextInt();
		
		image = new Photo(pid, size); 
		setImage(image);		
		
		
	
	}
	
	
	
	
}

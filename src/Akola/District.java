package Akola;

public class District extends City {
	public static void main(String args[]) {
		City c=new City();
		c.age=21;
		System.out.println(c.age);
		
		c.location="Pune";
		System.out.println(c.location);
		
		c.name="Akurdi";
		System.out.println(c.name);
	}

}

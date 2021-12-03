
public class Trader {

	String name;
	String city;
	
	Trader(String name,String city)
	{
		this.name=name;
		this.city=city;
		
	}

	@Override
	public String toString() {
		return "Trader [name=" + name + ", city=" + city + "]";
	}
	
}

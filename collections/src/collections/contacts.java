package collections;

public class contacts {
	 Long phone;
	 String Name;
	 String Email;
	 Enum Gender;
	
	public contacts(Long phone,String Name,String Email,Enum Gender) {
		this.phone=phone;
		this.Name=Name;
		this.Email=Email;
		this.Gender=Gender;
	}

	@Override
	public String toString() {
		return "contacts [phone=" + phone + ", Name=" + Name + ", Email=" + Email + ", Gender=" + Gender + "]";
	}
	
}

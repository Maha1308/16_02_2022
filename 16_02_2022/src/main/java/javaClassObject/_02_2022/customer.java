package javaClassObject._02_2022;

public class customer {
	int id;
	String name;
	String address;
	String number;

	public customer()
	{
		id=4567;
		name="Harini";
		address= "Tamilnadu";
		number= "9876546369";

	}
	public void getcustomer()

	{
		System.out.println("custmer_id:\n"+id);
		System.out.println("custmer_name:\n"+name);
		System.out.println("custmer_address:\n"+address);
		System.out.println("custmer_number:\n"+number);
	}
	public static void main(String[] args) {

		customer customers= new customer();
	
		customers.getcustomer();
	

	}

}

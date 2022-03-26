package javaClassObject._02_2022;

public class phone {
	String model;
	String manufacture;
	String color;
	double price;
	public phone()
	{
		model="SM-G960U1";
		manufacture="Samsung";
		color= "black";
		price=12999.654;

	}
	public void getphone()
	{
		System.out.println("phone_model="+model);
		System.out.println("phone_manufacture="+manufacture);
		System.out.println("phone_color="+color);
		System.out.println("phone_price="+price);

	}

	public static void main(String[] args) {
		phone phonedetils= new phone();
		phonedetils.getphone();

	}

}

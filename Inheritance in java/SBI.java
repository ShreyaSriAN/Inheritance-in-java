package prog6;

public class SBI implements Bank
{
	String name;
	double principal;
	double period;
	double interest;
	double roi=8.5;
	
	public void getDetails()
	{
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("Enter principal");
		principal=sc.nextDouble();
		System.out.println("Enter period");
		period=sc.nextDouble();
	}
	
	public void calculateInterest()
	{
		interest=(principal*period*roi)/100;
	}
	
	public void getMAmount()
	{
		double mAmount=principal+interest;
		System.out.println(name +" your maturity amount in SBI is Rs."+mAmount+"\n");
	}

	

}

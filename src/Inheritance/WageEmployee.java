package Inheritance;

public class WageEmployee extends Employee1 {
	int hrs;
	float rate,tot;
	WageEmployee()
	{
		super();
		hrs=50;
		rate=200.50f;
		tot=hrs*rate;
		
	}
	double calsal()
	{
		return super.calsal()+tot;
	}
	public String toString()
	{
		return "Name -"+name+"\tYou are a wageemployee your's salary is\t"+calsal();
	}

}

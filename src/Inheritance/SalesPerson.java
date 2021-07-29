package Inheritance;

public class SalesPerson extends WageEmployee {
	int sales;
	float commission;
	String name;
	SalesPerson()
	{
		super();
		sales=500;
		commission=5.0f;
		name="Yuganti";
	}
double calsal()
{
	return super.calsal()+sales+commission;
}
public String toString()
{
	return "Name -"+name+"\tYou are a Salesperson your's salary is\t"+calsal();
}

}

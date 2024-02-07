package test_01;
import java.util.ArrayList;

public class Payroll
{
	ArrayList<Employee> employees;
	
	public Payroll()
	{
		employees = new ArrayList<Employee>();
	}
	
	//Creates a new Employee object of the designated type, and adds it to a list.
	public Employee newEmployee(double pay, String name, int employeeType)
	{
		Employee newlyOnboarded;
		
		if (employeeType == 1)
		{
			newlyOnboarded = new HourlyEmployee(pay, name);
		}
		else if (employeeType == 2)
		{
			newlyOnboarded = new ContractorEmployee(pay, name);
		}
		else
		{
			newlyOnboarded = new SalariedEmployee(pay, name);
		}
		
		employees.add(newlyOnboarded);
		return newlyOnboarded;
	}

	//Sums the pay for all employees.
	public double calculatePayroll()
	{
		double totalPayroll = 0;
		
		for (int i = 0; i < employees.size(); i++) 
		{
			totalPayroll += employees.get(i).fetchPay();
		}
		
		return totalPayroll;
	}
}

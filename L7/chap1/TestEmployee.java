class TestEmployee
{
    public static void main(String[] args)
    {
	int age = 55;
	double salary = 60000.0;

	Employee empl = new Employee("John", "Smith", age, salary);

	System.out.println(" Summary Report:" );
	System.out.println("Name: " + empl.concatName());
	System.out.println("Age: " + empl.getAge());
	System.out.println("Salary: " + empl.getSalary());
	System.out.println("Contri. Limit: " + empl.getLimit());
	System.out.println("Tax Rate: " + empl.getTaxRate());
    }
}

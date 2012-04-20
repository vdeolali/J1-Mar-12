public class Employee
{
    String firstName;
    String lastName;
    int age;
    double salary;
    int limit;
    double taxRate;

    Employee(String firstName, String lastName, int age, double salary)
    {
	this.firstName = firstName;
	this.lastName = lastName;
	this.age = age;
	this.salary = salary;
	updateDerivedValues();
    }

    String concatName()
    {
	return lastName + ", " + firstName;
    }

    private void updateDerivedValues()
    {
	if (age > 50 || salary < 30000.0) limit = 40;
	else limit = 30;
	if (salary > 100000.0) taxRate = 0.35;
	else taxRate = 0.28;
    }

    int getAge() { return age; }
    double getSalary() { return salary; }
    int getLimit() { return limit; }
    double getTaxRate() { return taxRate; }

    void setLimit(int limit) { this.limit = limit; }
    void setTaxRate(double taxRate) { this.taxRate = taxRate; }
}
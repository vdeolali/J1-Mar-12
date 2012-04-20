public class Retirement{
   
    public static void main (String[] args){
	int  age = 30;
	double  salary = 30000.0;
	double  Contrib=0.0 , Cumul=0.0;
	int limit =0;
	int salaryp, contribp, cumulp;

	System.out.print ("______________________________________________________________________________________" + "\n" + "\n"+
			  "Age\t" + "Salary($)\t" + "Limit(%)\t" + "Contribution($) \t" + "Cumul. Contribution ($)"+ "\n" + 
			  "______________________________________________________________________________________" +"\n" );
    
	do {
	   
	    if (age >50) limit =40; 
	    else if (age >40 && age <=50) limit =30;
	    else limit = 25; 
	    Contrib =   (( (double) limit/100.0) * salary);
	    Cumul += Contrib;

	    contribp = (int) Contrib; 
	    salaryp = (int) salary; 
	    cumulp = (int) Cumul; 
	    if ((age % 5)==0)
		System.out.println (age + "\t" + ((int) salaryp) + "\t \t" + limit + "\t \t "+ contribp + "\t \t \t "+ cumulp);
	    salary += ( .03 * salary); 
	    age += 1; 
	} while (age < 61);

	}
}
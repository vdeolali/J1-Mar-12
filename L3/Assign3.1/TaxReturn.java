public class TaxReturn{

	

	public static void main (String[] args){
		int age =36;
		boolean hasDependents = true;
		boolean jointReturn = true;
		boolean categoryA = (!hasDependents && age < 30);
		boolean categoryB = (hasDependents || (age > 45 && jointReturn) );
		boolean categoryC = ((age >= 30 && age <=45) && (!jointReturn || !hasDependents));
	
		System.out.println("'CategoryA'=" +"\""+categoryA+"\""+"\n"+
			 	   "'CategoryB'=" +"\""+categoryB+"\""+"\n"+
				   "'CategoryC'=" +"\""+categoryC+"\""+"\n"
		                   );
	}

}
public class Temperature{

	public static void main(String[] args){
		//Converting degF to degC

		double degC=0.0, degF=75.0;	
	
		degC = (degF - 32)* (5.0/9.0);
		
		System.out.println("Temperature in Fahrenheit =" +degF+ " \n" + "Temperature in Centigrade =" +degC);

		//Converting degC back to degF
		double degFVerify; 

		degFVerify = (degC * 9/5) + 32; 
		System.out.println ("Temperature in Fahrenheit (Verification) =" + degFVerify); 
	}
}
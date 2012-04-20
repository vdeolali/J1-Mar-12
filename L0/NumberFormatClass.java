import java.text.NumberFormat;
import java.util.Scanner;
import java.util.Locale;

public class NumberFormatClass{
    public static void main(String[] args){
	NumberFormat currency  = NumberFormat.getCurrencyInstance();
	NumberFormat number = NumberFormat.getNumberInstance();

	System.out.println("Currency used here  " + currency.format(10.12));
	System.out.println("Number used here  " + number.format(18.99998));

	Locale colombian = new Locale ("co","CO");
	currency  = NumberFormat.getCurrencyInstance(colombian);
	System.out.println("Currency used here  " + currency.format(10.12));
	
	Scanner sc = new Scanner(System.in);
	double amount = sc.nextDouble();
	System.out.println("What is the amount?" );
	System.out.println("Currency used here  " + currency.format(amount));
    }
}
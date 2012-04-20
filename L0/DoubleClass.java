public class DoubleClass{
    public static void main(String[] args){
	//create a double object
	double d = 10.0; //using double primitive
	Double dObject = new Double(d);
	System.out.println(dObject);
	System.out.println(d);
	Double dObject2 = new Double("25.44");
	System.out.println(d);
	System.out.println(dObject2);

	int litLength = "How are you?".length();
	String str1 = "How are you?";
	str1 = "New String?";

	System.out.println(litLength);
	System.out.println(str1.length());
    }
}
